//1 - Escreva um programa que leia três números e os imprima na ordem inversa da que foram digitados.

import java.util.Scanner;
public class atividadeum {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();
        
        System.out.println("Os números digitados, na ordem inversa, são: " + num3 + ", " + num2 + ", " + num1);
    }
}