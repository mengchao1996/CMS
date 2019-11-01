package com.mc.cms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mc.cms.domain.User;
import com.mc.cms.exception.CMSException;
import com.mc.cms.service.UserService;
import com.mc.cms.vo.UserVO;

//登录注册
@RequestMapping("passport")
@Controller
public class PassportController {
	
	@Resource
	private UserService userService;
	
	//去注册页面
	@GetMapping("reg")
	public String reg() {
		
		return "passport/reg";
		
	}
	//执行注册
	@PostMapping("reg")
	public String reg(Model model,UserVO userVO,RedirectAttributes redirectAttributes ) {
		try {
			//注册成功
			userService.insertSelective(userVO);
		   //把注册的用户在登陆页面进行回显
			redirectAttributes.addFlashAttribute("userVO", userVO);
			
			return "redirect:login";
		}catch (CMSException cms) {
			cms.printStackTrace();
			//封装service抛出异常
			model.addAttribute("error", cms.getMessage());
		}
		catch (Exception e) {
			
			e.printStackTrace();
			//封装没有处理异常
			model.addAttribute("error", "系统异常,请与管理员联系!");
		}
		
	
		
		return "passport/reg";
		
	}
	
	//去登录
	@GetMapping("login")
	public String login() {
		
		return "passport/login";
		
	}


	
	//执行登陆
	@PostMapping("login")
	public String login(Model model ,User user,HttpSession session) {
		 try {
			 //登陆成功
			 User u = userService.login(user);
			 
			 if(u.getRole().equals("0")) {//普通用户
				 session.setAttribute("user", u);//存入session
			     return "redirect:/my/index";//进入个人中心
			 }
			 session.setAttribute("admin", u);//存入session
			 return "redirect:/admin";//进入管理员页面
		}catch (CMSException e) {
			e.printStackTrace();
			model.addAttribute("error",e.getMessage());
		} 
		 catch (Exception e) {
			 e.printStackTrace();
				model.addAttribute("error","系统异常,请于管理员联系");
		}
		
		return "passport/login";
		
	}
	
	/**
	 * 
	 * @Title: logout 
	 * @Description: 注销
	 * @param request
	 * @return
	 * @return: String
	 */
	@GetMapping("logout")
	public String logout(HttpServletRequest request) {
		//false: 如果requst中则不创建session
		HttpSession session = request.getSession(false);
		if(null!=session)
		session.invalidate();
		return "redirect:/passport/login";
	}
}
