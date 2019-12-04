/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.util.ArrayList;

/**
 *
 * @author djavu
 */
public class GetData {
    private ArrayList<ModelKasir> listData;
 
    public GetData(ArrayList<ModelKasir> list) {
        this.listData = list;
    }
    public static void main (String []args){
        
    }
    public void view (int position){
        ModelKasir model = listData.get(position);
        System.out.println(""+model.getNama());
    }
}
