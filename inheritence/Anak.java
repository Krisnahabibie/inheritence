/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritence;

/**
 *
 * @author krisn
 */
public class Anak extends Ayah {
    double nilaimax=99.9;
    String nama="joni";
    int age=17;
    
  
       public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi badan "+super.TB);
        super.hobbi();
    }
}
