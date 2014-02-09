
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author familia
 */
public class Matriz5x6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
       int matriz [][];
       int sumaTotal=0;
       int sumaFila[];
       int sumaCol[];
       
       matriz = new int [5][6];
       sumaFila = new int [5];
       sumaCol = new int [6];
       
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                System.out.println("Ingrese el valor de la posicion: " + i + ":" + j + ":" );
                matriz[i][j]=leer.nextInt();
                
                sumaFila[i] = sumaFila[i] + matriz[i][j];
                sumaCol[j] = sumaCol[j] + matriz[i][j];
                sumaTotal = sumaFila[i] + sumaCol[j];
                        
            }
            
        }
                
        System.out.println("La suma total es: " + sumaTotal);
            
        }
 
            
            
        
    }
    

