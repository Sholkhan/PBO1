/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbouts_2210010568;

/**
 *
 * @author adria
 */
public class Hewan {
   private String nama;
   
   public Hewan(String nama) {
       this.nama = nama;
   }
   
   public String suara() {
       return "Suara tidak diketahui";
   }
   
   public String getNama() {
       return nama;
   }
   
   public void setNama(String nama) {
       this.nama = nama;
   }
}
