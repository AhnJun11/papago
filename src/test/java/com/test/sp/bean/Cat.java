package com.test.sp.bean;

public class Cat implements Action {

	@Override
	public void eat() {
		System.out.println("고양이 밥 먹음");
	}

}
