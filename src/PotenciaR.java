/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO0464
 */
public class PotenciaR {
    public int potencia(int x,int x2 , int y){
        if(y>1){
            
            
            return potencia(x*x2, x2, y-1);
        }
        if(y==1){
        return x;
        
        }
        return 1;
    }
}
