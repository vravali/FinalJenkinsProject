package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.vvangala.jenkins.code.SieveOfEratosthenes;

public class Prime3Test {

	@Test
	public void testPrimesList() {
		//Test3
		int b=66;
		SieveOfEratosthenes x = new SieveOfEratosthenes();
		String output = SieveOfEratosthenes.p(SieveOfEratosthenes.primesList(x.Sieve(b),SieveOfEratosthenes.primesCount(x.Sieve(b))));
		String expectedOutput = ("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61]");
		assertEquals(expectedOutput, output);
	}

}
