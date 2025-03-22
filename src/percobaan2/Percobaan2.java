/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan2;
 // @author lenovo
public class Percobaan2 {
    public static void main(String[] args) {
        String[][] data = {
            {"ABDUL", "\t085646668991", "Kediri"},
            {"KUSNO", "085646668992", "Trenggalek"},
            {"PONIRAN", "085646668999", "Bojonegoro"}
        };

        //Menampilkan header tabel
        System.out.println("NAMA\t\tALAMAT\t\tTELEPON");

        //Menampilkan data
        for (String[] row : data) {
             System.out.println(row[0] + "\t\t" + row[2] + "\t" +row[1]);
}
    }
    
}
