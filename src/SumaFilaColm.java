
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADSI_455508
 */
public class SumaFilaColm {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int matriz [][];
        int sumaFila[];
        int sumaCol[];
        
        matriz = new int [7][7];       
        sumaFila = new int [7];
        sumaCol = new int [7];
        
        for (int i = 0; i < 7; i++) {
        
            for (int j = 0; j < 7; j++) {
                
                System.out.println("Ingrese el valor de la posicion: " + i + ":" + j + ":" );
                matriz[i][j]=leer.nextInt();
                
                sumaFila[i] = sumaFila[i] + matriz[i][j];
                sumaCol[j] = sumaCol[j] + matriz[i][j];                
            }
        }
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("La suma de las filas es:" + i + " : " + sumaFila[i]);            
        }
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("La suma de las columnas es:" + i + " : " + sumaCol[i]);
        }
        
    }
    
}
