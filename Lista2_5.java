/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_5;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prova1, prova2, trabalho;
        boolean aprovado;
        
        System.out.println("Digite o prova 1: ");
        prova1 = Integer.valueOf(input.nextLine());
        System.out.println(" Digitea a Prova 2: ");
        prova2 = Integer.valueOf(input.nextLine());
        System.out.println(" Digitea o trabalho: ");
        trabalho = Integer.valueOf(input.nextLine());
        
        aprovado =( prova1 >= 6 || prova2 > 6) && (trabalho >= 7);
        
        System.out.println("O aluno foi aprovado: " + aprovado);
        
        
         
                
        
        
        
        // TODO code application logic here
    }
    
}
