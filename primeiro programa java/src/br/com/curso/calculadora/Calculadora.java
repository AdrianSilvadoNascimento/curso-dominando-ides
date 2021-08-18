package br.com.curso.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextDouble();
		
		double soma = soma (a,b);
		
		double subtracao = subtracao (a,b);
		
		double divisao = divisao (a,b);
		
		double multiplicacao = multiplicacao (a,b);
		
		
		System.out.println("A soma de A e B é: " + soma);
		System.out.println("A subtracao de A e B é: " + subtracao);
		System.out.println("A divisao de A e B é: " + divisao);
		System.out.println("A multiplicacao de A e B é: " + multiplicacao);
		
	}
	
	public static double soma (double a, double b) {
		return a + b;
	}
	
	public static double subtracao (double a, double b) {
		return a - b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
	public static double multiplicacao (double a, double b) {
		return a * b;
	}

}
