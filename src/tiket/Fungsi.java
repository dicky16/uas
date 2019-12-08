/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumn;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static tiket.Data.jenisWisata;
import static tiket.Data.ArrSubTotal;
import static tiket.Data.ArrJumlahTiket;
import static tiket.Data.ArrTanggal;

/**
 *
 * @author djavu
 */
public class Fungsi {

    public static int getSubTotal(int a, int b) {
        int total = a * b;
        return total;
    }

    public static int getJumlah(int a, int b) {
        int total = a + b;
        return total;
    }

    public static int getTotal(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public static void setArray(String jenis, String tgl, int subs, int jumlah) {
        jenisWisata.add(jenis);
        ArrSubTotal.add(subs);
        ArrJumlahTiket.add(jumlah);
        ArrTanggal.add(tgl);
    }

    public static void delArray(int i) {
        if (jenisWisata.size() > 0) {
            jenisWisata.remove(i);
            ArrSubTotal.remove(i);
            ArrJumlahTiket.remove(i);
            ArrTanggal.remove(i);
        }
    }

    public static void delAll() {
        if (jenisWisata.size() > 0) {
            jenisWisata.removeAll(jenisWisata);
            ArrSubTotal.removeAll(ArrSubTotal);
            ArrJumlahTiket.removeAll(ArrJumlahTiket);
            ArrTanggal.removeAll(ArrTanggal);
        }
    }

    public static String setIDR(int var) {
        //rupiah format
        String idr;
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        rp.setCurrencySymbol("IDR. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(rp);
        //end
        idr = rupiah.format(var);
        return idr;
    }

    public static JTable setKolom(JTable tblPembelian) {
        TableColumn column;
        tblPembelian.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tblPembelian.getColumnModel().getColumn(0);
        column.setPreferredWidth(40);
        column = tblPembelian.getColumnModel().getColumn(1);
        column.setPreferredWidth(450);
        column = tblPembelian.getColumnModel().getColumn(2);
        column.setPreferredWidth(120);
        column = tblPembelian.getColumnModel().getColumn(3);
        column.setPreferredWidth(148);
        column = tblPembelian.getColumnModel().getColumn(4);
        column.setPreferredWidth(182);
        return tblPembelian;
    }

    public static void setExportExcel(JTable tblPembelian) {
        FileOutputStream excelFou = null;
        XSSFWorkbook exExporter = null;
        BufferedOutputStream excelBou = null;
        JFileChooser chooser = new JFileChooser("C:\\Users\\djavu\\Desktop");

        chooser.setDialogTitle("Save As");
        FileNameExtensionFilter ex = new FileNameExtensionFilter("EXCEL FILE", "xls", "xlsx", "xlsm");

        chooser.setFileFilter(ex);
        int exChooser = chooser.showSaveDialog(null);
        if (exChooser == JFileChooser.APPROVE_OPTION) {

            try {
                exExporter = new XSSFWorkbook();
                XSSFSheet exSheet = exExporter.createSheet("JTable Sheet");
                for (int i = 0; i < tblPembelian.getRowCount(); i++) {
                    XSSFRow excelRow = exSheet.createRow(i);
                    for (int j = 0; j < tblPembelian.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(tblPembelian.getValueAt(i, j).toString());
                    }
                }
                excelFou = new FileOutputStream(chooser.getSelectedFile() + ".xlsx");
                excelBou = new BufferedOutputStream(excelFou);
                exExporter.write(excelBou);
                JOptionPane.showMessageDialog(null, "Exported Success");
            } catch (FileNotFoundException ex1) {
                ex1.printStackTrace();
            } catch (IOException ex1) {
                ex1.printStackTrace();
            } finally {
                try {
                    if (excelBou != null) {
                        excelBou.close();
                    }
                    if (excelFou != null) {
                        excelFou.close();
                    }

                    if (exExporter != null) {
                        exExporter.close();
                    }

                } catch (IOException ex1) {
                    ex1.printStackTrace();
                }
            }
        }
    }
}
