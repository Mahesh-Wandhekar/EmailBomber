package com.nt.Bind;

import org.springframework.stereotype.Component;

@Component
public class Bind {

	private String email;
	private Integer num;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Bind [email=" + email + ", num=" + num + "]";
	}

	public Bind(String email, Integer num) {
		super();
		this.email = email;
		this.num = num;
	}

	public Bind() {
		super();
		// TODO Auto-generated constructor stub
	}

}
