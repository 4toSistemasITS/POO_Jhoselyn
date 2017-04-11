/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poloformismo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Valeria
 */
public class Main {
    public static void main(String[] args) {
        int opciones;
        int dimension;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese  una opción:\n"+"1 Terreno\n"+ "2 Departamento\n"+"3 casa");
        opciones=sc.nextInt();
        switch(opciones){
            case 1:
                double T=0;
                System.out.println("Ingrese una dimensión");
                Scanner st= new Scanner(System.in);
                dimension=st.nextInt();
                TERRENO_HERENCIA terreno= new TERRENO_HERENCIA();
                terreno.setDimension(dimension);
                T=terreno.avaluar();
                System.out.println(terreno.avaluar());
                System.out.println(terreno.comisionar_venta(T));
                break;
        }
//        if(opciones==1){
//            int t=0;
//            System.out.println("Ingrese una dimensión");
//            Scanner st= new Scanner(System.in);
//            dimension=st.nextInt();
//            TERRENO_HERENCIA terreno= new TERRENO_HERENCIA();
//            terreno.setDimension(dimension);
//            System.out.println(terreno.avaluar());
//            terreno.comisionar_venta();
//        }
    }
}
