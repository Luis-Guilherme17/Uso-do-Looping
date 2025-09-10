//Olá, meu nome é Luís e hoje eu vou fazer um código com looping.
package com.mycompany.looping;

import java.util.Scanner;
import java.util.Random;

public class Looping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random NRandom = new Random();
        int NumeroAleatório = NRandom.nextInt(1, 6);
       
        int numero = 2;
        int N = scanner.nextInt();
        
        do{
            
        System.out.println("Digite um número de 1 a 5: ");
        N = scanner.nextInt();
        
        if(N != numero){
            System.out.println("Número errado, tente novamente.");
        }
        }while(N != numero);
            System.out.println("Número correto, parabéns!");
        
        scanner.close();
   }
}