/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Chespo
 */
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1,num2,op;
        String salida="";
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese dos numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        do{
        System.out.println("menu");
        System.out.println("1- sumar");
        System.out.println("2- restar");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");
        System.out.println("5- salir");
        op=leer.nextInt();
        
        switch(op){
            case 1:{
                System.out.println(num1+num2);
                break;
            }
            case 2:{
                System.out.println(num1-num2);
                break;
            }
            case 3:{
                System.out.println(num1*num2);
                break;
            }
            case 4:{
                System.out.println(num1/num2);
                break;
            }
            case 5:{
               System.out.println("esta seguro que desea salir?  (s/n)");
              // salida=leer.nextLine();
               salida = leer.next();
               
               if(salida.equalsIgnoreCase("s")){
                   op=0;
                   System.out.println("fin del programa");
               }else if(salida.equalsIgnoreCase("n")){
                   System.out.println("seguimos trabajando");
               }else{
                   System.out.println("ingreso una letra que no corresponde");
                   //continue;
               }
              
               
                break;
            }
            default:{
                System.out.println("la opcion elegida no es correcta");
                break;
            }
        
        }
        
        }while(op!=0);
        
    }
    
}
