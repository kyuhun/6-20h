package com.kwon.oop.gejang;

public class Gejang {
	//이름
	private String name;
	// 가격
	private int price;
	// 생산자
	public static final String PRODUCER="김수미";
	
	//생성자
	public Gejang() {
		// TODO Auto-generated constructor stub
	}
	//getter,setter
	//정보출력
	public void dispInfo(){
		System.out.println(name);
		System.out.println(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static String getProducer() {
		return PRODUCER;
	}
	
}
