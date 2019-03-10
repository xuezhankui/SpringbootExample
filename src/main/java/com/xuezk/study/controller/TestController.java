package com.xuezk.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuezk.study.service.DBService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private DBService dbService;
	@RequestMapping("/db")
    public @ResponseBody String db() {
		dbService.jdbcFindById(1l);
		dbService.jdbcFindByName("a");
		dbService.jpaFindByOrder(1l);
		dbService.jpaOrderGetOne(1l);
		
		dbService.jpaFindByPage(PageRequest.of(1, 2, new Sort(Direction.DESC, "id","name")));
		dbService.jpaFindByDivPage(PageRequest.of(1, 2, new Sort(Direction.DESC, "id","name")),"a");
        return "Hello World";
    }
}
