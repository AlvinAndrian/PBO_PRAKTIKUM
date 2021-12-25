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
public class Main  {
    public static void main(String[] args) {
        Thread KasirA = new Thread(new KasirA("Kasir 1"));
        KasirA.start();
        Thread KasirB = new Thread(new KasirB("Kasir 2"));
        KasirB.start();
    }
}
