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
public class CangkirFactory {
    public Cangkir create(String jenis, double diameter, double tinggi, String wrnOrMtf) {
        jenis = jenis.toLowerCase();
        if (jenis.equals("melamin")) {
            return new CangkirMelamin(diameter, tinggi, wrnOrMtf);
        } else if (jenis.equals("kaca")) {
            return new CangkirKaca(diameter, tinggi, wrnOrMtf);
        } else if (jenis.equals("plastik")) {
            return new CangkirPlastik(diameter, tinggi, wrnOrMtf);
        }
        return null;
    }
}
