/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {

    Scanner odczyt = new Scanner(System.in);
    void wprowadzInt() {
         System.out.println("Wpisz liczbę : ");
        
       try { 
            int a = odczyt.nextInt();
            FileReader freader = new FileReader("plik.txt");
            BufferedReader br = new BufferedReader(freader);
            String output = br.readLine();
            br.close();
            
            FileWriter fwo = new FileWriter("plik.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
            }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }

    void wprowadzString() {
        System.out.println("Wpisz tekst: ");
  
       try { 
            String a =odczyt.nextLine();
            FileReader freader = new FileReader("plik.txt");
            BufferedReader breader = new BufferedReader(freader);
            String output = breader.readLine();
            breader.close();
            
            FileWriter fwo = new FileWriter("plik.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
            }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }

    void wprowadzFloat() {
       try { 
            Float a =odczyt.nextFloat();
            FileReader freader = new FileReader("plik.txt");
            BufferedReader breader = new BufferedReader(freader); 
            String output = breader.readLine();
            breader.close();
            
            FileWriter fwo = new FileWriter("plik.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write((int) (float) a);
            bwo.newLine();
            bwo.close();
       }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }

   

    void wprowadzChar() {
        System.out.println("Wpisz znak: ");

       try { 
            char a = odczyt.next().charAt(0);
            FileReader freader = new FileReader("plik.txt");
            BufferedReader breader = new BufferedReader(freader); 
            String output = breader.readLine();
            breader.close();
            
            FileWriter fwo = new FileWriter("plik.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
       }
       catch (IOException e){
           System.out.println(e.toString());
       }
    }

   

    public static void main(String[] args) {
        WprowadzZKonsoli wprowadz = new WprowadzZKonsoli();
        wprowadz.wprowadzInt();
    }

}
