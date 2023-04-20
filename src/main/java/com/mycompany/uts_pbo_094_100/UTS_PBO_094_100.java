/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo_094_100;

import java.util.ArrayList;

/**
 *
 * @author xpopow
 */
public class UTS_PBO_094_100 {
    
    static ArrayList<Room>daftarRoom;
    
    static void menu(){
        System.out.println("Selamat datang di Hotel Jaya Jaya Jaya!!!");
        System.out.println("-----------------------------------------");
        System.out.println("1. Pilih Kamar");
        System.out.println("2.");
        System.out.println("3. Keluar");
    }
    
    public static void main(String[] args) {
        
        daftarRoom = new ArrayList<>();
        
        Room r1 = new Room();
        r1.type = "Economy";
        r1.price = 250.0;
        System.out.println(r1.type);
        System.out.println(r1.price);
        daftarRoom.add(r1);
        
        Room r2 = new Room();
        r2.type = "Business";
        r2.price = 700.0;
        daftarRoom.add(r2);
        
        Room r3 = new Room();
        r3.type = "Suite";
        r3.price = 1300.0;
        daftarRoom.add(r3);
        
        menu();
        
        System.out.println(daftarRoom.get(0));
    }
}
