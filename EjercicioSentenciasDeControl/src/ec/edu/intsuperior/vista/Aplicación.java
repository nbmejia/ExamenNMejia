/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Pais;

/**
 *
 * @author Nelson
 */
public class Aplicación {

    public static void main(String[] args) {

        //System.out.println("Este es mi Proyecto");

        Pais pais1= new Pais("p001","Argentina");
        Pais pais2= new Pais("p002","Brasil");
        Pais pais3= new Pais("p002","Bolivia");
        Pais pais4= new Pais("p003","Chile");
        
        //System.out.println(pais1.getCodigoPais()+" - "+pais1.getNombrePais());
        System.out.println(pais2.toString());
    }
}
