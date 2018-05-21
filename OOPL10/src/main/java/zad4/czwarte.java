/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.util.Random;

/**
 *
 * @author Dawid
 */
public class czwarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int powtorzenie=0,pierwsza,druga,wynik;
       
        Random losowanie = new Random();
        while(powtorzenie<3)
        {
        pierwsza=losowanie.nextInt(21)-10 ;
        druga=losowanie.nextInt(21)-10 ;
        try
        {
        wynik=pierwsza/druga;
        System.out.println(wynik);
        
        }
        catch(ArithmeticException e)
        {   
            System.out.println("Blad");
            powtorzenie++;
        }
    }
    
    }
}
