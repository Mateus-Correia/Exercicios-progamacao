/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2_8;

import java.util.Scanner;

/**
 *
 * @author Mateu
 */
public class Lista2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tempo, distancia;
        boolean perigo;
        
        System.out.println("Digite o tempo: ");
        tempo = Float.valueOf(input.nextLine());
        
        distancia = tempo * 340;
        
        perigo = distancia < 200;
        System.out.println("A distancia foi de: " + distancia);
        System.out.println("Houve perigo:" + perigo);
        
        
        // TODO code applicati;on logic h
    }
    
}
