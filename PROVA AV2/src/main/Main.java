package main;

import conexao.Conexao;
import dao.CamaDAO;
import dao.ClienteDAO;
import dao.QuartoDAO;
import dao.ReservaDAO;

import java.util.List;
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

                case 2:
                    quarto();
                    break;

                case 3:
                    cama();
                    break;

                case 4:
                    reserva();
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
        System.out.println("*       Area do Cliente        *");
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

                System.out.print("\nDeseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
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

                System.out.print("Digite o NOME NOVO do cliente: ");
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

                System.out.print("\nDeseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
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

                System.out.print("\nDeseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cliente();
                } else {
                    break;
                }

            case 4:
                List<Cliente> listaClientes = clientesDAO.getClientes();

                for(Cliente c : listaClientes){
                    System.out.print("\n\nID: " + c.getId());
                    System.out.print("\nNOME: " + c.getNome());
                    System.out.print("\nENDERECO: " + c.getEndereco());
                    System.out.print("\nPOSTAL CODE: " + c.getPostalCode());
                    System.out.print("\nPAIS: " + c.getPais());
                    System.out.print("\nCPF: " + c.getCpf());
                    System.out.print("\nPASSAPORTE: " + c.getPassaporte());
                    System.out.print("\nEMAIL: " + c.getEmail());
                    System.out.print("\nDATA DE NASCIMENTO: " + c.getDataNascimento());
                }

                System.out.print("\nDeseja continuar na AREA DE CLIENTE? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cliente();
                } else {
                    break;
                }

            case 0:
                break;

            default:
                System.out.println("\n---- OPCAO INVALIDA ----");
                cliente();
                break;

        }
    }

    public static void quarto(){
        int escolha;
        int sair;
        String nomeQuarto = "";
        int qtdeCamas;
        boolean temBanheiro;
        String descricao = "";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        Quarto quartos = new Quarto();
        QuartoDAO quartosDAO = new QuartoDAO();

        System.out.println("\n********************************");
        System.out.println("*       Area dos Quartos       *");
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
                System.out.print("\nDigite o NOME do quarto: ");
                nomeQuarto = sc.next();
                quartos.setNomeQuarto(nomeQuarto);

                System.out.print("Digite a QUANTIDADE DE CAMAS do quarto: ");
                qtdeCamas = sc.nextInt();
                quartos.setQtdeCamas(qtdeCamas);

                System.out.print("Digite se o quarto TEM BANHEIRO [Sim = true / nao = false]: ");
                temBanheiro = sc.nextBoolean();
                quartos.setTemBanheiro(temBanheiro);

                System.out.print("Digite a DESCRICAO do quarto: ");
                descricao = sc.next();
                quartos.setDescricao(descricao);

                quartosDAO.inserir(quartos);

                System.out.print("\nDeseja continuar na AREA DOS QUARTOS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    quarto();
                } else {
                    break;
                }

            case 2:
                System.out.print("\nQual o ID do quarto voce deseja alterar? ");
                int idAlterar = sc.nextInt();
                quartos.setId(idAlterar);

                System.out.print("Digite o NOME NOVO do quarto: ");
                String nomeQuartoNovo = sc.next();
                quartos.setNomeQuarto(nomeQuartoNovo);

                System.out.print("Digite a QUANTIDADE DE CAMAS NOVA do quarto: ");
                int qtdeCamasNova = sc.nextInt();
                quartos.setQtdeCamas(qtdeCamasNova);

                System.out.print("Digite se o quarto NOVO TEM BANHEIRO [Sim = true / nao = false]: ");
                boolean temBanheiroNovo = sc.nextBoolean();
                quartos.setTemBanheiro(temBanheiroNovo);

                System.out.print("Digite a DESCRICAO NOVA do quarto: ");
                String descricaoNova = sc.next();
                quartos.setDescricao(descricaoNova);

                quartosDAO.alterar(quartos);

                System.out.print("\nDeseja continuar na AREA DOS QUARTOS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    quarto();
                } else {
                    break;
                }

            case 3:
                System.out.print("\nQual o ID do quarto voce deseja excluir? ");
                int idExcluir = sc.nextInt();

                quartosDAO.excluir(idExcluir);

                System.out.print("\nDeseja continuar na AREA DOS QUARTOS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    quarto();
                } else {
                    break;
                }

            case 4:
                List<Quarto> listaQuartos = quartosDAO.getQuartos();

                for(Quarto q : listaQuartos){
                    System.out.print("\n\nID: " + q.getId());
                    System.out.print("\nNOME DO QUARTO: " + q.getNomeQuarto());
                    System.out.print("\nQUANTIDADE DE CAMAS: " + q.getQtdeCamas());
                    System.out.print("\nTEM BANHEIRO [TRUE = sim / FALSE = nao]: " + q.isTemBanheiro());
                    System.out.print("\nDESCRICAO: " + q.getDescricao());
                }

                System.out.print("\nDeseja continuar na AREA DOS QUARTO? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    quarto();
                } else {
                    break;
                }

            case 0:
                break;

            default:
                System.out.println("\n---- OPCAO INVALIDA ----");
                quarto();
                break;
        }
    }

    public static void cama(){
        int escolha;
        int sair;
        int codigoCama;
        boolean ehBeliche;
        String posicao = "";
        String descricao = "";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        Cama camas = new Cama();
        CamaDAO camasDAO = new CamaDAO();

        System.out.println("\n********************************");
        System.out.println("*       Area das Camas         *");
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
                System.out.print("\nDigite o CODIGO da cama: ");
                codigoCama = sc.nextInt();
                camas.setCodigoCama(codigoCama);

                System.out.print("Digite se a cama EH BELICHE [Sim = true / nao = false]: ");
                ehBeliche = sc.nextBoolean();
                camas.setEhBeliche(ehBeliche);

                System.out.print("Digite a POSICAO da cama: ");
                posicao = sc.next();
                camas.setPosicao(posicao);

                System.out.print("Digite a DESCRICAO do quarto: ");
                descricao = sc.next();
                camas.setDescricao(descricao);

                camasDAO.inserir(camas);

                System.out.print("\nDeseja continuar na AREA DAS CAMAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cama();
                } else {
                    break;
                }

            case 2:
                System.out.print("\nQual o ID do quarto voce deseja alterar? ");
                int idAlterar = sc.nextInt();
                camas.setId(idAlterar);

                System.out.print("Digite o CODIGO NOVO da cama: ");
                int codigoCamaNova = sc.nextInt();
                camas.setCodigoCama(codigoCamaNova);

                System.out.print("Digite se a cama NOVA EH BELICHE [Sim = true / nao = false]: ");
                boolean ehBelicheNovo = sc.nextBoolean();
                camas.setEhBeliche(ehBelicheNovo);

                System.out.print("Digite a POSICAO NOVA da cama: ");
                String posicaoNOVA = sc.next();
                camas.setPosicao(posicaoNOVA);

                System.out.print("Digite a DESCRICAO NOVA do quarto: ");
                String descricaoNova = sc.next();
                camas.setDescricao(descricaoNova);

                camasDAO.alterar(camas);

                System.out.print("\nDeseja continuar na AREA DAS CAMAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cama();
                } else {
                    break;
                }

            case 3:
                System.out.print("\nQual o ID do quarto voce deseja excluir? ");
                int idExcluir = sc.nextInt();

                camasDAO.excluir(idExcluir);

                System.out.print("\nDeseja continuar na AREA DAS CAMAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cama();
                } else {
                    break;
                }

            case 4:
                List<Cama> listaCamas = camasDAO.getCamas();

                for(Cama c : listaCamas){
                    System.out.print("\n\nID: " + c.getId());
                    System.out.print("\nCODIGO DA CAMA: " + c.getCodigoCama());
                    System.out.print("\nEH BELICHE [TRUE = sim / FALSE = nao]: " + c.isEhBeliche());
                    System.out.print("\nPOSICAO DA CAMA: " + c.getPosicao());
                    System.out.print("\nDESCRICAO: " + c.getDescricao());
                }

                System.out.print("\nDeseja continuar na AREA DAS CAMAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    cama();
                } else {
                    break;
                }

            case 0:
                break;

            default:
                System.out.println("\n---- OPCAO INVALIDA ----");
                cama();
                break;
        }
    }

    public static void reserva(){
        int escolha;
        int sair;
        int idQuarto;
        int idCama;
        int idCliente;
        String dataEntrada = "";
        String dataSaida = "";

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        Reserva reservas = new Reserva();
        ReservaDAO reservaDAO = new ReservaDAO();

        System.out.println("\n********************************");
        System.out.println("*       Area das Reservas      *");
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
                System.out.print("\nDigite o ID do quarto escolhido para fazer a reserva: ");
                idQuarto = sc.nextInt();
                reservas.setIdQuarto(idQuarto);

                System.out.print("Digite o ID da cama escolhida para fazer a reserva: ");
                idCama = sc.nextInt();
                reservas.setIdCama(idCama);

                System.out.print("Digite o ID do cliente cadastrado para fazer a reserva:: ");
                idCliente = sc.nextInt();
                reservas.setIdCliente(idCliente);

                System.out.print("Digite a DATA DE ENTRADA da reserva [DD/MM/AAAA]: ");
                dataEntrada = sc.next();
                reservas.setDataEntrada(dataEntrada);

                System.out.print("Digite a DATA DE SAIDA da reserva [DD/MM/AAAA]: ");
                dataSaida = sc.next();
                reservas.setDataSaida(dataSaida);

                reservaDAO.inserir(reservas);

                System.out.print("\nDeseja continuar na AREA DAS RESERVAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    reserva();
                } else {
                    break;
                }

            case 2:
                System.out.print("\nQual o ID da reserva voce deseja alterar? ");
                int idAlterar = sc.nextInt();
                reservas.setId(idAlterar);

                System.out.print("Digite o ID DO QUARTO NOVO: ");
                int idQuartoNovo = sc.nextInt();
                reservas.setIdQuarto(idQuartoNovo);

                System.out.print("Digite o ID DA CAMA NOVA: ");
                int idCamaNova = sc.nextInt();
                reservas.setIdCama(idCamaNova);

                System.out.print("Digite o ID DO CLIENTE NOVO: ");
                int idClienteNovo = sc.nextInt();
                reservas.setIdCliente(idClienteNovo);

                System.out.print("Digite a DATA DE ENTRADA NOVA [DD/MM/AAAA]: ");
                String dataEntradaNova = sc.next();
                reservas.setDataEntrada(dataEntradaNova);

                System.out.print("Digite a DATA DE SAIDA NOVA [DD/MM/AAAA]: ");
                String dataSaidaNova = sc.next();
                reservas.setDataSaida(dataSaidaNova);

                reservaDAO.alterar(reservas);

                System.out.print("\nDeseja continuar na AREA DAS RESERVAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    reserva();
                } else {
                    break;
                }

            case 3:
                System.out.print("\nQual o ID da reserva voce deseja excluir? ");
                int idExcluir = sc.nextInt();

                reservaDAO.excluir(idExcluir);

                System.out.print("\nDeseja continuar na AREA DAS RESERVAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    reserva();
                } else {
                    break;
                }

            case 4:
                List<Reserva> listaReserva = reservaDAO.getReserva();

                for(Reserva r : listaReserva){
                    System.out.print("\n\nID: " + r.getId());
                    System.out.print("\nID DO QUARTO: " + r.getIdQuarto());
                    System.out.print("\nID DA CAMA: " + r.getIdCama());
                    System.out.print("\nID DO CLIENTE: " + r.getIdCliente());
                    System.out.print("\nDATA DE ENTRADA: " + r.getDataEntrada());
                    System.out.print("\nDATA DE SAIDA: " + r.getDataSaida());
                }

                System.out.print("\nDeseja continuar na AREA DAS RESERVAS? [1 = SIM/ 0 = NAO]: ");
                sair = sc.nextInt();

                if (sair == 1) {
                    reserva();
                } else {
                    break;
                }

            case 0:
                break;

            default:
                System.out.println("\n---- OPCAO INVALIDA ----");
                reserva();
                break;
        }
    }
}