/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package gdkspjsingleton;

/**
 * Jolly Hans Frankle
 * 200710932
 * Praktikum PBO Kelas B
 */

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Database db;
        System.out.println("Membuat database baru:");
        db = Database.getInstance("localhost", "root", "", "kspj");

        System.out.println("\nMembuat database baru:");
        db = Database.getInstance("127.0.0.1", "kspj", "p@55w0rd", "ksp_javagui");
    }

}
