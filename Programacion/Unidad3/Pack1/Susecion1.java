package net.diego.unit3.EjerciciosConCiclos;

/* 
 * Problema:
 * Realice un programa que calcule la suma siguiente
 * 200 + 197+ + 194 +… +3 + 0 en este orden.
*/
public class Susecion1 {
    public static void main(String[] args) {
        // Variables
        int contador = 0, acumulador = 0;
        
        // Mainloop
        for(contador = 200; contador >= 0; contador -= 3) {
            System.out.println(contador+": "+acumulador);
            acumulador += contador;
        }
    }
}
