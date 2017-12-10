package com.bdqn.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	
	/**
	 * ,method=RequestMethod.POST  仅仅处理POST请求
	 * params= {"name"}  可以对参数进行约定，要求要某某参数，可以规定参数的值等于...
	 * @return
	 */
	@RequestMapping(value="/helloworld",params= {"name=13"})
	public String hello() {
		System.out.println("进来了");
		return "suc";
	}
	
	
	/*
	 * ？代表 0 或者 1
	 * * 代表一层任意字符串
	 * ** 代表多层的含义
	 */
	@RequestMapping(value="/ant/?/haha")
	public String ant() {
		
		return "suc";
		
	}
	
	/**
	 * ${param}  rest 风格
	 * 可以表达 p=v p!=v
	 * ...
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/rest/{id}")
	public String restTest(@PathVariable(name="id")int id) {
		System.out.println("id ====" + id);
		return "suc";
	}
}
