//4 - Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima (aproximadamente) quantos dias de vida ele possui.

import java.util.Scanner;

public class atividadequatro {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome;
        int idade, diasDeVida;
        
        System.out.println("Qual é o seu nome?");
        nome = input.nextLine();
        
        System.out.println("Quantos anos você tem?");
        idade = input.nextInt();
        
        diasDeVida = idade * 365;
        
        System.out.println(nome + ", você tem aproximadamente " + diasDeVida + " dias de vida.");
    }
}