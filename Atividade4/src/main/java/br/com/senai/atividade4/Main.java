/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senai.atividade4;

import br.com.senai.atividade4.Model.Endereço;
import br.com.senai.atividade4.Model.Funcionario;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Indefined", "@docente.senai.br", "071", "Lauro de Freitas");
        Endereço endereco1 = new Endereço("Rua Lauro", 1000, "01234-56", "Salvador");
        
        funcionario1.setNome("Itala Freire");
        endereco1.setLogradouro("Avn. Luiz Viana Filho");
        
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Email: " + funcionario1.getEmail());
        System.out.println("Telefone: " + funcionario1.getTelefone());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        
        System.out.println("\nLogradouro: " + endereco1.getLogradouro());
        System.out.println("Numero: " + endereco1.getNumero());
        System.out.println("CEP: " + endereco1.getCep());
        System.out.println("Cidade: " + endereco1.getCidade());
    }
}
