package com.example.jaewoo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.jaewoo.vo.userVO;

@Mapper
public interface userMapper {

	//회원가입
	public void joinaction(userVO vo);
}
