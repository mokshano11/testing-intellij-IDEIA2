package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprogramaint {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro ("o problema dos 3 corpos", 300);
        System.out.println(livro);
        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!");*/
    }
}

class Livro {
    private String nome;
    private Integer npag;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    public Livro(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;


    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}



