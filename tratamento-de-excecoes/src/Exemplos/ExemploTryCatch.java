package Exemplos;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um valor inteiro..:");
            int numero1 = scanner.nextInt();
            System.out.print("Digite um valor inteiro..:");
            int numero2 = scanner.nextInt();

            System.out.println(numero1+ " + " + numero2 + " = " + (numero1+numero2));
        } catch (Exception ex) {
            System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        }
    }
}
