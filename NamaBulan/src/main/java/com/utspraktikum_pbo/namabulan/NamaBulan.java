/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utspraktikum_pbo.namabulan;

/**
 *
 * @author ASUS
 */
import java.util.Random;

public class NamaBulan {

    public static void main(String[] args) {
        // Membuat objek dari kelas Random
        Random rand = new Random();

        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = rand.nextInt(12) + 1;

        // Menampilkan nama bulan sesuai dengan nomor bulan yang dihasilkan
        String namaBulan;
        switch (nomorBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Bulan tidak valid";
                break;
        }

        // Menampilkan hasil
        System.out.println("Nomor Bulan: " + nomorBulan);
        System.out.println("Nama Bulan: " + namaBulan);
    }
}