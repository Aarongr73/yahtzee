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
        int iguales=0,jugada=0,lanzamiento=0;
        boolean revisar=true;
        int tiros[]=new int[3];
        int dados[]=new int[5];
        int info[]=new int[2];
        while(jugada<3 && revisar){
        while(lanzamiento<5-iguales){
                dados[lanzamiento]=(int)(Math.random()* 6 + 1);
                ++lanzamiento;
                
            }
            if(iguales==0){
            info=check5(dados);
            tiros[jugada]=info[0];
            iguales=tiros[jugada];
            }else if(iguales==2){
                tiros[jugada]=check3(dados,info);
                iguales=iguales+tiros[jugada];
            }
            if(tiros[jugada]==3){
                mylist.add(1);
                revisar=false;
            }
            ++jugada;
            if(jugada==3)
                revisar=false;
        }
        
    }
    
    public int[] check5(int[] dados){
        int iguales=0;
        int info[]=new int[2];
        int values[]=new int[6];
        int valor=0;
        
        for(int i=0;i<5;i++){
            int cant=0;
            for(int j=0;j<5;++j){
                if(dados[i]==dados[j]){
                    ++cant;
                }
                values[i]=cant;
            }
            
        }
        int mayor=0;
        for(int i=0;i<6;++i){
            if(values[i]>mayor){
                mayor=values[i];
                valor=dados[i];
            }
        }
        if(mayor>=3){
            info[0]=3;
        }else if(mayor==2){
            info[0]=2;
        }else{
            info[0]=0;
        }
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
