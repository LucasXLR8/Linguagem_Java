/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pet;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Pet pet1 = new Pet();
        pet1.setNome("Kiko");
        pet1.setIdade(5);
        pet1.setEspecie("Passarinho");
        pet1.setRaca("Jandaia");
        pet1.setPorte("Pequeno");
        pet1.setAlimentaçao("Sementes");
        pet1.setPeso(250.00);
        
        Pet pet2 = new Pet();
        pet2.setNome("Lupy");
        pet2.setIdade(10);
        pet2.setEspecie("Cachorro");
        pet2.setRaca("Pitbull");
        pet2.setPorte("Medio");
        pet2.setAlimentaçao("Ração");
        pet2.setPeso(15.00);
        
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Especie: " + pet1.getEspecie());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentaçao());
        System.out.println("Peso: " + pet1.getPeso() + "Gramas");
        
        System.out.println("\nNome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Especie: " + pet2.getEspecie());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentaçao());
        System.out.println("Peso: " + pet2.getPeso() + "KG");
    }
}
