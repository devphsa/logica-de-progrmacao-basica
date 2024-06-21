package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class RepeticaoEDecisaoJuntos {
    public static void main(String[] args) {

        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for(int posicao = 1; posicao <= 10; posicao++){
            listaDeUmADez.add(posicao);
        }

        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        for(int numero : listaDeUmADez){
            if (numero % 2 == 0){
                listaPar.add(numero);
            }else{
                listaImpar.add(numero);
            }
        }

        System.out.println("Número pares: ");
        System.out.println(listaPar);
        System.out.println("Número ímpares: ");
        System.out.println(listaImpar);

    }
}
