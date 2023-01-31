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
public abstract class Cangkir {
    protected double diameter;
    protected double tinggi;

    public double getVolume() {
        return Math.PI * Math.pow(diameter / 2, 2) * tinggi;
    }

    abstract public void print();
}
