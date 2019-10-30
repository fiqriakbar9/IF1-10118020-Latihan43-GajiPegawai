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
public class Utama {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 no 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.getTotalGaji());
        gp.tampilData(gp.getNama(), gp.getAlamat() , gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.getTotalGaji());
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");        
    }
}
