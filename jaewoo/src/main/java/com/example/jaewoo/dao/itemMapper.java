package com.example.jaewoo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.jaewoo.vo.itemVO;

@Mapper
public interface itemMapper {

	public void itemaddaction(itemVO vo);
}
