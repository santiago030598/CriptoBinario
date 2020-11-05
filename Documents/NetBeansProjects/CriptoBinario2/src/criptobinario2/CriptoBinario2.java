/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptobinario2;

import javax.swing.JOptionPane;

public class CriptoBinario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cifrar cifrar = new Cifrar();
        Descifrar descifrar = new Descifrar();
        String mensaje = JOptionPane.showInputDialog("Cifrado de CriptoBinario\n\nPara iniciar ingrese el mensaje:");
        String ingreso = JOptionPane.showInputDialog("Para cifrar ingrese 1 o Para descifrar 2:");
        int accion = Integer.parseInt(ingreso);
        
        if (accion==1){
           cifrar.sMensaje = mensaje;
           cifrar.cifrado();
        }
        else if(accion==2){
           descifrar.sMensaje = mensaje;
           descifrar.descifrado();
        }
    }
        // TODO code application logic here
    }
    

