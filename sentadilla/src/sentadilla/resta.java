package sentadilla;

import java.util.Scanner;

import java.util.Scanner;

public class resta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		
		int resta = num1 - num2;
		System.out.println("La resta de " + num1 + " y " + num2 + " es igual a " + resta);
	}
}

