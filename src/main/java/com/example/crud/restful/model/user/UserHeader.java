package com.example.crud.restful.model.user;

import com.example.crud.model.Head;

public class UserHeader {
	public Head head;
	
	public UserBody body;
	
	public UserHeader() {}
	
	public UserHeader(Head head, UserBody body) {
		this.head = head;
		this.body = body;
	}
}
