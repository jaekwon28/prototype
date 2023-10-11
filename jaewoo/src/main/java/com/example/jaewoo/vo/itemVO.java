package com.example.jaewoo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class itemVO {

	public String productnum;
	public String productname;
	public String price;
	public String categoryid;
	
	public itemVO(String productnum, String productname, String price, String categoryid) {
		this.productnum = productnum;
		this.productname = productname;
		this.price = price;
		this.categoryid = categoryid;
	}
	
	public itemVO(itemaddDTO dto) {
		this.productnum = dto.productnum;
		this.productname = dto.productname;
		this.price = dto.price;
		this.categoryid = dto.categoryid;
	}
}
