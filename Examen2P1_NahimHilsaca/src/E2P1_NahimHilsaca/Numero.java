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
 this.resultadofinal=dectobase(numN);

 
 }//Constructor recargado


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getResultadofinal() {
        return resultadofinal;
    }

    public void setResultadofinal(String resultadofinal) {
        this.resultadofinal = resultadofinal;
    }
 
 
 
 
 public char numtochar(int num){
     
     char numeroconvertido = 0;
 if(num>=0 || num<=9){
     
        numeroconvertido=(char)(num+48);
        
 }else if(num>=10 || num<=35){
 
     numeroconvertido=(char)((num)+87);
 
 }
 
 return numeroconvertido;
 
 
 }//Fin del metodo
 
 
 //Fin del metodo
 
 public int chartonum(char numeroconvertido){
     
     int num= 0;
 if(numeroconvertido>=48 && numeroconvertido<=57){
     
        num=(int)(numeroconvertido-48);
        
 }else if(numeroconvertido>=97 && numeroconvertido<=122){
 
        num=(int)(numeroconvertido-87);
 
 }
 
 return numeroconvertido;
 
 }//Fin del metodo
 
     
 // Fin del metodo chartonum
 
 public String dectobase(int numero_decimal){
     String residuoS="";
     int residuoint=0;
     while(numero_decimal>=base){
         numero_decimal=numero_decimal/base;
            residuoint=numero_decimal%base;
            
      residuoS+=numtochar(residuoint);
     
 }//Fin del while
 
 return residuoS;
 }//Fin del metodo dectobase
 
 public int basetodec(String residuoS, int base_basetodec){
 
     int numdecimal=0;
 for(int exponente=residuoS.length()-1; exponente>=0; exponente--){
     char base=residuoS.charAt(exponente);
     
            numdecimal+=chartonum(base)*Math.pow(base_basetodec, exponente);
 }//Fin del for
 
 return numdecimal;
 }//Fin del metodo
 
 
 
}// Fin de la clase


