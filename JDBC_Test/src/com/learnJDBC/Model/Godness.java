package com.learnJDBC.Model;

/**
 * ģ�Ͳ㣬��Ҫ���ṩ��������ݿ��м�¼��ӳ��
 * @author Tang
 *
 */
public class Godness {
	private int id;
	private String user_name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Godness [id=" + id + ", user_name=" + user_name + ", age="
				+ age + "]";
	}
	
}
