/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author Gaoneiz
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x= 2;
        int contador=3;
        int contador2=1;
        String mensaje= "";
        while(contador2<=10){
            
            mensaje= mensaje + x+"\n";
            x= x+contador;
            contador = contador +2;
            contador2 = contador2 +1;
            
        
        }
        System.out.println(""+mensaje);
    }
    
}
