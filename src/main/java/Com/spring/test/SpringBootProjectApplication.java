package Com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		int a = 10;
		int b =10;
		int c = a+b;
		
		
		System.out.println("Addition =" + c);
	}

}
