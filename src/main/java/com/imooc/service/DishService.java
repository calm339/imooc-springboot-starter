package com.imooc.service;

import java.util.List;

import com.imooc.pojo.Dishes;

public interface DishService {
	public void save(Dishes dishes) throws Exception;

	public void update(Dishes dishes);

	public void delete(Integer id);

	public Dishes queryById(Integer id);

	public List<Dishes> queryList(Dishes dishes);

	public List<Dishes> queryListPaged(Dishes dishes, Integer page, Integer pageSize);
}
