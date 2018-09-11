package com.xian.springcloud.service.impl;

import com.xian.springcloud.dao.DeptDao;
import com.xian.springcloud.entities.Dept;
import com.xian.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept) {

		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {

		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {

		return dao.findAll();
	}

}
