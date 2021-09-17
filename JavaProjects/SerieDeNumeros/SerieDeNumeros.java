/*Elaborar un programa en Java que muestre en consola una secuencia de números
 Cada número de la secuencia debe ser la suma de los dos anteriores */

//Juan Manuel Badillo Flores 19100148

package Ejercicios;

public class SerieDeNumeros {
    public static void main(String[] args)
    {
        int FnM1 = 0; //Primer numero de la secuencia de fibonacci 
        int FnM2 = 1; //Segundo numero de la secuencia de fibonacci 
        
        int n = 10; //Largo de la secuencia
         
        //Imprime primeros dos valores en la secuencia
        System. out .println(FnM1); 
        System. out .println(FnM2);   
        
        
       /*Realiza suma de numeros previos acorde a 
        la secuencia de Fibonacci [ Fn = Fn-1 + Fn-2 ] */
        int i = 0;
        while (i<n) {
            int Fn = FnM1 + FnM2;  //Suma los dos numeros anteriores
            FnM1 = FnM2; //Guarda el numero previo a la suma en la secuencia
            FnM2 = Fn; //Guarda el valor de la suma
                        
            System. out .println(Fn); //Imprime 
            
            i++;    
        }
    }
    
}
