package edu.vvangala.jenkins.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prime1Test {

	@Test
	public void testPrimesList() {
		//Test1
		int b=10;
		SieveOfEratosthenes x = new SieveOfEratosthenes();
		boolean[] y = x.Sieve(b);
		int z = x.primesCount(y);
		int aa[] = x.primesList(y, z);
		String output = x.p(aa);
		String expectedOutput = ("[2, 3, 5, 7]");
		assertEquals(expectedOutput, output);
		
		//Test2
		int b1=75;
		SieveOfEratosthenes x1 = new SieveOfEratosthenes();
		boolean[] y1 = x1.Sieve(b1);
		int z1 = x1.primesCount(y1);
		int aa1[] = x1.primesList(y1, z1);
		String output1 = x1.p(aa1);
		String expectedOutput1 = ("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73]");
		assertEquals(expectedOutput1, output1);
		
		//Test3
		int b2=66;
		SieveOfEratosthenes x2 = new SieveOfEratosthenes();
		boolean[] y2 = x2.Sieve(b2);
		int z2 = x2.primesCount(y2);
		int aa2[] = x2.primesList(y2, z2);
		String output2 = x2.p(aa2);
		String expectedOutput2 = ("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61]");
		assertEquals(expectedOutput2, output2);
		
	}

}
