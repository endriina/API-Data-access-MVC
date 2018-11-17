/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import ffos.controller.ObradaOperater;

/**
 *
 * @author Korisnik
 */
public class start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObradaOperater op = new ObradaOperater();
        
        op.getOperateri().forEach((o)->{
            System.out.println(o.getPrezime());});
        
    }
    

}