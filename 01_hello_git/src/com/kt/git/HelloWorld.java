package com.kt.git;

import com.kt.foo.Foo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");
		
		new Foo().sayFoo();
		System.out.println("Lucky you~"); // #master에서 추가
	}

}
