package br.com.alura.sreenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.geteClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.geteClassificacao() >=2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
