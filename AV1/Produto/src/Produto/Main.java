package Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Produto> produtos;

    public Main() {
        this.produtos = new ArrayList<>();
    }

    public void incluir() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ID do produto: ");
        int id = sc.nextInt();

        System.out.print("Digite o CODIGO DE BARRAS do produto: ");
        long codigoDeBarras = sc.nextLong();

        System.out.print("Digite o SKU do produto: ");
        String sku = sc.next();

        System.out.print("Digite o NOME do produto: ");
        String nome = sc.next();

        System.out.print("Digite a DESCRICAO do produto: ");
        String descricao = sc.next();

        System.out.print("Digite a CATEGORIA do produto: ");
        String categoria = sc.next();

        System.out.print("Digite o PRECO do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite o PESO (em gramas) do produto: ");
        double peso = sc.nextDouble();

        System.out.print("Digite o FABRICANTE do produto: ");
        String fabricante = sc.next();

        Produto produto = new Produto(id, codigoDeBarras, sku, nome, descricao, categoria, preco, peso, fabricante);

        produtos.add(produto);

        System.out.println("\n------ Produto adicionado! ------");
    }

    public void alterar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ID do produto a ser alterado: ");
        int id = sc.nextInt();

        Produto encontrarProduto = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                encontrarProduto = produto;
                break;
            }
        }

        if (encontrarProduto == null) {
            System.out.println("\n------ Produto nao encontrado! ------");
        }
        else{
            System.out.print("\nDigite o NOVO CODIGO DE BARRAS do produto: ");
            long codigoDeBarras = sc.nextLong();
            encontrarProduto.setCodigoDeBarras(codigoDeBarras);

            System.out.print("Digite o NOVO SKU do produto: ");
            String sku = sc.next();
            encontrarProduto.setSku(sku);

            System.out.print("Digite o NOVO NOME do produto: ");
            String nome = sc.next();
            encontrarProduto.setNome(nome);

            System.out.print("Digite a NOVA DESCRICAO do produto: ");
            String descricao = sc.next();
            encontrarProduto.setDescricao(descricao);

            System.out.print("Digite a NOVA CATEGORIA do produto: ");
            String categoria = sc.next();
            encontrarProduto.setCategoria(categoria);

            System.out.print("Digite o NOVO PRECO do produto: ");
            double preco = sc.nextDouble();
            encontrarProduto.setPreco(preco);

            System.out.print("Digite o NOVO PESO do produto: ");
            double peso = sc.nextDouble();
            encontrarProduto.setPeso(peso);

            System.out.print("Digite o NOVO FABRICANTE do produto: ");
            String fabricante = sc.next();
            encontrarProduto.setFabricante(fabricante);

            System.out.print("\n------ Produto alterado! ------");
        }
    }

    public void excluir() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Digite o ID do produto que deseja excluir: ");
        int id = sc.nextInt();

        Produto encontrarProduto = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                encontrarProduto = produto;
                break;
            }
        }

        if (encontrarProduto == null) {
            System.out.println("\n------ Produto nao encontrado! ------");
        }
        else{
            produtos.remove(encontrarProduto);
            System.out.println("\n------ Produto excluido! ------");
        }

    }

    public void listarTodos() {
        for (Produto produto : produtos) {
            System.out.println("\nID: " + produto.getId());
            System.out.println("CODIGO DE BARRAS: " + produto.getCodigoDeBarras());
            System.out.println("SKU: " + produto.getSku());
            System.out.println("NOME: " + produto.getNome());
            System.out.println("DESCRICAO: " + produto.getDescricao());
            System.out.println("CATEGORIA: " + produto.getCategoria());
            System.out.println("PRECO: " + produto.getPreco());
            System.out.println("PESO: " + produto.getPeso());
            System.out.println("FABRICANTE: " + produto.getFabricante());
        }
    }

    public void listarUm() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o ID do produto que deseja listar: ");
        int id = sc.nextInt();

        Produto encontrarProduto = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                encontrarProduto = produto;
                break;
            }
        }

        if (encontrarProduto == null) {
            System.out.println("\n------ Produto nao encontrado! ------");
        }
        else{
            System.out.println("\nID: " + encontrarProduto.getId());
            System.out.println("CODIGO DE BARRAS: " + encontrarProduto.getCodigoDeBarras());
            System.out.println("SKU: " + encontrarProduto.getSku());
            System.out.println("NOME: " + encontrarProduto.getNome());
            System.out.println("DESCRICAO: " + encontrarProduto.getDescricao());
            System.out.println("CATEGORIA: " + encontrarProduto.getCategoria());
            System.out.println("PRECO: " + encontrarProduto.getPreco());
            System.out.println("PESO: " + encontrarProduto.getPeso());
            System.out.println("FABRICANTE: " + encontrarProduto.getFabricante());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n********************************");
            System.out.println("*     Selecione uma opcao      *");
            System.out.println("********************************");
            System.out.println("* 1 - Incluir produto          *");
            System.out.println("* 2 - Alterar produto          *");
            System.out.println("* 3 - Excluir produto          *");
            System.out.println("* 4 - Listar todos os produtos *");
            System.out.println("* 5 - Listar um produto        *");
            System.out.println("* 0 - Sair                     *");
            System.out.println("********************************");
            System.out.print("-> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    main.incluir();
                    break;
                case 2:
                    main.alterar();
                    break;
                case 3:
                    main.excluir();
                    break;
                case 4:
                    main.listarTodos();
                    break;
                case 5:
                    main.listarUm();
                    break;
                case 0:
                    System.out.println("\n------ Encerrando ------");
                    break;
                default:
                    System.out.println("\n------ Opcao Invalida! Selecione uma opcao valida. ------");
                    break;
            }
        }
    }
}