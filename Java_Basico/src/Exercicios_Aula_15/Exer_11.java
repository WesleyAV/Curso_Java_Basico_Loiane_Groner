/*
As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */
package Exercicios_Aula_15;

import java.util.Scanner;

public class Exer_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário:");
        double salario = scan.nextDouble();
        double newsalario;
        //salários até R$ 280,00 (incluindo) : aumento de 20%
        if (salario <= 280) {
            newsalario = salario + (salario * 20);
            System.out.println("O aumento é de: " + newsalario);
            //salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        } else if (salario > 280 && salario <= 700) {
            newsalario = salario + (salario * 15);
            System.out.println("O aumento é de: " + newsalario);
            //salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        } else if (salario > 700 && salario < 1500) {
            newsalario = salario + (salario * 10);
            System.out.println("O aumento é de: " + newsalario);
        //salários de R$ 1500,00 em diante : aumento de 5%
        } else if (salario >= 1500){
            newsalario = salario + (salario * 5);
            System.out.println("O aumento é de: " + newsalario);
        }
    }
}
