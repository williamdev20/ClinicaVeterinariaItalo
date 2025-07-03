package br.com.william.clinicaveterinaria.sistema;

import br.com.william.clinicaveterinaria.usuario.CadastroCliente;
import br.com.william.clinicaveterinaria.usuario.CadastroVeterinario;

import java.util.Scanner;

public class Consulta {
    Scanner scan = new Scanner(System.in);
    private CadastroVeterinario veterinario;
    private CadastroCliente cliente;

    public Consulta() {
        veterinario = new CadastroVeterinario();
        cliente = new CadastroCliente();
    }

    public void agendarConsulta() {
        veterinario.listarVeterinarios();
        System.out.println("Digite o nome do veterinário que desejas realizar a consulta: ");
        String nomeVet = scan.nextLine();
        System.out.println("Digite o nome do paciente: ");
        String nomePaciente = scan.nextLine();
        System.out.println("Digite o nome do animal: ");
        String nomeAnimal = scan.nextLine();
        System.out.println("Informe o dia da consulta: ");
        String data = scan.nextLine();
        System.out.println("Informe a hora da consulta: ");
        String hora = scan.nextLine();

        System.out.println("-------CONSULTA AGENDADA COM SUCESSO!-------");
        System.out.printf("Nome do veterinário: %s\n", nomeVet);
        System.out.printf("Nome do Paciente: %s\n", nomePaciente);
        System.out.printf("Nome do Animal: %s\n", nomeAnimal);
        System.out.printf("Data: %s\n", data);
        System.out.printf("Hora: %s\n", hora);


    }

}

