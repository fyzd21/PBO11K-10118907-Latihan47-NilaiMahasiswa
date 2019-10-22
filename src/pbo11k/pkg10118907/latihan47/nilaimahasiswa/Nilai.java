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
public class Nilai {
    private double n_quiz, n_uts, n_uas, n_akhir;
    private String keterangan, index;

    public Nilai(double n_quiz, double n_uts, double n_uas) {
        this.n_quiz = n_quiz;
        this.n_uts = n_uts;
        this.n_uas = n_uas;
    }

    public double getNquiz() {
        return n_quiz;
    }

    public double getNuts() {
        return n_uts;
    }

    public double getNuas() {
        return n_uas;
    }

    public double getNakhir() {
        return n_akhir;
    }

    public String getIndex() {
        return index;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public double hitungTotal(double nquiz, double nuts, double nuas) {
        n_akhir = (0.2 * nquiz) + (0.3 * nuts) + (0.5 * nuas);
        return n_akhir;
    }
    
    public String setIndex(double n_akhir) {
        if(80 <= n_akhir && n_akhir <= 100 ) {
            index = "A";
        } else if(68 <= n_akhir && n_akhir < 80 ) {
            index = "B";
        } else if(56 <= n_akhir && n_akhir < 68 ) {
            index = "c";
        } else if(45 <= n_akhir && n_akhir < 56 ) {
            index = "D";
        } else {
            index = "E";
        }
        
        return index;
    }
    
    public String setKeterangan(String index) {
        if(index.equals("A")) {
            keterangan = "Sangat Baik";
        } else if(index.equals("B")) {
            keterangan = "Baik";
        } else if(index.equals("C")) {
            keterangan = "Cukup";
        } else if(index.equals("D")) {
            keterangan = "Kurang";
        } else if(index.equals("E")) {
            keterangan = "Sangat Kurang";
        }
        
        return keterangan;
    }
}
