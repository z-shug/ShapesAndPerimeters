/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zls.shapesandperimeters;

/**
 *
 * @author zshug
 */
public class Triangle extends Shape {
    
    private final double a,b,c;
    
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
                
    }
    
    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    
}
