/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_exercicio6;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int prova1, prova2, trabalho, frequencia, taxa;
        boolean aprovado;
        
        System.out.println("Digite o prova 1: ");
        prova1 = Integer.valueOf(input.nextLine());
        System.out.println(" Digitea a Prova 2: ");
        prova2 = Integer.valueOf(input.nextLine());
        System.out.println(" Digitea o trabalho: ");
        trabalho = Integer.valueOf(input.nextLine());
        System.out.println("Digite a frequencia: ");
        frequencia =  Integer.valueOf(input.nextLine());
        
        taxa = frequencia*75/100;
        
        aprovado = ( prova1 >= 6 || prova2 >= 6) && (trabalho >= 7 || (trabalho < 6 && taxa > 90)) && (taxa>70);
        
        System.out.println("O aluno foi aprovado: " + aprovado);
        
        
        
         
                
        
        
        // TODO code application logic here
    }
    
}
