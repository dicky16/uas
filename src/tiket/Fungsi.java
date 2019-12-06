/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import static tiket.Data.jenisWisata;
import static tiket.Data.ArrSubTotal;
import static tiket.Data.ArrJumlahTiket;
import static tiket.Data.ArrTanggal;
/**
 *
 * @author djavu
 */
public class Fungsi {
    
   public static int getSubTotal(int a,int b){
        int total = a*b;
        return total;
    }
   public static int getJumlah(int a,int b){
       int total = a+b;
       return total;
   }
   public static int getTotal(int a,int b,int c){
       int total = a+b+c;
       return total;
   } 
   
   public static void setArray(String jenis,String tgl, int subs, int jumlah){
        jenisWisata.add(jenis);
        ArrSubTotal.add(subs);
        ArrJumlahTiket.add(jumlah);
        ArrTanggal.add(tgl);
   }
   public static void delArray(int i){
        jenisWisata.remove(i);
        ArrSubTotal.remove(i);
        ArrJumlahTiket.remove(i);
        ArrTanggal.remove(i);
   }
   public static void delAll(){
        jenisWisata.removeAll(jenisWisata);
        ArrSubTotal.removeAll(ArrSubTotal);
        ArrJumlahTiket.removeAll(ArrJumlahTiket);
        ArrTanggal.removeAll(ArrTanggal);
   }
   
}


