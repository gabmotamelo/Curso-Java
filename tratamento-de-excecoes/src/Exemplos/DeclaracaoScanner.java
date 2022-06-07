package Exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeclaracaoScanner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite o valor: ");
            double valor = scanner.nextDouble();
            System.out.println(valor);
        } catch ( InputMismatchException exception){
            System.out.println("ERRO - Digite um número!");
        } finally {

        }
    }

}
