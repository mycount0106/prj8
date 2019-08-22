package com.woniu.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.service.IProvinceService;

@Controller
@RequestMapping("/province")
public class ProvinceController {
    @Resource
	private IProvinceService provinceService;
    @RequestMapping("findAll")
    @ResponseBody
    public String findAll() throws JsonProcessingException {
    	List list = provinceService.findAll();
    	ObjectMapper obj=new ObjectMapper();
    	String json = obj.writeValueAsString(list);
    	//System.out.println(json);
    	return json;
    }
}
