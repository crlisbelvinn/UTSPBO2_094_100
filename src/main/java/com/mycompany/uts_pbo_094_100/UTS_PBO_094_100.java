/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo_094_100;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author xpopow
 */
public class UTS_PBO_094_100 {
    
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;

    public static void Menu(){
        int pilihan =0;
        do {
        System.out.print("\nSilakan Pilh Menu :\n1. Reservasi\n2. Perhitungan Hari ini\n3. Keuntungan\n4. Keluar\nPilih: ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Reservation();
                break;
            case 2: new Inspect();

                break;
            case 3: 
                if (jumlahPengunjung == 0){
                    System.out.println("Harus Reservasi Terlebih Dahulu");
                }else {
                    new Show();
                }
                break;
            default:
                break;
        }
        }while(pilihan == 6);
    }
    public static void main(String[] args) {
      String username;
      String password;
      
      Date date = new Date();
      SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      s.setTimeZone(TimeZone.getTimeZone("GMT+7"));     

      System.out.flush();

      System.out.println("\n--- Halo Selamat Datang di Program Perhotelan ---\n");
      System.out.println("Masukkan Username dan Password untuk masuk.\n");    

      System.out.print("Username: ");
        username = input.nextLine();

      System.out.print("Password: ");
        password = input.nextLine();

        Login login = new Login(username, password);

        if(login.checkPassword()){
            System.out.println("You are logged in!");
            System.out.println("Waktu Masuk : "+s.format(date));
            Menu();
        }else
            System.out.println("The username and password you entered are incorrect.");
    }

}
