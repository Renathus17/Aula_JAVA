/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renato.metodo;

/**
 *
 * @author discente
 */
public class Calculadora {

    int valor1 = 10;
    int valor2 = 10;

    void adicao() {

        int resultado = valor1 + valor2;
        System.out.println("O valor da soma é : " + resultado);

    }
    
    void subtracao() {
        
        int resultado = valor1 - valor2;
        System.out.println("O valor da subtração é: "+ resultado);
        
    }
    
    void multiplicacao() {
        
        int resultado = valor1 * valor2;
        System.out.println("O valor da multiplicação é: "+ resultado);
        
    }
    
    void divisao() {
        
        int resultado = valor1 / valor2;
        System.out.println("O valor da divisão é: "+ resultado);
    }
}

