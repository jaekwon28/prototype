package com.example.jaewoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jaewoo.service.itemaddService;
import com.example.jaewoo.vo.itemVO;
import com.example.jaewoo.vo.itemaddDTO;

@RestController
@RequestMapping("/api/item")
public class ItemController {

	@Autowired
	itemaddService service;
	
	@PostMapping(value="add")
	public itemVO itemaddaction(@RequestBody itemaddDTO dto) {
		itemVO add = new itemVO(dto);
		service.itemaddaction(add);
		return add;
	}
}
