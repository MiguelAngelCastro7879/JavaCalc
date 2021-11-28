/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author mike_
 */
public class ClaseCalculadora {

    double res;

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public double suma( double v1, double v2 ){
        res = v1 + v2;
        return res;
    }
    public double resta( double v1, double v2 ){
        res = v1 - v2;
        return res;
    }
    public double multiplicacion( double v1, double v2 ){
        res = v1 * v2;
        return res;
    }
    public double division( double v1, double v2 ){
        res = v1 / v2;
        return res;
    }
    
}
