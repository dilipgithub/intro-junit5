package guru.springframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreatingTest {

	Greating objGreating ;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before ALL");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After ALL");
	}
	
	@BeforeEach
	void setup(){
		objGreating = new Greating();
		System.out.println("==========Start=============");
	}
	
	@AfterEach
	void setup2(){
		System.out.println("==========End=============");
	}
	
	@Test
	void testHelloWorld() {
		
		System.out.println(objGreating.helloWorld());
	}

	@Test
	void testHelloWorldString() {
		
		System.out.println(objGreating.helloWorld("Dilip"));
	}

}
