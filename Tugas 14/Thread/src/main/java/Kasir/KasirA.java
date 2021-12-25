/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir;

/**
 *
 * @author LENOVO
 */
public class KasirA implements Runnable{
    String nama;
// konstruktor
    public KasirA(String id) {
        nama = id;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println(nama + " menangani nomor : " + i);
        }
    }
}
