/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Scanner datos =new Scanner(System.in);
int[][] M=new int[3][3];
        for (int F = 0; F <=2; F++) {
            for (int C = 0; C <=2; C++) {
                if ((F==C) || (F+C==2)) {
                    M[F][C]=1;
                }else{
                 M[F][C]=0;
                      }
                                           
            }
                  
       }
         for (int F = 0; F <=2; F++) {
            for (int C = 0; C <=2; C++) {
                   
      
                    System.out.print( M[F][C]+"-");                             
            }
                    System.out.print( "\n");
       }
        
    }
        
    }
    

