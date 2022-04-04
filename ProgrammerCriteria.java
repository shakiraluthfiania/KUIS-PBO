/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kuispbo;

/**
 *
 * @author LENOVO
 */
public class ProgrammerCriteria extends pendaftar implements perhitungan {
public ProgrammerCriteria(String nama, int nilai1, int nilai2, int nilai3) {
super(nama, nilai1, nilai2, nilai3);
    }

    public void setNilai1(int nilai1) {
    this.nilai1 = nilai1;
    }

    public void setNilai2(int nilai2) {
    this.nilai2 = nilai2;
    }

    public void setNilai3(int nilai3) {
    this.nilai3 = nilai3;
    }

    @Override
    public double nilai() {
    return (super.nilai1 * 0.6) + (super.nilai2 * 0.15) + (super.nilai3 * 0.25);
    }

    @Override
    public String keterangan() {
    if(this.nilai() >= 85) return "LULUS\nSelamat kepada " + this.nama + " telah diterima sebagai Programmer";
    else return "GAGAL\nMohon maaf kepada " + this.nama + " telah ditolak sebagai Programmer";
    }
}