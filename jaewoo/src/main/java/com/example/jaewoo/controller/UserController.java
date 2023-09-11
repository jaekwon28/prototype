package com.example.jaewoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jaewoo.service.joinService;
import com.example.jaewoo.vo.joinDTO;
import com.example.jaewoo.vo.userVO;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private joinService service;
	
	@PostMapping(value="/join")
	public userVO joinaction(@RequestBody joinDTO dto) {
		userVO insert = new userVO(dto);
		service.joinaction(insert);
		System.out.println("reset");
		return insert;
	}
}
