/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculonotamedia;
import java.util.Scanner;
public class Calculonotamedia {
    
       public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nota1;
        double notafinal;
        double nota2=0;
        
        System.out.print("Introduce la nota del primer examen: ");
        nota1 = sc.nextDouble();
        
        System.out.print("¿Qué nota deseas sacar en el trimestre? ");
        notafinal = sc.nextDouble();
        if ((nota1 >= 0 && nota1 <=10) && (notafinal >= 0 && notafinal <= 10)){
        nota2 = ((notafinal*100)- (nota1 *40)) /60;
        }       
        if (nota2 >= 0 && nota2 <= 10){
        System.out.println("Para tener un " + notafinal + " en el trimestre necesitas sacar un " + nota2 + " en el segundo examen");}
        else{
            System.out.println("No es posible que saques esa media.");
        }
           
       }
    
}