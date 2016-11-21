/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacorrente;

/**
 *
 * @author aluno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contacorrente cc = new Contacorrente();
        cc.setSaldo(2000);
        cc.MostraSaldo();
       cc.sacar(200);
    
    
}
}
