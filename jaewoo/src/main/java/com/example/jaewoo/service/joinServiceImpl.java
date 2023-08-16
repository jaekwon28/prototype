package com.example.jaewoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jaewoo.dao.userMapper;
import com.example.jaewoo.vo.userVO;

@Service
public class joinServiceImpl implements joinService {

	@Autowired
	userMapper mapper;
	
	@Override
	public void joinaction(userVO vo) {
		mapper.joinaction(vo);
	}

}
