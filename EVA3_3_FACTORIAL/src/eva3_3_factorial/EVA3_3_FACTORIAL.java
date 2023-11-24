/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_factorial;

/**
 *
 * @author regin
 */
public class EVA3_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamada a funcion:
        System.out.println("El factor de 5 = " + calcularFactorial(5));
        System.out.println("5 elevado a la 3 = " + calcularPotencia(2, 5) );
    }
    public static int calcularFactorial(int num){
        //factroial de 5: 1 x 2 x 3 x 4 x 5 = 120
        //usar ciclos 
        //regresar el valor calculado
        int resu = 1;
        for (int i = 1; i <= num; i++) {
           resu *= i; //resu = resu * i;
       }
        return resu;
        
        }
    //crear una funcion que calcule la potencia del numero entero.
public static int calcularPotencia(int base, int exp){
    int resu = 1;
    for (int i = 0 ; i < exp; i++) {
        resu *= base; //resu = resu * base;
    }
    return resu;
    }
}
    


        
    

