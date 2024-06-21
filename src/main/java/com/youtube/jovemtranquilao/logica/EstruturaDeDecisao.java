package com.youtube.jovemtranquilao.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {

        Integer numero = 3;
        String frase = "Hoje é segunda feira";
        String horario = "Agora são tres da tarde";
        if(frase.contains("segunda feira")){
            if (horario.contains("seis da tarde")){
                System.out.println("hora de alegria");
            }else{
                System.out.println("dia de tristeza");
            }
        }else if(frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")){
            System.out.println("dia de alegria");
        }else{
            System.out.println("dia normal...");
        }

        stringInicial();
    }

    private static void stringInicial() throws ParseException {
        String palavra = "bobeira";

        if(palavra.startsWith("a")){
            System.out.println("palavra iniciada em a");
        }else{
            System.out.println("palavra não iniciada com a");
        }

        datas();

    }
    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2103");

        if(data.before(new Date())){
            System.out.println("Faz mó cota");
        }else{
            System.out.println("Ta ansioso kraio?");
        }



    }
}

