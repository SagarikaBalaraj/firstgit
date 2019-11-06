package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("sagarika","mounika");
		list.forEach(System.out::println);
		
		for(String eachItem:list) {
			System.out.println(eachItem);
		}
		
		Book book=new Book("Java","one");
		System.out.println(book.getBookName());
	}

}
