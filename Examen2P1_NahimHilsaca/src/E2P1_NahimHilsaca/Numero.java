/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2P1_NahimHilsaca;

import java.util.ArrayList;

/**
 *
 * @author nahim
 */

public class Numero {
   
    static ArrayList listadenumeros= new ArrayList();
    private int base;
    private String resultadofinal;//Aqui tengo el resultadofinal que es mi cadena
    
 public Numero(){
 
 }//Constructor vacio
 
 public Numero(int baseB, int numN){
 this.base=baseB;

 
 }//Constructor recargado
 
 
 
 public char numtochar(int division){
 
int numero=0;

 int acum=10;
 char letras=97;
 char resultado =0;
 letras=(char)acum;
 
 while((numero/base)>base){
            division=numero/base;
      
     if(division<=9){
         resultado=(char)division;
        
     } else{
     
      resultado=letras;
     acum++;
     letras++;
     }//Fin del else
       
       
 }//Fin del while
 return resultado;
 }//Fin del metodo
 
 public int chartonum(char resultadochar){
     
   int numero=0;
 int acum=10;
 char letras=97;
 int resultado =0;
 letras=(char)acum;
 
 while((numero/base)>base){
            resultado=numero/base;
      
     if(resultado<=9){
         resultado=(int)resultadochar;
        
     } else{
     
      resultado=letras;
     acum++;
     letras++;
     }//Fin del else
       
       
 }//Fin del while
 return resultado;
 }//Fin del metodo
 
     
 // Fin del metodo chartonum
 
 public int dectobase(int numero_decimal){
        char dectobase=0;
     dectobase=(char) chartonum(dectobase);
 
 return dectobase;
 }//Fin del metodo dectobase
 
 
 
 
}// Fin de la clase


