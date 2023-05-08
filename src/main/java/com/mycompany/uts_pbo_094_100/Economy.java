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
public class Economy {
    public static float harga;
    public void Show(){
        System.out.println("\nThis is Economy Class Menu");
    }

    int[] biayaProduksi = new int[] {350000,400000,450000};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Tipe Kamar:" +
                        "\n1. Kamar Smoking Room " + 1.25*biayaProduksi[0] +
                        "\n2. Kamar Single Bed " + 1.25*biayaProduksi[1] +
                        "\n3. Kamar Twin Bed " + 1.25*biayaProduksi[2] +
                        "\n4.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                harga+=1.25*biayaProduksi[0];
                Menu();
                break;
            case 2:
                harga+=1.25*biayaProduksi[1];
                Menu();
                break;
            case 3:
                harga+=1.25*biayaProduksi[2];
                Menu();
                break;
            case 4:
                new Reservation();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}
