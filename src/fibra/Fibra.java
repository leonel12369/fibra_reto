/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leone
 */
public class Fibra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] lista ={{"1","2","2","3","3","4","3","4","5","4","5","6","4","5","6","7","5","6","7"},
                        {"s","s","p","s","p","s","d","p","s","d","p","s","f","d","p","s","f","d","p"},
                        {"2","2","6","2","6","2","10","6","2","10","6","2","14","10","6","2","14","10","6"}};
                
        Scanner leer= new Scanner(System.in);
        System.out.println("-----------------------------");
        String nombre= leer.nextLine();
        String numero="";
        numero= leer.nextLine(); 
        List<String> descomposicion = new ArrayList<String>();
        while(numero.equals("0") || numero.equals("118")){
            System.out.println("ingrese un numero mayor que 0 y menor que 118");
            numero= leer.nextLine(); 
        }
        int suma=0;
        int suma_anterior=0;        
        String impresion=new String("");
        while(!nombre.equals("exit")){
            int numero_convertido=Integer.parseInt(numero);
            for(int i=0;i<lista[2].length;i++){
                int casteado_fila=Integer.parseInt(lista[2][i]);
                suma=suma+casteado_fila;
                
                if(numero_convertido<suma){
                    //System.out.println("romper todo el bucle");
                    //System.out.println("suma_anterior"+suma_anterior);
                    int restante=numero_convertido-suma_anterior;
                    //System.out.println(lista[0][i]+lista[1][i]+restante);
                    if(restante!=0){
                        impresion +=lista[0][i]+lista[1][i]+restante;
                    }
                    //System.out.println("-----------------------------");
                    //System.out.println(""+nombre);
                    //System.out.println(""+impresion);
                    descomposicion.add(impresion);
                    suma_anterior=0;
                    suma=0;
                    impresion=new String("");
                    break;
                }
                suma_anterior=suma_anterior+casteado_fila;
                //System.out.println(lista[0][i]+lista[1][i]+lista[2][i]);
                impresion +=lista[0][i]+lista[1][i]+lista[2][i]+" ";
                
            }
            System.out.println("-----------------------------");
            nombre= leer.nextLine();
            if(nombre.equals("exit")){
                break;
            }
            numero= leer.nextLine();
            //if(numero_convertido)
        }
        
        for(int i=0;i<descomposicion.size();i++){
            System.out.println(descomposicion.get(i));
        }
        
    }
    
}

