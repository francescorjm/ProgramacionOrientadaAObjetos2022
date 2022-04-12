package Camioneta;

import javax.swing.JOptionPane;

public class Uso_Camioneta {


    public static void main (String[] args){
        Camioneta miCamioneta= new Camioneta();

        miCamioneta.establece_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(miCamioneta.dime_datos_generales());

        System.out.println(miCamioneta.dime_color());

        miCamioneta.configura_asientos(JOptionPane.showInputDialog(" Tiene asientos de cuero? "));

        System.out.println(miCamioneta.dime_asientos());

        miCamioneta.configura_climatizador(JOptionPane.showInputDialog(" Tiene climatizador?"));

        System.out.println(miCamioneta.dime_climatizador());

        System.out.println("El precio final de la camioneta es: "+ miCamioneta.precio_camioneta());

        System.out.println(miCamioneta.dime_largo());

    }

}