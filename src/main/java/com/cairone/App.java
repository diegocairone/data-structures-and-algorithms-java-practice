package com.cairone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		//SpringApplication.run(App.class, args);
		//LinkedList<Integer> dll = new LinkedList<>();
		//dll.add(1);
		int num = 123456789 & 12;
		System.out.println(num);
	}

}
