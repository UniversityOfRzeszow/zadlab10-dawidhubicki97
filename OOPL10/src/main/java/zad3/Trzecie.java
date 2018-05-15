/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Trzecie {

public void dzielenieprzezzero(int liczba,int dzielnik){
    try
    {
     int wynik=liczba/dzielnik;
        System.out.println("Wynik dzielenia liczb:"+liczba+" Oraz: "+dzielnik+ "to "+wynik);
    }
    catch(java.lang.Exception e)
    {
      System.out.println("Nie mozna przez 0 "  );
    }
    }
    


   public static void main(String[] args) {
     
    /* int liczba,dzielnik;
        Scanner odczyt = new Scanner(System.in);
     System.out.println("Podaj liczbe : ");
        liczba=odczyt.nextInt();
        System.out.println("Podaj dzielnik : ");
        dzielnik=odczyt.nextInt();*/
    Trzecie trzecie=new Trzecie();
    for(int i=0;i<10;i++)
     {
     for(int j=0;j<10;j++)
     {
     trzecie.dzielenieprzezzero(i, j);
     }
     }
}
}