/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class Ejercicio8 {

    /**
     * Modifica el ejercicio anterior #7, para que en lugar de pedir un número,
     * pida un carácter (char) y muestre su código en la tabla ASCII.
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String Letra;
        System.out.println("Digite una letra: ");
        Letra = Teclado.next();

        char Caracter = Letra.charAt(0);
        int Valor_ASCII = (int) Caracter;

        System.out.println("Corresponde a la posicion ASCII: " + Valor_ASCII);
    }

}
