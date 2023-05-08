/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_094_100;

/**
 *
 * @author xpopow
 */
public class Show {
    public Show(){
        System.out.println("Jumlah Pengunjung Diharapkan: " + Math.round(Inspect.totalOmset / Inspect.totalKeuntungan));
        System.out.println("Jumlah Pengunjung: " + UTS_PBO_094_100.jumlahPengunjung);
        System.out.println("Total Keuntungan: " + Inspect.totalKeuntungan);
        UTS_PBO_094_100.Menu();
    }
}
