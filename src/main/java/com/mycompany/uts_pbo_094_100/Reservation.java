/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_094_100;

import java.util.Scanner;

/**
 *
 * @author xpopow
 */
public class Reservation {
    Scanner input = new Scanner(System.in);  // Create a Scanner object

    // Appetizer appetizer = new Appetizer();
    public Reservation(){
        System.out.println("\nOrder Selected!");
        System.out.println("Silakan Pilih Menu:\n1. Economy\n2. Bussiness\n3. Suite\n4. Kembali\nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.flush();
                Economy economy = new Economy();
                economy.Show();
                economy.Menu();
                break;
            case 2:
                System.out.flush();
                Bussiness bussiness = new Bussiness();
                bussiness.Show();
                bussiness.Menu();
                break;
            case 3:
                System.out.flush();
                Suite suite = new Suite();
                suite.Show();
                break;
            case 4:
                UTS_PBO_094_100.Menu();
                break;
            default:
                break;
        }
    }
}
