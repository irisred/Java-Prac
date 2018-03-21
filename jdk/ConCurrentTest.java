package java_prac.jdk

import java.util.concurrent.*;

class ConCurrentTest {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> concurrentHashMap1 = new ConcurrentHashMap<>(50, 0.7, 32);

		boolean isEmpty = concurrentHashMap1.isEmpty();

		System.out.println(isEmpty);
		
		short s1; 
		s1=s1+1;
	}

}
