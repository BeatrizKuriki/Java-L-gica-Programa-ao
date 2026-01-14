package src.application;

import java.util.Locale;
import java.util.Scanner;

public class MainPares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] pares = new int[n];

        for(int i =0; i < pares.length; i++){
            System.out.println("Digite um número:");
            pares[i] = sc.nextInt();
        }
        System.out.println("NÚMEROS PARES:");
        int cont =0;
        for(int i =0; i< pares.length; i++){
            if(pares[i] %2 ==0){
                System.out.print(" " +pares[i]);
                cont++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: " + cont);


    }
}
