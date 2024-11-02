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
public class BMI {
    private double bmi;
    private String kategori;

    public void hitungBMI(double berat, double tinggi) {
        bmi = berat / (tinggi * tinggi); // Rumus BMI
        kategori = tentukanKategori(bmi);
    }

    public double getBMI() {
        return bmi;
    }

    public String getKategori() {
        return kategori;
    }

    private String tentukanKategori(double bmi) {
        if (bmi < 18.5) {
            return "Terlalu kurus";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Kegemukan";
        }
    }
}
