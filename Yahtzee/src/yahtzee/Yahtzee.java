/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author Aaron
 */
public class Yahtzee {

   
    public static void main(String[] args) {
        ThreeOfaKind juego=new ThreeOfaKind();
        for(int i=1;i<=10000;++i){
            juego.jugada();
        }
        System.out.println(juego.mylist.size());
        
    }
    
}
