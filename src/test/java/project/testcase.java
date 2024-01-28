package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase {

	@Test
	public void test() {
		
		addition t=new addition();
		int actual=t.sum(60, 40);
		int expected=100;
		assertEquals(expected,actual);
		
		
		
	}

}
