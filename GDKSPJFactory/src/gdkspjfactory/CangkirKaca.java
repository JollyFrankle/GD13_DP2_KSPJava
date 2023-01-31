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
public class CangkirKaca extends Cangkir {
    private String motif;

    public CangkirKaca(double diameter, double tinggi, String motif) {
        this.diameter = diameter;
        this.tinggi = tinggi;
        this.motif = motif;
    }

    @Override
    public void print() {
        System.out.println("Cangkir Kaca");
        System.out.println("Diameter  : " + diameter);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Motif     : " + motif);
        System.out.println("Volume    : " + getVolume());
    }
}

