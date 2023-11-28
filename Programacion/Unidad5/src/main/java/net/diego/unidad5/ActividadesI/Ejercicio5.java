package net.diego.unidad5.ActividadesI;
import java.util.Scanner;

/**
 * @author: Diego Jesus Muñoz Andrade
 * 
 * 1-C Bis
 * 
 * Instituto Tecnológico de La Piedad
 * Ingeniería en Sistemas Computacionales
 * 
 * Fecha de elaboración: 27/11/2020
 * 
 * Conjunto de actividades en clase
 * Actividad 5: 
 */
public class Ejercicio5 {
    /* Metodos graficos */
    public static void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        catch (Exception e) {
            // No hacer nada
        }
    }
    
    private static void lines() {
        System.out.println("------------------------------------------------------------------------");
    }
    
    private static void Interface() {
        clear();
        
        lines();
        System.out.println("1) Realizar un deposito");
        System.out.println("2) Realizar un retiro");
        System.out.println("3) Hacer una consulta de saldo");
        System.out.println("4) Salir\n");
    }
    
    /* Metodos "funcionales" */
    public static boolean check_password(String original, String pass) {
        if(original.equals(pass))
            return true;
        
        return false;
    }
    
    /* Metodo principal */
    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        int opc;
        
        float saldo = 0;
        float retiro = 0;
        
        String name;
        String password;
        String shortpass;
        
        // Inicio de secion
        lines();
        System.out.print("Usuario: ");
        name = in.nextLine();
        System.out.print("Contraseña: ");
        password = in.nextLine();
        
        // Ejecutar
        while(true) {
            // Leer opcion
            Interface();
            
            System.out.print("Opcion >_");
            opc = in.nextInt();
            
            clear();
            
            // Analizar opcion
            switch(opc) {
                case 1: /* Hacer un deposito */
                    float en = 0;
                    
                    lines();
                    System.out.println("DEPOSITO");
                    lines();
                    
                    do {
                        System.out.print("Ingrese la cantidad a depositar: ");
                        en = in.nextFloat();
                        System.out.print("Contraseña: ");
                        shortpass = in.next();
                    }while(en <= 0 || !check_password(password, shortpass));
                    
                    System.out.println("Deposito de "+en+" realizado correctamente :D");
                    System.out.println("Importante: De "+en+" se le ha cobrado $5 !");
                    
                    saldo += en-5;
                    
                    break;
                    
                case 2: /* Retirar */
                    lines();
                    System.out.println("RETIRAR DINERO");
                    if(saldo < 100) {
                        System.out.println("Lo sentimos, su dinero en la cuenta es menor a $100 por lo que no puede retirar dinero :(");
                        break;
                    }
                    
                    do {
                        System.out.print("Dinero a retirar: ");
                        retiro = in.nextFloat();
                        System.out.print("Contraseña: ");
                        shortpass = in.next();    
                    }while(!check_password(password, shortpass) || retiro > saldo - 5);
                    
                    System.out.println("Dinero retirado: "+retiro);
                    System.out.println("Importante: el costo de la operacion fue de $5");
                    
                    saldo -= retiro - 5;
                    
                    break;
                    
                case 3:
                    lines();
                    System.out.println("Consulta de saldo: ");
                    System.out.println("Usted tiene un saldo de $"+saldo);
                    
                    break;
                       
                case 4:
                    return;
                    
                default:
                    System.out.println("Opcion no encontrada!");
                    break;
            }
        }
        
    }
}
