/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import nuevoPaquete.Clase2;

/**
 *
 * @author laoratorio
 */
public class JavaApplication2 {

    private int contador;

    /**
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JavaApplication2 jp1 = new JavaApplication2();

        for (jp1.contador = 0; jp1.contador < 10; jp1.contador++) {
            System.out.println("imprimiendo contador \n \n \n" + jp1.contador);
        }

        Clase2 cd1 = new Clase2();
        
        System.out.println("atributos Clase2" +cd1.otraCosa);
        
        ClaseTres ct1 = new ClaseTres();
        System.out.println("atributos ClaseTres"+ct1.prot);
        System.out.println("atributos ClaseTres"+ct1.j);
        
        
    }

}
