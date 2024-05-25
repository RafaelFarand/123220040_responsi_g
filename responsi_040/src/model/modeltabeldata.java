/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class modeltabeldata extends AbstractTableModel{

    List<Datapenitipan>datapenitipan;
    String kolom [] = {"ID","Nama Pemilik","Nama hewan","Jenis","Nomor telp","Durasi","Total"};

    public modeltabeldata(List<Datapenitipan>datapenitipan) {
        this datapenitipan = datapenitipan;
    }
    
            
    
    @Override
    public int getRowCount() {
        return datapenitipan.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return
        datapenitipan.getClass(rowIndex).getId();
                 case 1 :
                return
        datapenitipan.getClass(rowIndex).getnamap();
                 case 2 :
                return
        datapenitipan.getClass(rowIndex).getnamah();
                 case 3 :
                return
        datapenitipan.getClass(rowIndex).getjenish();
                 case 4 :
                return
        datapenitipan.getClass(rowIndex).gettelp();
                 case 5 :
                return
        datapenitipan.getClass(rowIndex).getdurasi();
                 case 6 :
                return
        datapenitipan.getClass(rowIndex).gettotal();
                 default :
                 return null;
        }
      
    }
    
}
