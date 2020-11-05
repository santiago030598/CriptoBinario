/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptobinario2;

/**
 *
 * @author santi
 */
public class Descifrar {
    public String sMensaje;
    public void descifrado(){
        String mensajeDescifrado = "";
        char vBinario [];
        int suma =0;
        
        for (int j=0; j < sMensaje.length(); j=j+8){
           String cadena= sMensaje.substring(j,j+8);
           //System.out.println(cadena+" "+j);
            vBinario = cadena.toCharArray();
            for(int i=0; i < 8; i++){
                if(vBinario[i]== '1'){
                    if (i == 0){
                        suma = suma + 128;
                    }
                    else if (i == 1){
                        suma = suma + 64;
                    }
                    else if (i == 2){
                        suma = suma + 32;
                    }
                    else if (i == 3){
                        suma = suma + 16;
                    }
                    else if (i == 4){
                        suma = suma + 8;
                    }
                    else if (i == 5){
                        suma = suma + 4;
                    }
                    else if (i == 6){
                        suma = suma + 2;
                    }
                    else if (i == 7){
                        suma = suma + 1;
                    }
                }
            }
            char salida = (char) suma;
            mensajeDescifrado = ""+mensajeDescifrado + salida;
            suma = 0;
        }
        System.out.println(mensajeDescifrado);
    }
    
}
