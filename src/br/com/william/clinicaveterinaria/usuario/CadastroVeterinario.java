package br.com.william.clinicaveterinaria.usuario;

import br.com.william.clinicaveterinaria.sistema.Cadastro;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroVeterinario extends Cadastro<Veterinario> {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Veterinario> veterinarios;

    // Método construtor
    public CadastroVeterinario() {
        veterinarios = new ArrayList<>();
    }


    @Override
    public String cadastrar(Veterinario veterinario) {
        System.out.print("Digite o nome do veterinário: ");
        veterinario.setNome(scan.nextLine());
        System.out.print("Digite o CPF do veterinário: ");
        veterinario.setCpf(scan.nextLine());
        System.out.print("Digite o tempo de atuação: ");
        veterinario.setTempoAtuacao(scan.nextInt());

        veterinarios.add(veterinario);

        return String.format("Cliente %s cadastrado com sucesso!", veterinario.getNome());
    }

    // Métodos específicos
    public void listarVeterinarios() {
        System.out.println("-----------CADASTRO DE VETERINÁRIOS-----------");
        if (veterinarios.isEmpty()) {
            System.out.println("Nenhum veterinário foi cadastrado ainda!");
        } else {
            for (int i = 0; i < veterinarios.size(); i++) {
                System.out.printf("-=-=-=-=-=-=-=-=-VETERINÁRIO %d-=-=-=-=-=-=-=-=-\n", (i+1));
                Veterinario vet = veterinarios.get(i);
                System.out.printf("Nome: %s\n", vet.getNome());
                System.out.printf("CPF: %s\n", vet.getCpf());
                System.out.printf("Tempo de atuação: %d\n", vet.getTempoAtuacao());
            }
        }
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
}
