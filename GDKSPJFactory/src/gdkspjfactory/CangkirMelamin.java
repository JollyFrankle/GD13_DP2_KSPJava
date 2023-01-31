/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdkspjfactory;

/**
 * Jolly Hans Frankle
 * 200710932
 * Praktikum PBO kelas B
 */
public class CangkirMelamin extends Cangkir {
    private String warna;

    public CangkirMelamin(double diameter, double tinggi, String warna) {
        this.diameter = diameter;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    @Override
    public void print() {
        System.out.println("Cangkir Melanin");
        System.out.println("Diameter  : " + diameter);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Warna     : " + warna);
        System.out.println("Volume    : " + getVolume());
    }
}

