package neem.fibonacci;

import java.util.*;


public class Fibonacci {
	/*
	 * Fibonacci class can generate the fibonacci sequence up to a user specified number
	 * The sum function will sum up the even numbers in the sequence
	 */
	int maxValue;
	
	public Fibonacci(int highestFibNum) {
		maxValue = highestFibNum;
	}

	public List<Integer> generateFibonacci(int maxValue) {
		/*
		 * Generates the fibonacci sequence up to an interger value
		 */
		int firstValue = 1;
		int secondValue = 2;
		int sum = 0;
		List<Integer> fibSeq = new ArrayList<Integer>();
		fibSeq.add(firstValue);
		
		while (sum<maxValue){
			fibSeq.add(secondValue);
			sum = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = sum;
			
		}
		return fibSeq;
	}

	public Integer sumEvens(List<Integer> fibonacciSequenceList) {
		/*
		 * Generates the sum of the even numbers in the input fibonacci sequence
		 */
		Integer sum = 0;
		for (int index = 0; index < fibonacciSequenceList.size(); index++){
			if (fibonacciSequenceList.get(index) % 2 == 0){
				sum += fibonacciSequenceList.get(index);
			}
		}
		return sum;
	}

}
