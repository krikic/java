/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author David
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
         private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
         @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    
        try{
         int i;
              String input="";
              
     //Pedimos por pantalla el numero de elementos de nuestro array
              System.out.print("Introduce el numero de elementos del array\n");
 		 input = stdin.readLine();
 		
 		int n = Integer.parseInt(input);
       //Si los n elementos del array son positivos ,calculará aleatoriamente n elementos mediante 
                ///el Math.random de 0 a 100.
               if(n>0){
                int x[ ] = new int[n+10];
                
                
                for( i=0;i<n;i++)
 		{
 		    x[i]=(int)(100.0 * Math.random());	
                    System.out.println("\nx["+i+"]="+x[i]+"\n");
 			
 		}
                
                //==============> ALERTA: cal tenir present que n augmenta.
                //Aqui solicitamos una posición del vector y le asociamos el valor
                System.out.print("\nIntroduce una posicion=");
 		input = stdin.readLine();
 		int pos = Integer.parseInt(input);
 	 	System.out.print("\nvalor=");
 		input = stdin.readLine();
 		int valor = Integer.parseInt(input);
               
                //establecemos que la posiciones mayor que 0 y menor que los n elementos del array
                //si se cumple procederemos a mostrar los resultados que se nos pide mediante las
                //funciones que hemos establecido
                          if (pos>0 || pos<n){  
                
                 AddValorPos(n,pos,valor,x);
                 ValorMaxMin(n,x);
                 HighAverage(n,x);
                          }          
                          
                          //Esto son el caso contrario a las condiciones y saltarán una serie de excepciones
                          //en caso contrario
               
                          else{
                              
                              throw new ArrayIndexOutOfBoundsException();
                          
                
                          }
               }
               
                
                   
               
               
               if(n<0){
                   throw new NegativeArraySizeException();
                   
                   
               }
               
               
   
        }
     
    
    catch(NegativeArraySizeException ex){
            System.out.println("El numero de elementos del array debe ser positivo "+ ex);
        
        }
     catch(ArrayIndexOutOfBoundsException es){
            System.out.println("Posicion incorrecta y valores"+es);
        }
    
    
    }
    
    
    
    
    
    
    //Funcion para añadir una posicion y un valor y después mostrar el nuevo vector con la posicion
     public static void AddValorPos(int n,int pos,int valor,int x[]) throws IOException {
 		
                
 		
 		int i;
                
                if(pos>0 && pos<n){
 		
            for(i = n; i>=pos;i--) x[i]=x[i-1];		
	 	x[pos]=valor;
	 	n++; //============================> Augmenta la n.
 		for(i=0;i<n;i++) System.out.print("\nx["+i+"]="+x[i]+"\n");

}
}
               
                
                	        

                	        
        //Funcion para calcular los valores máximos y minimos del vector
        public static void ValorMaxMin(int n,int x[]) throws IOException {
                
                
                  float max = x[0];
 		float min = x[0];
                
                 for( int i=0;i<n;i++){
 		
 			
 			if (x[i]>max){
                            max = x[i];
                        }
 			if(x[i]<min){
                            min = x[i];
                        }
                 }
 		
 		System.out.println("\nmax="+max);
 		System.out.println("\nmin ="+min);
                
               
                
        }
        
        //Funcion para mostrar los valores que estan por encima y por debajo de la media
        public static void HighAverage(int n,int x[]) throws IOException {
            int i;
                   float mitjana=0.f;
                  
        for( i=0;i<n;i++)
 		{
 			
 			mitjana=mitjana+x[i];
 			
 		}
 		mitjana=mitjana/n;
 		System.out.print("\nmitjana = "+mitjana);
 		
 		//c) Elements que es troben per sota i per sobre de la mitjana
 		System.out.print("\nPer sobre la mitjana...");
 		 for( i=0;i<n;i++) if (x[i]>mitjana)System.out.println("\nx["+i+"]="+x[i]);
 		System.out.print("\nPer sota la mitjana...");
 		 for(i=0;i<n;i++)if (x[i]<mitjana)System.out.println("\nx["+i+"]="+x[i]);
 	
                  
                   }
           
}
