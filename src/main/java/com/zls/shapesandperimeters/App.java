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
public class App {
    

    
    public class Square extends Shape {
        private final double length;
        
        public Square(double length){
            this.length = length;
        }
        
        @Override
        public double getArea() {
           return length*length;
        }

        @Override
        public double getPerimeter() {
            return 4 * length; 
        }

    }
    
    public static void main(String[] args) {
        
    }
}
