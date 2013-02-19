package neem.fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class FibonacciTest {
	private Fibonacci testObject;
	
	@Before
	public void setUp() {
		int maxValue = 100;
		testObject = new Fibonacci(maxValue);	
	}
	
	@Test
		public void testGenerateFibonacci() {
			//Assemble
			List<Integer> actualFib = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
			//Act
			List<Integer> testFib = testObject.generateFibonacci(100);
			
			//Assert
			assertEquals(testFib, actualFib);
		}

	@Test
		public void testSumEvens() {
			//Assemble
			Integer actualSum = 44;
			List<Integer> testList = Arrays.asList(1, 2, 3, 5, 8, 13, 21, 34, 55, 89);
			
			//Act
			Integer testSum = testObject.sumEvens(testList);
			
			//Assert
			assertEquals(actualSum, testSum);
		}
	
	@Test
	public void testOutput() {
		//Assemble
		List<Integer> testList = testObject.generateFibonacci(4000000);
		Integer finalSum = testObject.sumEvens(testList);
		System.out.println(finalSum);
	}
}
