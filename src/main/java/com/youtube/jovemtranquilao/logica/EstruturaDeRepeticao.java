package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {

        listaDePalavras();
        forClassico();
        inverterString();

    }

    private static void listaDePalavras() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for(String palavra: palavraList){
            System.out.println(palavra);
        }
    }

    private static void forClassico(){

        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for(int posicao = 0; posicao < palavraList.size(); posicao++){
            System.out.println(palavraList.get(posicao));
        }

    }

    private static void inverterString(){

        String normal = "12345";

        String invertida = "";
        for(int posicao = normal.length() - 1; posicao >= 0; posicao--){
            invertida = invertida + normal.charAt(posicao);
        }

        System.out.println(invertida);

    }

}
