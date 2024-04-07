/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utspraktikum_pbo.nilaipositifnegatif;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class NilaiPositifNegatif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        int total = 0;
        int bilangan;
        int jumlahBilangan = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukan nilai 0:");

        while (true) {
            bilangan = scanner.nextInt();

            if (bilangan == 0) {
                break;
            }

            if (bilangan > 0) {
                jumlahPositif++;
            } else if (bilangan < 0) {
                jumlahNegatif++;
            }

            total += bilangan;
            jumlahBilangan++;
        }

        if (jumlahBilangan == 0) {
            System.out.println("Tidak ada bilangan yang dimasukkan.");
        } else {
            double rataRata = (double) total / jumlahBilangan;

            System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
            System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata-rata adalah " + rataRata);
        }

        scanner.close();
    }
}
