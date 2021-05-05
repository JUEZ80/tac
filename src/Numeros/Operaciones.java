/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numeros;

/**
 *
 * @author Usuario
 */
public class Operaciones 
{
    //1. Abstraccion - Definicion de los atributos
    private int Num1, Num2, Res;
    
    //2. Polimorfismo Basado en metodos Constructor 
    public Operaciones()
    {
    }
    
    public Operaciones(int n1, int n2)
    {
        this.Num1 = n1;
        this.Num2 = n2;
        this.Res = 0;
    }
    
    //3. Encapsulamiento
    // Get obtener
    public int getnum1()
    {
        return  this.getNum1();
    }
    
    //Set -- colocar el valor
    public void setNum1(int n)
    {
        this.Num1 = n;
    }
    
     /**
     * @return the Num1
     */
    public int getNum1() {
        return Num1;
    }

    /**
     * @return the Num2
     */
    public int getNum2() {
        return Num2;
    }

    /**
     * @param Num2 the Num2 to set
     */
    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }

    /**
     * @return the Res
     */
    public int getRes() {
        return Res;
    }
    
    //4. Metodos
    /**
     * @return Retorna la suma de los dos operandos, no es necesario enviar parametros
     */
    public int Sumar()
    {
        this.Res = this.getNum1() + this.getNum2();
        return this.getRes();
    }
}
