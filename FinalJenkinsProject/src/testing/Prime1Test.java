package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.vvangala.jenkins.code.SieveOfEratosthenes;

public class Prime1Test {

	@Test
	public void testPrimesList() {
		//Test1
		int b=10;
		SieveOfEratosthenes x = new SieveOfEratosthenes();
		String output = SieveOfEratosthenes.p(SieveOfEratosthenes.primesList(x.Sieve(b),SieveOfEratosthenes.primesCount(x.Sieve(b))));
		String expectedOutput = ("[2, 3, 5, 7]");
		assertEquals(expectedOutput, output);
	}

}
