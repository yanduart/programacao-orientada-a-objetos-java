package com.mycompany.pratica_interface;


public class Relatorio implements Impressao{
    private String titulo;

    public Relatorio(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    @Override 
    public void imprimir(){
        //System.out.println();
        System.out.println("IMPRIMINDO RELATORIO");
        System.out.println("Titulo: " + titulo);
    }
}
