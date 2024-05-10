/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livros;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Livros livro1 = new Livros();
        livro1.setTitulo("Tio Patinhas");
        livro1.setAutor("Carl Barks");
        livro1.setNmrPag(40);
        livro1.setPreco(45.00);
        
        Livros livro2 = new Livros();
        livro2.setTitulo("Turma da Monica");
        livro2.setAutor("Mauricio de Sousa");
        livro2.setNmrPag(30);
        livro2.setPreco(20.00);
        
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Numero de Paginas: " + livro1.getNmrPag());
        System.out.println("Valor da Edição: R$" + livro1.getPreco());
        
        System.out.println("\nTitulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Numero de Paginas: " + livro2.getNmrPag());
        System.out.println("Valor da Edição: R$" + livro2.getPreco());
    }
}
