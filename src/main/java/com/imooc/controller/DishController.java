package com.imooc.controller;

import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.Dishes;
import com.imooc.pojo.IMoocJSONResult;
import com.imooc.service.DishService;

@RestController
@RequestMapping("dish")
public class DishController {
	
	@Autowired
	private DishService dishService;
	
	@Autowired
	private Sid sid;
	
	@RequestMapping("/save")
	public IMoocJSONResult save(@RequestBody Dishes dishes) throws Exception {
		dishService.save(dishes);
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/update")
	public IMoocJSONResult update(@RequestBody Dishes dishes) {
		dishService.update(dishes);
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/delete")
	public IMoocJSONResult delete(Integer id) {
		dishService.delete(id);
		return IMoocJSONResult.ok("删除成功");
	}
	
	@RequestMapping("/queryById")
	public IMoocJSONResult queryById(Integer id) {
		return IMoocJSONResult.ok(dishService.queryById(id));
	}
	
	@RequestMapping("/queryList")
	public IMoocJSONResult queryList() {
		Dishes dishes = new Dishes();
		List<Dishes> list = dishService.queryList(dishes);
		return IMoocJSONResult.ok(list);
	}
	
	@RequestMapping("/queryListPaged")
	public IMoocJSONResult queryListPaged(Integer page) {
		if (page == null) {
			page = 1;
		}
		int pageSize = 10;
		Dishes dishes = new Dishes(); 
		List<Dishes> list = dishService.queryListPaged(dishes, page, pageSize);
		return IMoocJSONResult.ok(list);
	}

}
