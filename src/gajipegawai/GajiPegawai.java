/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajipegawai;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk penggajian pegawai
 * disalah satu perusahaan
 * 
 */
public class GajiPegawai {

   String nama;
   String alamat;
   int uangTransport;
   int uangTunjangan;
   int gajiPokok;
   int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return uangTunjangan + uangTransport + gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
   
   public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
      return totalGaji;
   }
   
   public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Uang Transport Rp." + uangTransport);
        System.out.println("Uang Tunjangan Rp." + uangTunjangan);
        System.out.println("Gaji Pokok Rp." + gajiPokok);
        System.out.println("Total gaji Rp." + totalGaji);
   }
    
}
