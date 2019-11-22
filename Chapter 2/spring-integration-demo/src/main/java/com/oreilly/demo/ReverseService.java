package com.oreilly.demo;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

	public void reverse(String message){
		System.out.println(new StringBuilder(message).reverse().toString());
	}
}
