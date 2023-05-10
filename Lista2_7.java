/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_7;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        int numero1, numero2, numero3, conta, conta1, menor, menor2, meio;
        
        System.out.println("Digite o numero 1");
        numero1 = Integer.valueOf( input.nextLine());
        System.out.println("Digite o numero 2");
        numero2 = Integer.valueOf( input.nextLine());
        System.out.println("Digite o numero 3");
        numero3 = Integer.valueOf( input.nextLine());
        
        conta = Math.max(numero1, numero2);
        conta1 = Math.max(conta,numero3);
       
        menor = Math.min(numero1, numero2);
        menor2 = Math.min( conta, numero3);
        
        meio = Math.max(conta,menor);
        
        System.out.println("Os valores em ordem sao" + menor2);  
           System.out.println("Os valores em ordem sao" + conta1);  
               
        
        
        
        
        // TODO code application logic here
    }
    
}
