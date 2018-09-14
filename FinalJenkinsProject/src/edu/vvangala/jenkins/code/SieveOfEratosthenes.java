package edu.vvangala.jenkins.code;

import java.util.Arrays;

/**
* 
* @author Veena Vangala
* RSEG - 126
* Assignment 6 - First Jenkins Build
* 
*/


public class SieveOfEratosthenes {

	public static void main(String[] args) {
		String A;  //This is to capture the input string from the build
		int N;  //We need to find all prime numbers less than this number

		//A = args[0]; 
		//N = Integer.parseInt(A); //make the input string to number format
		
		N = 25; //Testing out if the class works as expected

		SieveOfEratosthenes t = new SieveOfEratosthenes();
		boolean[] k = t.Sieve(N);
		int l = t.primesCount(k);
		int m[] = t.primesList(k, l);
		String f = t.p(m);
		
	}

	public boolean[] Sieve(int N) {
		boolean[] isPrime = new boolean[N+1]; //create a boolean array from 0 to N
		for (int c=0; c< N; c++)  //loop thru 0 to N
			isPrime[c] = true;    // and setting them all true - as in not prime
	

		for (int i=2; i*i<=N; i++) { //loop from i to i^2 that's less than N
			if(isPrime[i] == true) {     //if i = true move forward else go to the next i
				
				for (int j=i*2; j<=N; j+=i)  // loop thru multiples of i less than N
					isPrime[j]=false; // set them to false
				
			}
		}
		
		//System.out.println("All the prime numbers less than " + N + " are: ");
		for (int c=2; c<=N; c++) { //loop thru from 2 to N
			if(isPrime[c] == true) {     //if c = true
			//	System.out.print(c + " "); //then print out the c 
								
			}
		}
		
		// this returns whether a number is prime or not with result of T/F
		return isPrime;
	}
	
	public static int primesCount(boolean[] isPrime) {
	    int count = 0;
	    for (boolean prime : isPrime) {
	        if (prime) {
	            count++;
	        }
	    }
	    
	  //  this returns the count of primes based on isPrime = T
	    return count;
	}

	public static int[] primesList(boolean[] isPrime, int N) {
	    int[] listPrimes = new int[N-2];
	    int a = 0;

	    for (int i=2; i<isPrime.length; i++) {
	        if (isPrime[i]) {
	            listPrimes[a] = i;
	            a++;
	        }   
	    }
	    
	   // this returns the list of primes based on isPrimes=T and count of primes -2
	    return listPrimes;
	}
	
	public static String p(int[] listPrimes) {
		String u = Arrays.toString(listPrimes);
		System.out.println(u);
		// this returns the string value of list of primes that can be used for testing purposes.
		return u;
		
	}

}
