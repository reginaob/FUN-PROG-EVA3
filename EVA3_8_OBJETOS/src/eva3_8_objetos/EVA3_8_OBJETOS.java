/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_objetos;

/**
 *
 * @author regin
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        //Scanner input = new Scanner(System.in);
        //int [] arreglo = new int[5];
        //siempre que vean la pabara new estan creando un objeto
        System.out.println(perso1);
        perso1.nombre = "Regina";
        perso1.apellido = "Olivas";
        perso1.edad = 18;
        System.out.println(perso1);
        imprimiPersonas(perso1);
        
        Persona perso2 = new Persona();
        perso1.nombre = "pedro";
        perso1.apellido = "Hernandez";
        perso1.edad = 60;
        System.out.println(perso2);
        imprimiPersonas(perso2);
        
    }
    public static void imprimiPersonas(Persona perso){
        System.out.println("Direccion " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
}
//SON PLANTILLAS
//SON TIPOS DE DATOS
class Persona{
    String nombre;
    String apellido;
    int edad;
}