/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Jhoselin Trujillo
 */
public class cuadrado implements FiguraGeometrica{

    @Override
    public double area() {
        return 16;
    }

    @Override
    public double perimetro() {
        return 15;
    }

    @Override
    public double perimetro(int valor) {
        double va=0;
        va=(valor)*3;
        return valor;
    }

    
}