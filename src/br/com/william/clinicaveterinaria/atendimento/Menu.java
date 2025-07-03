package br.com.william.clinicaveterinaria.atendimento;

import br.com.william.clinicaveterinaria.sistema.Consulta;
import br.com.william.clinicaveterinaria.usuario.*;

import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    CadastroCliente cliente = new CadastroCliente();
    Animal animal = new Animal();
    CadastroVeterinario veterinario = new CadastroVeterinario();
    Consulta consulta = new Consulta();
    int opcao;

    public void realizarAtentidmento() {
        while (opcao != 7) {
            System.out.println("\n-=-=-=-=-=-=-=-=-MENU PRINCIPAL-=-=-=-=-=-=-=-=-\n");
            System.out.println("[ 1 ] Cadastrar cliente");
            System.out.println("[ 2 ] Cadastrar animal");
            System.out.println("[ 3 ] Listar cadastros");
            System.out.println("[ 4 ] Cadastrar veterinário");
            System.out.println("[ 5 ] Listar veterinários");
            System.out.println("[ 6 ] Agendar consulta");
            System.out.println("[ 7 ] Sair");
            System.out.print(">>> Escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    opcao = 0;
                    System.out.println(cliente.cadastrar(new Cliente()));
                    break;
                case 2:
                    opcao = 0;
                    System.out.println(cliente.cadastrarAnimal(animal));
                    break;
                case 3:
                    opcao = 0;
                    cliente.listarCadastros();
                    break;
                case 4:
                    opcao = 0;
                    System.out.println(veterinario.cadastrar(new Veterinario()));
                    break;
                case 5:
                    opcao = 0;
                    veterinario.listarVeterinarios();
                    break;
                case 6:
                    opcao = 0;
                    consulta.agendarConsulta();
                    break;

            }
        }
    }
}
