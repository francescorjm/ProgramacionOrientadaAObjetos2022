package Camioneta;

import javax.swing.*;

public class Camioneta {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;

    private String color;
    private int pesoTotal;
    private boolean asientosCuero, Climatizador;


    public Camioneta(){
        ruedas = 4;
        largo = 4580;
        ancho = 1900;
        motor = 2000;
        pesoPlataforma = 850;
    }

    public String dime_datos_generales(){
        return "La plataforma del vehiculo tiene " + ruedas + " ruedas "+ ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + pesoPlataforma + "kg";

    }

    public void establece_color(String color_camioneta){
        color= color_camioneta;
    }
    public String dime_color(){
        return "El color de la camioneta es " + color;
    }

    public void configura_asientos(String asientosCuero){
        if(asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero= true;
        }else {
            this.asientosCuero= false;
        }
    }
    public String dime_asientos(){
        if(asientosCuero==true){
            return " La camioneta tiene asientos de cuero ";
        }else{
            return " La camioneta tiene asientos de normales ";
        }
    }

    public void configura_climatizador(String climatizador){
        if (climatizador.equalsIgnoreCase("si")){
            this.Climatizador=true;
        }else{
            this.Climatizador=false;
        }
    }

    public String dime_climatizador(){
        if(Climatizador==true){
            return " La camioneta incorpora climatizador ";
        }else{
            return " La camioneta lleva aire acondicionado ";

        }
    }

    public String dime_peso_camioneta(){
        int peso_carroceria = 500;
        pesoTotal= pesoPlataforma+peso_carroceria;
        if(asientosCuero==true){
            pesoTotal= pesoTotal+50;
        }
        if (Climatizador==true){
            pesoTotal=pesoTotal+20;
        }
        return "El peso de la camioneta es" + pesoTotal;
    }

    public int precio_camioneta(){
        int precio_final= 10000;
        if(asientosCuero==true){
            precio_final+=2000;
        }
        if (Climatizador==true){
            precio_final+=1500;
        }
        return precio_final;
    }


    public String dime_largo(){
        return "El largo de la camioneta es " + largo;

    }

}