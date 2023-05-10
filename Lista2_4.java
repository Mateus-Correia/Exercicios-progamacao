/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_4;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float altura, peso, imc;
         boolean imc2;
         
         System.out.println("Digite o peso: ");
         peso = Float.valueOf(input.nextLine());
         System.out.println(" Digitea a altura: ");
         altura = Float.valueOf(input.nextLine());
         
          imc = peso/(altura * altura);
          imc2 = imc > 25;
          
          System.out.println(" O seu IMC é de: "+ imc);
          System.out.println("Esta no peso ideal?? " + imc2);
          
          
          
         
        
         
         
        // TODO code application logic here
    }
    
}
