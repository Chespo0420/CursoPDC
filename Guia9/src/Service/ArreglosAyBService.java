/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Chespo
 */
public class ArreglosAyBService {

    public void inicializarA(double[] ArregloA) {
        for (int i = 0; i < 50; i++) {
            ArregloA[i] = (Math.random() * 10);
        }

    }
    
    public void inicializarB(double[] A, double[] B) {
        for (int i = 0; i < B.length; i++) {
            if (i < 10) {
                B[i] = A[i];
            } else {
                // Función de llenado de arreglo
                Arrays.fill(B, 10, B.length , 0.5);
               // B[i] = 0.5;
            }
        }
    }
    
}
