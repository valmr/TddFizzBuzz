package com.fdmgroup.TddFizzBuzz;

public class FizzBuzz {

	private boolean isFizz(int i) {
		return (i % 3) == 0;
	}

	private boolean isBuzz(int i) {
		return (i % 5) == 0;
	}

	private boolean isFizzBuzz(int i) {
		return isFizz(i) && isBuzz(i);
	}

	public String toTarget(int i) {

		String string = "";
		for(int j = 1; j <= i; ++j) {
			if(isFizzBuzz(j))
				string += "FizzBuzz";
			else if(isFizz(j))
				string += "Fizz";
			else if(isBuzz(j))
				string += "Buzz";
			else
				string += j;
			
			if(j != i) string += ",";
		}
		
		return string;
	}

}
