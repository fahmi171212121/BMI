/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author Antok Knr
 */
public class BMIberaksi {

    public static void main(String[] args) {
        // Misalkan kita ingin menghitung BMI untuk berat 70 kg dan tinggi 1.75 m
        double berat = 40; // berat dalam kg
        double tinggiM = 1.60; // tinggi dalam m

        // Membuat objek BMI
        BMI bmiCalculator = new BMI();

        // Menghitung BMI
        bmiCalculator.hitungBMI(berat, tinggiM);

        // Menampilkan hasil
        System.out.printf("BMI Anda adalah: %.2f\n", bmiCalculator.getBMI());
        System.out.println("Kategori: " + bmiCalculator.getKategori());
    }
}