//5 - Escreva um programa que pergunte qual o raio de um círculo e imprima a sua área.

	import java.util.Scanner;

public class atividadecinco {

	    public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        double raio, area;
	        final double PI = 3.14159;
	        
	        System.out.println("Qual é o raio do círculo?");
	        raio = input.nextDouble();
	        
	        area = PI * raio * raio;
	        
	        System.out.println("A área do círculo é: " + area);
	        
	    }
	
}
