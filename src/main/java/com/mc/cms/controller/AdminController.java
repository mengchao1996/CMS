package com.mc.cms.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mc.cms.domain.Special;
import com.mc.cms.service.SpecialService;
import com.github.pagehelper.PageInfo;
import com.mc.cms.domain.Article;
import com.mc.cms.domain.ArticleWithBLOBs;
import com.mc.cms.domain.User;
import com.mc.cms.service.ArticleService;
import com.mc.cms.service.UserService;
import com.mc.cms.util.PageUtil;


//管理员后台
@RequestMapping("admin")
@Controller
public class AdminController {
	@Resource
	private UserService userService;
	
	@Resource
	private ArticleService articleService;
	
	/*
	 * @Resource private SpecialService specialService;
	 */
	
	@Resource
	private SpecialService specialService;
	
	
	
	//进入后台首页
	@RequestMapping(value = {"index","","/"})
	public String index() {
		
		return "admin/index";
		
	}


	
	/*
	 * //专题列表
	 * 
	 * @GetMapping("special/selects") public String specials(Model model) {
	 * List<Special> list = specialService.selects(); model.addAttribute("specials",
	 * list); return "admin/specials"; }
	 * 
	 * 
	 * 
	 * // 增加专题
	 * 
	 * @GetMapping("special/add") public String add() {
	 * 
	 * return "admin/specialsadd"; }
	 * 
	 * 
	 * 
	 * 
	 * //增加专题
	 * 
	 * @ResponseBody
	 * 
	 * @PostMapping("special/add") public boolean add(Special special) {
	 * 
	 * return specialService.insert(special)>0; }
	 * 
	 * 
	 * 
	 * 
	 * //单个专题
	 * 
	 * @GetMapping("special/select") public String select(Model model ,Integer sid)
	 * { Special special = specialService.select(sid); model.addAttribute("s",
	 * special); return "admin/special"; }
	 * 
	 * 
	 * 
	 * //为专题增加文章
	 * 
	 * @ResponseBody
	 * 
	 * @PostMapping("/special/addArticle") public boolean addArticle(Integer
	 * sid,Integer aid) { return specialService.insertSpecialArticle(sid, aid)>0; }
	 * 
	 * 
	 * 
	 * 
	 * //文章列表
	 * 
	 * @GetMapping("articles") public String users(Model model,Article article
	 * ,@RequestParam(defaultValue = "1")Integer page,
	 * 
	 * @RequestParam(defaultValue = "3")Integer pageSize) { //默认待审
	 * if(article.getStatus()==null) article.setStatus(0);//待审
	 * 
	 * PageInfo<ArticleWithBLOBs> info = articleService.selects(article, page,
	 * pageSize); //调用分页工具 String pages = PageUtil.page(page, info.getPages(),
	 * "/admin/articles?title="+article.getTitle()+"&status="+article.getStatus(),
	 * pageSize); model.addAttribute("articles", info.getList());
	 * model.addAttribute("article", article); model.addAttribute("pages", pages);
	 * model.addAttribute("info", info);
	 * 
	 * return "admin/articles";
	 * 
	 * }
	 * 
	 * 
	 * 
	 * //单个文章详情
	 * 
	 * @GetMapping("article") public String article(Model model,Integer id) {
	 * ArticleWithBLOBs article = articleService.selectByPrimaryKey(id);
	 * model.addAttribute("article",article); return "admin/article";
	 * 
	 * }
	 */
	
	
	//专题列表
	@GetMapping("special/selects")
	public String specials(Model model) {
		//查询专题列表
		List<Special> list = specialService.selects();
		
		//把专题列表中查出来的数据传入页面
		model.addAttribute("specials", list);
		
		//返回页面
		return "admin/specials";
	}


		
	// 增加专题
	@GetMapping("special/add")
	public String add() {
		 
		return "admin/specialsadd";
	}
		


		
	//增加专题
	@ResponseBody
	@PostMapping("special/add")
	public boolean add(Special special) {
		
		return specialService.insert(special)>0;
	}


		
		
	//单个专题
	@GetMapping("special/select")
	public String select(Model model ,Integer sid) {
		Special special = specialService.select(sid);
		model.addAttribute("s", special);
		return "admin/special";
	}
		

		
	//为专题增加文章
	@ResponseBody
	@PostMapping("/special/addArticle")
	public boolean addArticle(Integer sid,Integer aid) {
		return specialService.insertSpecialArticle(sid, aid)>0;
	}
		

		
		
	//文章列表
	@GetMapping("articles")
	public String users(Model model,Article article ,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		 //默认待审
		if(article.getStatus()==null)
		 article.setStatus(0);//待审
		
		PageInfo<ArticleWithBLOBs> info = articleService.selects(article, page, pageSize);
		//调用分页工具
		String pages = PageUtil.page(page, info.getPages(), "/admin/articles?title="+article.getTitle()+"&status="+article.getStatus(), pageSize);
		model.addAttribute("articles", info.getList());
		model.addAttribute("article", article);
		model.addAttribute("pages", pages);
		model.addAttribute("info", info);
		
		return "admin/articles";
		
	}
	
	
	
	//单个文章详情
	@GetMapping("article")
	public String article(Model model,Integer id) {
		ArticleWithBLOBs article = articleService.selectByPrimaryKey(id);
		model.addAttribute("article",article);
		return "admin/article";
		
	}	
	
	// 设置为热门文章
	@ResponseBody
	@RequestMapping("updateArticle")
	public boolean updateArticle(ArticleWithBLOBs article) {
		return articleService.updateByPrimaryKeySelective(article)>0;
	}
	
	// 用户列表
	@GetMapping("users")
	public String users(Model model,@RequestParam(defaultValue = "")String username ,@RequestParam(defaultValue = "1")Integer page,
			@RequestParam(defaultValue = "3")Integer pageSize) {
		
		PageInfo<User> info = userService.selects(username, page, pageSize);
		//调用分页工具
		String pages = PageUtil.page(page, info.getPages(), "/admin/users?username="+username, pageSize);
		model.addAttribute("users", info.getList());
		model.addAttribute("username", username);
		model.addAttribute("pages", pages);
		return "admin/users";
		
	}
	
	//修改用户状态
	@ResponseBody
	@PostMapping("updateUser")
	public boolean updateUser(User user) {
		
		return userService.updateByPrimaryKeySelective(user)>0;
	}
	
	
	
}
