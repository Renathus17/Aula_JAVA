/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keylla.metodo;

import java.util.Scanner;


/**
 *
 * @author discente
 */
public class Calculadora {
    Scanner x = new Scanner(System.in);
    
    void adicao() {
        System. out.println("Digite o primeiro valor:");
        int valor1 = x.nextInt();
        System. out.println("Digite o segundo valor:"); 
        int valor2 = x.nextInt();
        
        int resultado = valor1 + valor2;
        System.out.println("O valor da soma é : " + resultado);

    }
    
    void subtracao() {
        System. out.println("Digite o primeiro valor:");
        int valor1 = x.nextInt();
        System. out.println("Digite o segundo valor:"); 
        int valor2 = x.nextInt();
        
        int resultado = valor1 - valor2;
        System.out.println("O valor da subtração é: "+ resultado);
        
    }
    
    void multiplicacao() {
        System. out.println("Digite o primeiro valor:");
        int valor1 = x.nextInt();
        System. out.println("Digite o segundo valor:"); 
        int valor2 = x.nextInt();
        
        int resultado = valor1 * valor2;
        System.out.println("O valor da multiplicação é: "+ resultado);
        
    }
    
    void divisao() {
        System. out.println("Digite o primeiro valor:");
        int valor1 = x.nextInt();
        System. out.println("Digite o segundo valor:"); 
        int valor2 = x.nextInt();
        
        int resultado = valor1 / valor2;
        System.out.println("O valor da divisão é: "+ resultado);
    }
}

