package com.example.bean;

public class CompanyIdentification {
	private String identificationBasis;

	public String getIdentification() {
		return identificationBasis;
	}
   
	public void setIdentification(String identificationBasis) {
		this.identificationBasis = identificationBasis;
	}
	
	public int calculateCheckNumber(String identificationBasis) {
		// 0737546-2
		// 7  9 10  5  8  4  2
		int checkNumber = 0;
		int multiplicationResults[] = new int[7];
		for (int i = 0; i < 7; i++) {	
			if(i == 0) { multiplicationResults[0] = 7 * Integer.parseInt(identificationBasis.charAt(0)+""); }
			if(i == 1) { multiplicationResults[1] = 9 * Integer.parseInt(identificationBasis.charAt(1)+""); }
			if(i == 2) { multiplicationResults[2] = 10 * Integer.parseInt(identificationBasis.charAt(2)+""); }
			if(i == 3) { multiplicationResults[3] = 5 * Integer.parseInt(identificationBasis.charAt(3)+""); }
			if(i == 4) { multiplicationResults[4] = 8 * Integer.parseInt(identificationBasis.charAt(4)+""); }
			if(i == 5) { multiplicationResults[5] = 4 * Integer.parseInt(identificationBasis.charAt(5)+""); }
			if(i == 6) { multiplicationResults[6] = 2 * Integer.parseInt(identificationBasis.charAt(6)+""); }
		}
		int sum = 0;
		for (int j = 0; j < multiplicationResults.length; j++) {
			sum = sum + multiplicationResults[j];
		}
		int reminder = sum % 11;

		if(reminder >=2 && reminder <= 10) {
			checkNumber = 11- reminder;
		}
		if(reminder == 0) {
			checkNumber = 0;
		}
		return checkNumber;
	}

	
	
}

