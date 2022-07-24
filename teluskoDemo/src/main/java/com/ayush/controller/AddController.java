package com.ayush.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ayush.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int a,@RequestParam("t2") int b) {
	
		AddService as = new AddService(); 
		int k = as.add(a,b); 
		
//		int k = a+b;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		
		return mv;
	}
	
// ********************************* base derivation method *********************************
//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest req, HttpServletResponse resp) {
////		System.out.println("Demo Response ADD called");
//		int a = Integer.parseInt(req.getParameter("t1")) ;
//		int b = Integer.parseInt(req.getParameter("t2")) ;
//		
//		AddService as = new AddService(); 
//		int k = as.add(a,b); 
//		
////		int k = a+b;
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display");
//		mv.addObject("result",k);
//		
//		return mv;
//	}
	
	
}
