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
public class Ejercicio2 {
    
     private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
         @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try{
            
        
        
     //Pedimos por pantalla el numero de personas
        System.out.println("Introduce El numero de personas entre 0 y 50: ");
                int n=Integer.parseInt(stdin.readLine());
                //Matriz de n personas con dos campos que seran el sexo y si trabaja o no
                String personas [][]=new String [n][1];
                //si el numero de personas es menor que 50 y mayor que 0 procederemos a mostrar el resultado
                //de la funcion
                if(n<=50&& n>0){
                 Porcentajes(n,personas);
                }
                
                //En caso contrario mostrara una excepcion
                else{
            throw new ArrayIndexOutOfBoundsException();
        }
        
        }catch(ArrayIndexOutOfBoundsException es){
            System.out.println("Valor incorrecto del array"+es);
        }
    }
        
        
        
        
        //Funcion calculo porcentajes en funcion del numero de personas 
    public static void Porcentajes(int p,String personas[][]) throws IOException {

     
    
   
    //inicializamos las variables
        int i=0,j=0,k=0;
        
        double totalhombrestrabaja=0,totalmujerestrabaja=0,totalhombresuniversidad=0,totalmujeresuniversidad=0;
        double porcentajehombrestrabaja=0,porcentajemujerestrabaja=0,porcentajehombresuniversidad=0,porcentajemujeresuniversidad=0;
        
        
            
         
        for( i=0;i<p;i++){
            
            

                //hacemos un submenu para seleccionar el sexo
                System.out.println("Introduce Sexo: ");
                System.out.println("1.-Masculino ");
                System.out.println("2.-Femenino");
                
                System.out.print("Elige una opcion: ");
                int sexo=Integer.parseInt(stdin.readLine());
                personas[i][0]=Integer.toString(sexo);
               
                    //hacemos un submenu para seleccionar si trabaja o va a la universidad
                System.out.println("Introduce Trabaja o no: ");
                System.out.println("1.-Trabaja ");
                System.out.println("2.-No Trabaja");
                
                System.out.print("Elige una opcion: ");
                int trabaja=Integer.parseInt(stdin.readLine());
                personas[i][1]=Integer.toString(trabaja);

                
           
            //Hacemos comparaciones en funcion de lo que nos pide el ejercicio
                
                        if (personas[i][0].equals("1") && personas[i][1].equals("1")){
                            
                            totalhombrestrabaja++;
                              
                        }
                        
                        if (personas[i][0].equals("2") && personas[i][1].equals("1")){
                            
                            totalmujerestrabaja++;
                              
                        }
                        
                         if (personas[i][0].equals("1") && personas[i][1].equals("2")) {
                            
                            totalhombresuniversidad++;
                              
                        }
                        
                         if (personas[i][0].equals("2") && personas[i][1].equals("2")){
                            
                            totalmujeresuniversidad++;
                              
                        }
                        
        }      
                    //calculamos los porcentajes y los mostramos
                   porcentajehombresuniversidad=( totalhombresuniversidad/ p)*100;
                   porcentajemujeresuniversidad=( totalmujeresuniversidad/p) *100;
                   porcentajehombrestrabaja=( totalhombrestrabaja/p)*100;
                   porcentajemujerestrabaja=( totalmujerestrabaja/p) *100;
                   
        System.out.println("El porcentaje de hombres en la universidad es: "+porcentajehombresuniversidad);
        System.out.println("El porcentaje de mujeres en la universidad es: "+porcentajemujeresuniversidad);
        System.out.println("El porcentaje de hombres que trabajan es: "+porcentajehombrestrabaja);
             System.out.println("El porcentaje de mujeres que trabajan es: "+porcentajemujerestrabaja);
        
    }
    
}
        
    
        
        
                    
                    
        

        
                 
                   