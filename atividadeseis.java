//6 - Faça um programa que calcule a quantidade necessária de latas de tinta para pintar uma parede.
//O programa pergunta a medidas de largura e altura da parede em metros e imprime o resultado (em latas de tinta).
//Considere que o consumo de tinta é de 300 ml por metro quadrado e a quantidade de tinta por lata é de 2 litros.

import java.util.Scanner;

public class atividadeseis {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double largura, altura, area, litrosDeTinta, latasDeTinta;
        final int CONSUMO_DE_TINTA_POR_METRO_QUADRADO = 300;
        final double LITROS_POR_LATA_DE_TINTA = 2.0;
        
        System.out.println("Qual é a largura da parede em metros?");
        largura = input.nextDouble();
        
        System.out.println("Qual é a altura da parede em metros?");
        altura = input.nextDouble();
        
        area = largura * altura;
        
        litrosDeTinta = (area * CONSUMO_DE_TINTA_POR_METRO_QUADRADO) / 1000.0;
        
        latasDeTinta = Math.ceil(litrosDeTinta / LITROS_POR_LATA_DE_TINTA);
        
        System.out.println("Será necessário " + latasDeTinta + " latas de tinta para pintar a parede.");
    }
}