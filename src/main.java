/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import Numeros.Operaciones;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones op1 = new Operaciones(2,4);
        System.out.println(op1.getNum1());
        op1.setNum1(5);
        System.out.println(op1.getNum1());
        op1.Sumar();
    }
    
}
