/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gdkspjsingleton;

/**
 * Jolly Hans Frankle
 * 200710932
 * Praktikum PBO kelas B
 */
public class Database {
    private static Database instance = null;
    private String dbHost;
    private String dbUser;
    private String dbPass;
    private String dbName;

    private Database(String dbHost, String dbUser, String dbPass, String dbName) {
        this.dbHost = dbHost;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
        this.dbName = dbName;
    }

    public static Database getInstance(String dbH, String dbU, String dbP, String dbN) {
        if (instance == null) {
            instance = new Database(dbH, dbU, dbP, dbN);
            System.out.println("Database instance created");
            instance.print();
        } else {
            System.out.println("Database instance already created");
            instance.print();
        }
        return instance;
    }

    public void print() {
        System.out.println("DB Host: " + dbHost);
        System.out.println("DB User: " + dbUser);
        System.out.println("DB Pass: " + dbPass);
        System.out.println("DB Name: " + dbName);
    }
}
