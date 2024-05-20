/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senai.atividade3;

import br.com.senai.atividade3.Model.Livro;
import br.com.senai.atividade3.Model.Veiculo;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("0123456", "Cinza Perolado", 5, 15, 200, 12);
        Livro livro1 = new Livro("Veja", "Stan Lee", "+1EUA", 60, 20.0);
        
        veiculo1.setPlaca("JRN007");
        livro1.setTitulo("X-MEN");
        
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Numero de Passageiros: " + veiculo1.getNumeroPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo1.getCapacidadeTanque());
        System.out.println("Velocidade Maxima: " + veiculo1.getVelocidadeMax());
        System.out.println("Consumo Medio: " + veiculo1.getConsumoMedio());
        
        System.out.println("\nTitulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Numero de Paginas: " + livro1.getNumeroPaginas());
        System.out.println("Valor de Compra: " + livro1.getValor());
    }
}
