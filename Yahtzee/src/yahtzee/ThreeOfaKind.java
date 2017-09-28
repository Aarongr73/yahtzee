/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class ThreeOfaKind {
    ArrayList<Integer> mylist = new ArrayList<Integer>();
    
    public void jugada(){
        int iguales=0;
        int tiros[]=new int[3];
        int dados[]=new int[5];
        int info[]=new int[2];
        for(int i=0;i<3;++i){
            for(int j=0;j<5-iguales;++j){
                dados[j]=(int)(Math.random()* 6 + 1);
                
            }
            if(iguales==0){
            info=check6(dados);
            tiros[i]=info[0];
            iguales=tiros[i];
            }else if(iguales==2){
                tiros[i]=check3(dados,info);
                iguales=iguales+info[i];
            }
            if(tiros[i]==3){
                mylist.add(1);
                break;
            }
        }
        
    }
    
    public int[] check6(int[] dados){
        int iguales=1;
        int valor=0;
        int info[]=new int[2];
        
        if(dados[0]==dados[1] || dados[0]==dados[2] || dados[0]==dados[3] || dados[0]==dados[4]){
            ++iguales;
            valor=dados[0];
        }
        if((dados[1]==dados[2] || dados[1]==dados[3] || dados[1]==dados[4]) ){
            if(iguales==1 || valor==dados[1]){
              ++iguales;
              valor=dados[1];
            }
        }
        if((dados[2]==dados[3] || dados[2]==dados[4])){
            if(iguales==1 || valor==dados[2]){
              ++iguales;
              valor=dados[2];
            }
            
        }
        if((dados[3]==dados[4])){
            if(iguales==1 || valor==dados[3]){
              ++iguales;
              valor=dados[3];
            }
;
        }

        info[0]=iguales;
        info[1]=valor;
        
        return info;
    }
    public int check3(int[] dados,int[] info){
        int iguales=0;
        if(dados[0]==dados[1] && dados[0]==dados[2])
           iguales=3;
        else if(info[1]==dados[0] && info[1]!=dados[1] && info[1]!=dados[2]){
           iguales=3;
        }else if(info[1]!=dados[0] && info[1]==dados[1] && info[1]!=dados[2]){
           iguales=3;
        }else if(info[1]!=dados[0] && info[1]!=dados[1] && info[1]==dados[2]){
           iguales=3;
        }
        
        return iguales;
    }
    
}
