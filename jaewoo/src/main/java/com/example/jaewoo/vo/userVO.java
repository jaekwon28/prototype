package com.example.jaewoo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class userVO {

	public String id;
	public String password;
	public String name;
	public String telnum;
	public String email;
	public String gender;
	
	public userVO(String id, String password, String name, String telnum, String email, String gender){
		this.id = id;
		this.password = password;
		this.name = name;
		this.telnum = telnum;
		this.email = email;
		this.gender = gender;
	}
	
	public userVO(joinDTO dto) {
		this.id = dto.id;
		this.password = dto.password;
		this.name = dto.name;
		this.telnum = dto.telnum;
		this.email = dto.email;
		this.gender = dto.gender;
	}
}
