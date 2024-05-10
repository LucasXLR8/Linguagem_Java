/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.carro;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.setPlaca("JRN0919");
        carro1.setModelo("Corsa");
        carro1.setMarca("Chevrolet");
        carro1.setCor("Cinza Perolado");
        carro1.setNrmPassageiros(5);
        carro1.setCapTanque(25);
        carro1.setVelMax(180);
        carro1.setConsMedio(12);
        
        Livro livro1 = new Livro();
        livro1.setTitulo("Tio Patinhas");
        livro1.setAutor("Carl Barks");
        livro1.setIsbn("0123456789");
        livro1.setNmrPag(40);
        livro1.setPreco(45.00);
        
        System.out.println("Placa: " + carro1.getPlaca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Numero de Passageiros: " + carro1.getNrmPassageiros());
        System.out.println("Capacidade do Tanque: " + carro1.getCapTanque());
        System.out.println("Velocidade Maxima: " + carro1.getVelMax());
        System.out.println("Consumo Medio: " + carro1.getConsMedio());
        
        System.out.println("\nTitulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Codigo ISBN: " + livro1.getIsbn());
        System.out.println("Numero de Paginas: " + livro1.getNmrPag());
        System.out.println("Valor da Edição: R$" + livro1.getPreco());
    }
}
