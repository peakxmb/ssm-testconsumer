package org.lzsf.movie.service;

import java.util.List;

import org.lzsf.movie.mapper.TestMapper;
import org.lzsf.movie.po.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestMapper testMapper;

	@Override
	public List<Test> findList() {
		return testMapper.findList();
	}
}
