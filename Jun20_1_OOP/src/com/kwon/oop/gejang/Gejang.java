package com.kwon.oop.gejang;

public class Gejang {
	//�̸�
	private String name;
	// ����
	private int price;
	// ������
	public static final String PRODUCER="�����";
	
	//������
	public Gejang() {
		// TODO Auto-generated constructor stub
	}
	//getter,setter
	//�������
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
