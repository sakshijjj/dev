package com.Mavenproject.CriteriaBuliderdemo.warpper;


public class Studentwarpper {

	private String name;
	private int age;
	
	public Studentwarpper() {
		// TODO Auto-generated constructor stub
	}
	public Studentwarpper(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Studentwarpper [name=" + name + ", age=" + age + "]";
	}
}
	
