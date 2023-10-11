package com.example.jaewoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jaewoo.dao.itemMapper;
import com.example.jaewoo.dao.userMapper;
import com.example.jaewoo.vo.itemVO;

@Service
public class itemaddSerivceImpl implements itemaddService {

	@Autowired
	itemMapper mapper;
	
	@Override
	public void itemaddaction(itemVO vo) {
		mapper.itemaddaction(vo);
	}

}
