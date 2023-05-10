/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_3;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float preco, conta, contaatraso, cont, quilowats;
        boolean consumo;
        
        System.out.println("Digite o preco: ");
        preco  = Float.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de quilowats");
        quilowats = Float.valueOf(input.nextLine());
        
        conta = (Float) preco * quilowats;
        contaatraso = (Float)conta*10/100;
        cont = conta + contaatraso;
        consumo = quilowats>70;
        
        System.out.println("A conta foi de: " + conta);
        System.out.println("Com atraso, seu preco ficou: " + cont);
        System.out.println(" O consumo foi elevado: " + consumo);
        
        
        // TODO code application logic here
    }
    
}
