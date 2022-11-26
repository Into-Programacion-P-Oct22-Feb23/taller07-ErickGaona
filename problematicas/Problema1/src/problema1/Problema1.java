/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador1 =0;
        int contador =1;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensaje= "";
        String edades= "";
        double promedio_edad = 0;
        double promedio_estatura = 0;
        String opcion;
        boolean bandera = true;
        
        
        do{
            System.out.println("Ingrese el nombre del jugador");
            nombre=entrada.nextLine();
            
            System.out.println("Ingrese posicion del jugador");
            posicion=entrada.nextLine();
            
            System.out.println("Ingrese edad del jugador");
            edad=entrada.nextInt();
            
            System.out.println("Ingrese estatura del jugador");
            estatura=entrada.nextDouble();
            
            mensaje = mensaje + contador +"."+""+"_ "+ nombre+" " 
                    +","+"posicion: "+posicion+", "+"edad: "+edad+","+ 
                    "estatura: ,"+estatura+"\n";
            
            edades = edades + edad + "\n";
            
            promedio_edad = promedio_edad + edad;
            promedio_estatura = promedio_estatura + estatura;
            contador = contador +1;
            contador1 = contador1 +1;
            
            System.out.println("Desea ingresar mas jugadores?? Ingrese N para"
                    + " terminar ");
            entrada.nextLine();
            opcion=entrada.nextLine();
            if (opcion.equals("n")){
                bandera = false;           
            
            }
        }while(bandera);
            
        
        
        promedio_edad = promedio_edad / contador;
        promedio_estatura = promedio_estatura / contador;
        System.out.println("Listado de jugadores\n"+mensaje);
        System.out.println("Listado de edades \n"+edades);
        System.out.printf("Promedio de edades: %.2f\n" , promedio_edad);
        System.out.printf("Promedio de estatura:%.2f\n ",promedio_estatura);
        
        
        
        
        
    }
    }
    

