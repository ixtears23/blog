package com.junseok.blog.home.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String getMessage() {
		return "Hello World!";
	}

	public int multiplyNum(int i, int j) {
		return i * j;
	}

	public boolean isIdAvailable(int i) {
		return i == 100;
	}

}
