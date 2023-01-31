/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gdkspjfactory;

/**
 * Jolly Hans Frankle
 * 200710932
 * Praktikum PBO Kelas B
 */

import java.util.Scanner;

public class Testing {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CangkirFactory cf = new CangkirFactory();
        Cangkir[] cangkir = new Cangkir[3];
        cangkir[0] = cf.create("melamin", 10, 20, "Merah");
        cangkir[1] = cf.create("kaca", 7, 20, "Bola");
        cangkir[2] = cf.create("plastik", 10, 14, "Hijau");
        for (Cangkir c : cangkir) {
            c.print();
        }
    }
}
