package com.ssm.web.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.domain.App;
import com.ssm.service.app.AppService;

@Controller
@RequestMapping("/app/")
public class AppController {
	
	private final static String INDEX = "redirect:/app/list";
	
	@Autowired
	private AppService appService;
	
	@RequestMapping("list")
	public String list(Model model){
		List<App> appList = appService.listApp();
		model.addAttribute("appList",appList);
		return "app/list";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(Model model){
		return "app/add";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(App app,Model model){
		appService.saveApp(app);
		return INDEX;
	}
	
	@RequestMapping(value="edit/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable int id,Model model){
		Map<String,Object> map = new HashMap<>();
		map.put("id", id);
		App app = appService.select(map);
		model.addAttribute("app", app);
		return "app/edit";
	}
	
	@RequestMapping(value="edit",method=RequestMethod.POST)
	public String edit(App app){
		appService.updateApp(app);
		return INDEX;
	}
	
	/**
	 * RESET风格
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id){
		appService.deleteApp(id);
		return INDEX;
	}
	
}
