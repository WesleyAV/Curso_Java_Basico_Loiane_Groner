/*
Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a.");
        double a = scan.nextDouble();

        System.out.println("Informe o valor de b.");
        double b = scan.nextDouble();

        System.out.println("Informe o valor de c.");
        double c = scan.nextDouble();

        double delta;

        double x1;

        double x2;

        /*a. Se o usuário informar o valor de A igual a zero, a equação não é
        do segundo grau e o programa não deve fazer pedir os demais
        valores, sendo encerrado;
         */
        if (a == 0) {
            System.out.println("A equação não é de 2º grau.");
        } else if () {

        }

    }
}
