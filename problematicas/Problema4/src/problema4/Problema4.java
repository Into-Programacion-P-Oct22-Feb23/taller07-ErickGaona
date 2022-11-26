/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author Gaoneiz
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador =1;
        String signo ="";
        String mensaje = "";
        int denominador =1;
        
        while(contador <=10){
            if(contador %2==0){
                signo = "+";
               
            
            }else{
                signo = "-";           
            
            }
        mensaje = mensaje + signo +" " +"1/"+ denominador +" " ;
        contador = contador +1;
        denominador= denominador +1;
        
        
        }
        System.out.println("1. "+mensaje);
    }
    
}
