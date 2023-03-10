package practice;

import org.testng.annotations.Test;

public class Practice2 {
	@Test
	void test1() {
		
		System.out.println("C2,test1===>Test abc");
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		System.out.println(url);
		System.out.println(browser);
	}
	@Test
	void test2() {
		System.out.println("C2,test2===>Test cde");
	}
	@Test
	void test3() {
		System.out.println("C2,test3===>Test efg");
	}
	@Test
	void test4() {
		System.out.println("C2,test3====>Test ghi");
	}
	@Test
	void test5() {
		System.out.println("C2,test5===>Test ijk");
	}
}
