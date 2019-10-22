/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan nilai mahasiswa menggunakan konsep OOP
 * 
 */
public class PBO11K10118907Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai n = new Nilai(75, 45, 34);
        System.out.println("QUIZ = "+n.getNquiz());
        System.out.println("UTS  = "+n.getNuts());
        System.out.println("UAS  = "+n.getNuas());
        System.out.println("\nNilai Akhir = "+n.hitungTotal(n.getNquiz(), n.getNuts(), n.getNuas()));
        System.out.println("\nIndex = "+n.setIndex(n.getNakhir()));
        System.out.println("Keterangan = "+n.setKeterangan(n.getIndex()));
    }
    
}
