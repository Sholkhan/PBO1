/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbouts_2210010568;

/**
 *
 * @author adria
 */
public class TesHewan {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing("Budi");
        Hewan hewan2 = new Kucing("Susi");
        
        System.out.println(hewan1.getNama() + " berkata " + hewan1.suara());
        System.out.println(hewan2.getNama() + " berkata " + hewan2.suara());
    }
}
