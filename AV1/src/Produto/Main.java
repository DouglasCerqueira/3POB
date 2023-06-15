package Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Produto> produtos;

    public Main() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do produto:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe o codigo de barras do produto:");
        String codigoDeBarras = scanner.nextLine();

        System.out.println("Informe o SKU do produto:");
        String sku = scanner.nextLine();

        System.out.println("Informe o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Informe a descricao do produto:");
        String descricao = scanner.nextLine();

        System.out.println("Informe a categoria do produto:");
        String categoria = scanner.nextLine();

        System.out.println("Informe o preco do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe o peso do produto:");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Informe o fabricante do produto:");
        String fabricante = scanner.nextLine();

        Produto produto = new Produto(id, codigoDeBarras, sku, nome, descricao, categoria, preco, peso, fabricante);

        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public void alterarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do produto que deseja alterar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }

        System.out.println("Informe o novo codigo de barras do produto:");
        String codigoDeBarras = scanner.nextLine();
        produtoEncontrado.setCodigoDeBarras(codigoDeBarras);

        System.out.println("Informe o novo SKU do produto:");
        String sku = scanner.nextLine();
        produtoEncontrado.setSku(sku);

        System.out.println("Informe o novo nome do produto:");
        String nome = scanner.nextLine();
        produtoEncontrado.setNome(nome);

        System.out.println("Informe a nova descricao do produto:");
        String descricao = scanner.nextLine();
        produtoEncontrado.setDescricao(descricao);

        System.out.println("Informe a nova categoria do produto:");
        String categoria = scanner.nextLine();
        produtoEncontrado.setCategoria(categoria);

        System.out.println("Informe o novo preco do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        produtoEncontrado.setPreco(preco);

        System.out.println("Informe o novo peso do produto:");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        produtoEncontrado.setPeso(peso);

        System.out.println("Informe o novo fabricante do produto:");
        String fabricante = scanner.nextLine();
        produtoEncontrado.setFabricante(fabricante);

        System.out.println("Produto alterado com sucesso!");
    }

    public void excluirProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do produto que deseja excluir:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }

        produtos.remove(produtoEncontrado);

        System.out.println("Produto excluido com sucesso!");
    }

    public void listarTodosProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getId());
            System.out.println(produto.getCodigoDeBarras());
            System.out.println(produto.getSku());
            System.out.println(produto.getNome());
            System.out.println(produto.getDescricao());
            System.out.println(produto.getPreco());
            System.out.println(produto.getPeso());
            System.out.println(produto.getFabricante());
        }
    }

    public void listarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do produto que deseja listar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto produtoEncontrado = null;

        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtoEncontrado = produto;
                break;
            }
        }

        if (produtoEncontrado == null) {
            System.out.println("Produto nao encontrado.");
            return;
        }
        
        System.out.println(produtoEncontrado.getCodigoDeBarras());
        System.out.println(produtoEncontrado.getSku());
        System.out.println(produtoEncontrado.getNome());
        System.out.println(produtoEncontrado.getDescricao());
        System.out.println(produtoEncontrado.getPreco());
        System.out.println(produtoEncontrado.getPeso());
        System.out.println(produtoEncontrado.getFabricante());
    }

    public static void main(String[] args) {
        Main aplicacao = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Incluir produto");
            System.out.println("2 - Alterar produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Listar um produto");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aplicacao.adicionarProduto();
                    break;
                case 2:
                    aplicacao.alterarProduto();
                    break;
                case 3:
                    aplicacao.excluirProduto();
                    break;
                case 4:
                    aplicacao.listarTodosProdutos();
                    break;
                case 5:
                    aplicacao.listarProduto();
                    break;
                case 0:
                    System.out.println("Encerrando a aplicação...");
                    return;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        }
    }
}