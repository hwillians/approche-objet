package fr.diginamic.operations;

public class Operations {

	public static double calcul(double a, double b, char c) {
		double d = 0;

		switch (c) {
		case ('+'):
			d = a + b;
			break;
		case ('-'):
			d = a - b;
			break;
		case ('*'):
			d = a * b;
			break;
		case ('/'):
			d = a / b;
			break;
		}
		return d;
	}

}
