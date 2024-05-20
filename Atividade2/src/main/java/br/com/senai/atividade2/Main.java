/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senai.atividade2;

import br.com.senai.atividade2.Model.Pet;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Animal", 5, "Jandaia", "Pequeno", "Girassol");
        Pet pet2 = new Pet("Animal", 10, "Pitbull", "Medio", "Ração");
        
        pet1.setNome("Kiko");
        pet2.setNome("Lupy");
        
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
        
        System.out.println("\nNome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());
    }
}
