package com.oreilly.demo;

import org.springframework.stereotype.Service;

@Service
public class PrintService {

	public void print(String message){
		System.out.println(message);
	}
}
