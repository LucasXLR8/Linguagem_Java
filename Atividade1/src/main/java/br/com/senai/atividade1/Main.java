/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senai.atividade1;

import br.com.senai.atividade1.Model.Livros;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Livros livro1 = new Livros("VEJA", "Carl Barks", 40,  50.0);
        Livros livro2 = new Livros("VEJA", "Mauricio de Souza", 25,  20.0);
        
        livro1.setTitulo("Tio Patinhas");
        livro2.setTitulo("Turma da Monica");
        
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Numero de Paginas: " + livro1.getNumeroPaginas());
        System.out.println("Preço: R$" + livro1.getPreco());
        System.out.println("\nTitulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Numero de Paginas: " + livro2.getNumeroPaginas());
        System.out.println("Preço: R$" + livro2.getPreco());
    }
}
