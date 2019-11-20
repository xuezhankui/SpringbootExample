package com.xuezk.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.xuezk.study.mapper.MemberInfo;
import com.xuezk.study.service.DBService;
import com.xuezk.study.service.MapperService;

@Controller
@RequestMapping("/testmybatis")
public class TestMybatisController {
	@Autowired
	private MapperService dbService;
	@RequestMapping("/db")
    public @ResponseBody String db() {
		MemberInfo info = dbService.findById(1l);
		System.err.println(JSONObject.toJSONString(info));
		
		System.err.println(JSONObject.toJSONString(dbService.jdbcFindByName("a")));
        return "Hello World";
    }
}
