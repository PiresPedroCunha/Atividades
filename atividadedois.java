//2 - Considerando um programa iniciado pelas instruções: a = 1; b = 2; c = 3;
//Complete-o de modo que, ao final do programa, o conteúdo de A seja 3, de B seja 1 e de C seja 2.
//Use apenas atribuições entre variáveis.




public class atividadedois {

	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // Troca os valores entre as variáveis usando uma variável temporária
        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println("A: " + a); // Deve imprimir "A: 3"
        System.out.println("B: " + b); // Deve imprimir "B: 1"
        System.out.println("C: " + c); // Deve imprimir "C: 2"
	}

}
