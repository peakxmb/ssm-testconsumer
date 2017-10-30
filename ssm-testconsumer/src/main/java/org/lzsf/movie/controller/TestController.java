package org.lzsf.movie.controller;

import java.util.List;

import org.lzsf.movie.po.Test;
import org.lzsf.movie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/findList")
	public List<Test> findList(){
		List<Test> list = testService.findList();
		return list;
	}
  }
