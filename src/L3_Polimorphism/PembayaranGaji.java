/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3_Polimorphism;

/**
 *
 * @author User
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang; 
    }
    public static void main(String []args){
        PembayaranGaji pg=new PembayaranGaji();
        Staf del=new Staf();
        Direktur aish = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Saf ="+pg.hitungGaji(del));
        System.out.println("Gaji yang dibayarkan kepada Direktur ="+pg.hitungGaji(aish));
    }
}
