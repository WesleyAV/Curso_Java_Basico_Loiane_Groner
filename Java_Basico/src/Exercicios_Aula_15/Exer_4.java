/*
Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        //Switch Case
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal usando Switch");
                break;
            default:
                System.out.println("Consoante usando Switch");
        }

    }
}
