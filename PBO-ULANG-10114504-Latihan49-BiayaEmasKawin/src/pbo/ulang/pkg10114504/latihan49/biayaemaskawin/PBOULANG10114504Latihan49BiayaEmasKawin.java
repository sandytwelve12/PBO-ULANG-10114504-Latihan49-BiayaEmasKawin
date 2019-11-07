/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan49.biayaemaskawin;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Menampilkan Program biaya emas kawin
 */
public class PBOULANG10114504Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();

        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');

        mataUangIndonesi.setDecimalFormatSymbols(formatRP);

        EmasKawin objEmas = new EmasKawin();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ",
                mataUangIndonesia.format(
                        objEmas.perhitungan(objEmas.getHargaGram(),
                                objEmas.getBeratEmas())));
    }
    
       
    
    
}
