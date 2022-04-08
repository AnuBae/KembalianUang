/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kembalianuang;

/**
 *
 * @author rusma
 */
public class KembalianUang {

    /**
     * @param args the command line arguments
     */
    
    public static int[][] Kembalian(int sisa_kembalian){
        //        kumpulan nilai pecahan rupiah
        int kumpulan_pecahan[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int pecahan_kembalian[][] = new int[kumpulan_pecahan.length][2];
        
        for (int i = 0; i < kumpulan_pecahan.length; i++) {
            pecahan_kembalian[i][0] = kumpulan_pecahan[i];
        }
        
//        perulangan untuk menentukan nilai pecahan yang akan digunakan
        int i = 0;
        do{ 
            int j = 0;
            while(sisa_kembalian >= pecahan_kembalian[i][0]){
                sisa_kembalian -= pecahan_kembalian[i][0];
                ++j;
            }
            
            pecahan_kembalian[i][1] = j;
            
            i++;
        }while(100 <= sisa_kembalian);
        
        return pecahan_kembalian;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int kembalian = 505000;
        
        int pecahan_kembalian[][] = Kembalian (kembalian);
        
        System.out.println("Pecahan kembalian yang mesti diberikan:");
        for (int i = 0; i < pecahan_kembalian.length; i++)
        {
            if (pecahan_kembalian[i][1] != 0) {
                System.out.println("Pecahan " + pecahan_kembalian[i][0] + " Sebanyak " + pecahan_kembalian[i][1]);
            }
        }
    }
    
}
