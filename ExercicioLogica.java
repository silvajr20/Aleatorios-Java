package Classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ExercicioLogica {
	
	
	public static int fatorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return n * fatorial(n-1);
		}					
	}
	
	public static int fibbonacci(int n) {
		if(n == 0 || n == 1 || n == 2) {
			return 1;
		}else {
			return fibbonacci(n-2) + fibbonacci(n-1);
		}
	}
	
	
	public static String transformaPalavraArray(String s1, String s2) {
		char v1[], v2[];
		String aux1, aux2;	
		int teste[] = {15,4,3,2,1,0};
		
		v1 = s1.toCharArray();
		Arrays.sort(v1);
		aux1 = Arrays.toString(v1);
		v2 = s2.toCharArray();
		Arrays.sort(v2);
		aux2 = Arrays.toString(v1);
		
		
		Arrays.sort(teste);
		System.out.println("Array de numeros ordenados : "+Arrays.toString(teste));
				
		
		if(aux1.length() == aux2.length()) {
			if(aux1.equals(aux2)) {
				System.out.println("String iguais "+aux1 + " " + aux2);
			}else {
				System.out.println("Strings diferentes "+aux1 + " " + aux2);
			}
			
		}else {
			System.out.println("Tamanho já difere");
		}
		
		
		return aux1+" - "+aux2;
	}
	
	
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);		
		int num;
			
		/*
		System.out.println("Insira um numero para calcular o fatorial: ");
		num = sc.nextInt();
		
		System.out.println("O fatorial do numero inserido é = "+ fatorial(num));
		System.out.println("O fibbonaci do numero inserido é = "+ fibbonacci(num));
		*/
		
		System.out.println(transformaPalavraArray("teste", "teste"));
		
		
		
		
		
	}
	
	
	
	
	
	

}
