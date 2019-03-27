package com.hema.动态代理;

public class UserImp implements User {

	public static void main(String[] args) {

	}

	@Override
	public void add() {
//		System.err.println("权限校验");
		System.out.println("添加功能");
//		System.out.println("日志记录");
	}

	@Override
	public void delete() {
		System.out.println("删除功能");
	}

}
