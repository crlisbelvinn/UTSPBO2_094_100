/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_094_100;

/**
 *
 * @author xpopow
 */
public class Inspect {
    static float totalOmset = Economy.harga + Bussiness.harga + Suite.harga;
    static float totalBiayaProduksi = 0.25f * totalOmset;
    static float gajiKaryawan = 0.5f * totalBiayaProduksi;
    static float wifi = 15000.0f;
    static float pajak = 0.1f * totalOmset;
    static float totalKeuntungan = (totalOmset - totalBiayaProduksi) - pajak;
    public Inspect(){
        System.out.println("Total Omset Penjualan: " + totalOmset);
        System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan + ", " + wifi);
        System.out.println("Biaya Produksi: " + totalBiayaProduksi);
        System.out.println("Biaya Pajak: " + pajak);
        System.out.println("Hasil Laba/Keuntungan Bersih : (totalOmset - BiayaProduksi) -  Pajak = " + totalKeuntungan);
        UTS_PBO_094_100.Menu();
    }
}
