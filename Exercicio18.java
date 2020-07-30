/*
 Escreva um programa que leia o número de um funcionário, seu número de horas 
trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o funcionário
recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, com um espaço em branco antes e 
depois da igualdade.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio18 {
 
    public static void main(String[] args) {
 
        Scanner s = new Scanner (System.in);
        DecimalFormat d = new DecimalFormat("0.00");
      
        int number, hours;
        double valueperhour, salary;
       
            System.out.println("Digite o número do funcionário, a quantidade de horas "
                + "trabalhadas e o quanto ganha por hora, nessa ordem: ");
                number = s.nextInt();
                hours = s.nextInt();
                valueperhour= s.nextDouble();
       
                salary = valueperhour * hours;
       
            System.out.println("NUMBER = " + number);
            System.out.println("SALARY = U$ " + d.format(salary));
       
 
    }
 
}