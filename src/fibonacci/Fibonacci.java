/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série 
de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à 
soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e 
mostre os N primeiros números dessa série.

Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em 
branco. Não deve haver espaço após o último valor.

Exercicio 1151
 */
package fibonacci;



/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
		int n, fib = 1, num = 0, limite;

		n = input.nextInt();

		System.out.print(0);
		System.out.print(" " + 1);
		while (2<n) {
			fib = fib + num;
			num = fib - num;
			System.out.print(" " + fib);
			n -= 1;
		}
		System.out.println("\n");
    }
}
    
    


