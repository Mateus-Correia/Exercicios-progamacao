/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_9;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int compras, valorpago, troco, notas100, notas10, notas1;
         
         System.out.println("Digite o valor da compra: ");
         compras = Integer.valueOf(input.nextLine());
         System.out.println("Digite o valor pago: ");
         valorpago = Integer.valueOf(input.nextLine());
         
         troco = valorpago-compras;
         notas100 = troco/100;
         notas10 = troco%100/10;
         notas1 = troco%100%10;
         
         
         System.out.println("O troco foi de:" + troco);
         System.out.println("A quantidade de notas de 100: " + notas100);
         System.out.println("A quantidsde de notas de 10: " + notas10);
         System.out.println("A quantidade de notas de 1: " + notas1);
         
         
        // TODO code application logic here
    }
    
}
