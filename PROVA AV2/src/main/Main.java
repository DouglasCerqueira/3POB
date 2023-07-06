package main;

import conexao.Conexao;
import dao.ClienteDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexao connect = new Conexao();
        connect.getConexao();

        int escolha;
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    cliente();
                    break;

                case 0:
                    System.out.println("\n ---- Encerrando ----");
                    break;

                default:
                    System.out.println("\n ---- Opcao Invalida ----");
                    break;
            }
        }
        while (escolha != 0);
    }

    public static void menu() {
        System.out.println("\n********************************");
        System.out.println("*     Selecione uma opcao      *");
        System.out.println("********************************");
        System.out.println("*       1 - Cliente            *");
        System.out.println("*       2 - Quarto             *");
        System.out.println("*       3 - Cama               *");
        System.out.println("*       4 - Reserva            *");
        System.out.println("*       0 - Sair               *");
        System.out.println("********************************");
        System.out.print("-> ");
    }

    public static void cliente() {
        int escolha;
        int sair;
        String nome = "";
        String endereco = "";
        String postalCode = "";
        String pais = "";
        String cpf = "";
        String passaporte = "";
        String email = "";
        String dataNascimento = "";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Cliente clientes = new Cliente();
        ClienteDAO clientesDAO = new ClienteDAO();

        System.out.println("\n********************************");
        System.out.println("*      Area do Cliente         *");
        System.out.println("********************************");
        System.out.println("*       1 - Cadastro           *");
        System.out.println("*       2 - Alteracao          *");
        System.out.println("*       3 - Excluir            *");
        System.out.println("*       4 - Listar             *");
        System.out.println("*       0 - Menu               *");
        System.out.println("********************************");
        System.out.print("-> ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("\nDigite o NOME do cliente: ");
                nome = sc.next();
                clientes.setNome(nome);

                System.out.print("Digite o ENDERECO do cliente: ");
                endereco = sc.next();
                clientes.setEndereco(endereco);

                System.out.print("Digite o CEP do cliente: ");
                postalCode = sc.next();
                clientes.setPostalCode(postalCode);

                System.out.print("Digite o PAIS do cliente: ");
                pais = sc.next();
                clientes.setPais(pais);

                System.out.print("Digite o CPF do cliente: ");
                cpf = sc.next();
                clientes.setCpf(cpf);

                System.out.print("Digite o PASSAPORTE do cliente: ");
                passaporte = sc.next();
                clientes.setPassaporte(passaporte);

                System.out.print("Digite o EMAIL do cliente: ");
                email = sc.next();
                clientes.setEmail(email);

                System.out.print("Digite a DATA DE NASCIMENTO do cliente [DD/MMM/AAAA]: ");
                dataNascimento = sc.next();
                clientes.setDataNascimento(dataNascimento);

                clientesDAO.inserir(clientes);

                System.out.print("Deseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cliente();
                } else {
                    break;
                }

            case 2:
                System.out.print("\nQual o ID do cliente voce deseja alterar? ");
                int idAlterar = sc.nextInt();
                clientes.setId(idAlterar);

                System.out.print("\nDigite o NOME NOVO do cliente: ");
                String nomeNovo = sc.next();
                clientes.setNome(nomeNovo);

                System.out.print("Digite o ENDERECO NOVO do cliente: ");
                String enderecoNovo = sc.next();
                clientes.setEndereco(endereco);

                System.out.print("Digite o CEP NOVO do cliente: ");
                String postalCodeNovo = sc.next();
                clientes.setPostalCode(postalCodeNovo);

                System.out.print("Digite o PAIS NOVO do cliente: ");
                String paisNovo = sc.next();
                clientes.setPais(paisNovo);

                System.out.print("Digite o CPF NOVO do cliente: ");
                String cpfNovo = sc.next();
                clientes.setCpf(cpfNovo);

                System.out.print("Digite o PASSAPORTE NOVO do cliente: ");
                String passaporteNovo = sc.next();
                clientes.setPassaporte(passaporteNovo);

                System.out.print("Digite o EMAIL NOVO do cliente: ");
                String emailNovo = sc.next();
                clientes.setEmail(emailNovo);

                System.out.print("Digite a DATA DE NASCIMENTO NOVA do cliente [DD/MMM/AAAA]: ");
                String dataNascimentoNova = sc.next();
                clientes.setDataNascimento(dataNascimentoNova);

                clientesDAO.alterar(clientes);

                System.out.print("Deseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cliente();
                } else {
                    break;
                }

            case 3:
                System.out.print("\nQual o ID do cliente voce deseja excluir? ");
                int idExcluir = sc.nextInt();

                clientesDAO.excluir(idExcluir);

                System.out.print("Deseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cliente();
                } else {
                    break;
                }

            case 4:
                
        }
    }
}