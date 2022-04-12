package Moto;

import javax.swing.*;

public class Moto {

    private int ancho;
    private int motor;
    private int ruedas;
    private int largo;
    private int pesoPlataforma;

    private String color;
    private int pesoTotal;
    private boolean asientosdeLujo;


    public Moto(){
        ancho = 200;
        motor = 1600;
        ruedas = 2;
        largo = 1000;
        pesoPlataforma = 500;
    }

    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas "+ ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + pesoPlataforma + "kg";

    }

    public void establece_color(String color_Moto){
        color= color_Moto;
    }
    public String dime_color(){
        return "El color de la moto es " + color;
    }

    public void configura_asientos(String asientosdeLujo){
        if(asientosdeLujo.equalsIgnoreCase("si")){
            this.asientosdeLujo= true;
        }else {
            this.asientosdeLujo= false;
        }
    }
    public String dime_asientos(){
        if(asientosdeLujo==true){
            return " La moto tiene asientos de lujo ";
        }else{
            return " La moto tiene asientos de serie ";
        }
    }

    public String dime_peso_moto(){
        int peso_carroceria = 500;
        pesoTotal= pesoPlataforma+peso_carroceria;
        if(asientosdeLujo==true){
            pesoTotal= pesoTotal+50;
        }
        return "El peso de la moto es" + pesoTotal;
    }

    public int precio_moto(){
        int precio_final= 10000;
        if(asientosdeLujo==true){
            precio_final+=2000;
        }

        return precio_final;
    }


    public String dime_largo(){
        return "El largo de la moto es " + largo;

    }

}