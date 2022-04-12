package Moto;

import javax.swing.JOptionPane;

public class Uso_Moto {


    public static void main (String[] args){
        Moto miMoto= new Moto();

        miMoto.establece_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(miMoto.dime_datos_generales());

        System.out.println(miMoto.dime_color());

        miMoto.configura_asientos(JOptionPane.showInputDialog(" Tiene asientos de lujo?"));

        System.out.println(miMoto.dime_asientos());

        System.out.println("El precio final de la moto es: "+ miMoto.precio_moto());

        System.out.println(miMoto.dime_largo());

    }

}




