/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senai.atividade3.Model;

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroPaginas;
    private double valor;

    public Livro(String titulo, String autor, String isbn, int numeroPaginas, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
}
