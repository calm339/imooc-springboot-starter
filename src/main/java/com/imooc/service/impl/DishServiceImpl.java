package com.imooc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.imooc.mapper.DishesMapper;
import com.imooc.pojo.Dishes;
import com.imooc.pojo.SysUser;
import com.imooc.service.DishService;

import tk.mybatis.mapper.entity.Example;

@Service
public class DishServiceImpl implements DishService {
	@Autowired
	private DishesMapper dishesMapper;

	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Dishes dishes) throws Exception {
		dishesMapper.insert(dishes);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(Dishes dishes) {
		dishesMapper.updateByPrimaryKeySelective(dishes);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(Integer id) {
		dishesMapper.deleteByPrimaryKey(id);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public Dishes queryById(Integer id) {
		return dishesMapper.selectByPrimaryKey(id);
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Dishes> queryList(Dishes dishes) {
		Example example = new Example(Dishes.class);
		List<Dishes> dishList = dishesMapper.selectByExample(example);

		return dishList;
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Dishes> queryListPaged(Dishes dishes, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		Example example = new Example(SysUser.class);
		List<Dishes> dishList = dishesMapper.selectByExample(example);
		return dishList;
	}

}
