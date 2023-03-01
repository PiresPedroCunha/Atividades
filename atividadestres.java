//3 -  Escreva um programa para simular uma pequena conversa do computador com o usuário. O programa deve seguir os passos:
//a) inicialmente escreve "Olá eu sou o Nº 1, como é seu nome?";
//b) em seguida espera que o usuário digite seu nome;
//c) por fim escreve: "Bem-vindo ao clube (nome)".


import java.util.Scanner;


public class atividadestres {

	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome;
        
        System.out.println("Olá, eu sou o Nº 1, como é seu nome?");
        nome = input.nextLine();
        
        System.out.println("Bem-vindo ao clube, " + nome + "!");
    }
}