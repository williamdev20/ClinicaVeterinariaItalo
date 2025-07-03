package br.com.william.clinicaveterinaria.usuario;

import br.com.william.clinicaveterinaria.sistema.Cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente extends Cadastro<Cliente> {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Animal> animais;
    private ArrayList<Cliente> donos;

    // Método construtor
    public CadastroCliente() {
        this.animais = new ArrayList<>();
        this.donos = new ArrayList<>();
    }

    // Métodos herdados
    @Override
    public String cadastrar(Cliente cliente) {
        System.out.print("Digite o nome do cliente: ");
        cliente.setNome(scan.nextLine());
        System.out.print("Digite o CPF do cliente: ");
        cliente.setCpf(scan.nextLine());

        donos.add(cliente);

        return String.format("Cliente %s cadastrado com sucesso!", cliente.getNome());
    }



    // Métodos específicos da classe
    public String cadastrarAnimal(Animal animal) {
        System.out.println("Digite o nome do animal: ");
        animal.setNome(scan.nextLine());
        System.out.println("Digite a espécie do animal: ");
        animal.setEspecie(scan.nextLine());
        System.out.println("Digite a idade do animal: ");
        animal.setIdade(scan.nextInt());
        System.out.println("Digite o tamanho do animal: ");
        animal.setTamanho(scan.nextDouble());
        System.out.println("Digite o peso do animal: ");
        animal.setPeso(scan.nextDouble());
        scan.nextLine();
        System.out.println("Digite o sintoma do animal: ");
        animal.setSintoma(scan.nextLine());

        animais.add(animal);

        return String.format("Animal %s cadastrado com sucesso!", animal.getNome());
    }

    public void listarCadastros() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal foi cadastrado ainda!");
        } else {
            for (int i = 0; i < donos.size(); i++) {
                Animal animal = animais.get(i);
                Cliente dono = donos.get(i);

                System.out.printf("----------------CADASTRO %d----------------\n", (i+1));
                System.out.printf("Nome do dono: %s\n", dono.getNome());
                System.out.printf("CPF do dono: %s\n", dono.getCpf());
                System.out.printf("Nome do animal: %s\n", animal.getNome());
                System.out.printf("Espécie do animal: %s\n", animal.getEspecie());
                System.out.printf("Sintoma: %s\n", animal.getSintoma());
                System.out.printf("Idade: %d\n", animal.getIdade());
                System.out.printf("Peso: %f\n", animal.getPeso());
                System.out.printf("Tamanho: %f\n", animal.getTamanho());

            }
        }
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public ArrayList<Cliente> getDonos() {
        return donos;
    }



}