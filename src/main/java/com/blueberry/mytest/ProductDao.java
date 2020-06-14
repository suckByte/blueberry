package com.blueberry.mytest;

public class ProductDao {
	
	public void save() {
		System.out.println("save product");
	}
	
	public String update() {
		System.out.println("update product");
		
		return "更新成功";
	}
	
	public void search() {
		System.out.println("search product");
		//int i = 1/0;
	}
	
	public void delete() {
		System.out.println("delete product");
		
	}

}
