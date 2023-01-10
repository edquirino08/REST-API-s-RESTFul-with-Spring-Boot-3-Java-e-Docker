package br.com.rest.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) throws Exception {

		return numberOne + numberTwo;
	}

	public Double subtraction(Double numberOne, Double numberTwo) throws Exception {

		return numberOne - numberTwo;
	}

	public Double multiplication(Double numberOne, Double numberTwo) throws Exception {

		return numberOne * numberTwo;
	}

	public Double division(Double numberOne, Double numberTwo) throws Exception {

		return numberOne / numberTwo;
	}

	public Double mean(Double numberOne, Double numberTwo) throws Exception {

		return (numberOne + numberTwo) / 2;
	}

	public Double pow(Double number) throws Exception {

		return (Math.pow(number, 2));
	}

}
