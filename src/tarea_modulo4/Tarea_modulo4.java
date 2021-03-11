/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_modulo4;
import helpers.Doctor;
import java.util.Locale;
/**
 *
 * @author user
 */
public class Tarea_modulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Doctor doctor = new Doctor();
        
        
        doctor.establecerNombre("Horacio Lorca");
      System.out.println(doctor.retornarNombre());
      
      
      doctor.establecerEdad(28);
      System.out.println(doctor.retornarEdad());
      
      doctor.establecerExp(0);
      System.out.println(doctor.retornarExp());
    }
    
}
