package com.xuezk.study.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.stat.DruidStatManagerFacade;

@Controller
@RequestMapping("/testDruid")
public class TestDruidController {
	@RequestMapping("/db")
    public @ResponseBody List<Map<String, Object>> db() {
		return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
