/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author student
 */
public class Drugie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int liczby[] = { 1, 2, 3 };
 
    try
    {
      int wyswietl = liczby[3];                          
      System.out.println("Liczba to: " + wyswietl);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Poza tablica "  );
    }
    }
    
}
