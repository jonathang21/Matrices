


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADSI_455508
 */
public class Diagonal {
    
    public static void main(String[] args) {
        
       int [][] matriz;
       
       matriz = new int [10][10];
       
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
              if(i==j){
                  
                  matriz[i][j]=1;
              }else {
                  
                  matriz[i][j]=0;
              }                  
            }
        }
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                System.out.print(" | " + matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
}
