/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversaopalavras;

/**
 *
 * @author vitve
 */
import java.util.Scanner;
public class InversaoPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inversor de palavras exemplo: puc mg coreu a saida tem que ser coreu mg puc");
        
        System.out.printf("Digite o número de palavras que você quer: ");
        int numPalavras = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] palavras = new String[numPalavras];
        
        for (int i = 0; i < numPalavras; i++) {
            System.out.println("Digite as palvras que você deseja inverter: ");
            palavras [i]= scanner.nextLine();
            
        }
        System.out.print("Frase invertida: ");
        for (int i = numPalavras - 1;i >= 0; i--){
            System.out.print(palavras[i] + " ");
        }
        
        scanner.close();
    }
}


  
