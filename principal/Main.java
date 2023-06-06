package principal;

import java.util.ArrayList;
import java.util.Scanner;

import principal.interno.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Bem-vindo à nossa loja de suplementos, a TG suplementos");
            System.out.println("Nós da TG suplementos, incentivamos a prática de atividades físicas, como a musculação e a prática de exercícios aeróbicos, pois essa é uma forma de cuidar da sua saúde e do seu bem-estar. Além de melhorar o desempenho social, praticar exercícios físicos regularmente ajuda a prevenir diversas doenças e a melhorar a saúde mental.");
            System.out.println("Por favor, informe seus dados para concluirmos seu cadastro e prosseguirmos com sua compra!:");

            System.out.print("Nome completo: ");
             input.nextLine();

            System.out.print("CPF: ");
             input.nextLine();

            System.out.print("E-mail: ");
             input.nextLine();

            System.out.print("Telefone: ");
             input.nextLine();
        
            CadastroCliente cliente = new CadastroClienteBuilder()
            .nome(input.nextLine())
            .cpf(input.nextLine())
            .email(input.nextLine())
            .telefone(input.nextLine())
            .build();

            System.out.println();
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println();
            ArrayList<ProdutoSuplemento> produtos = new ArrayList<>();
            Estoque estoque = new Estoque();
            ProdutoSuplemento produto1 = new WheyProtein("Whey Protein", 100.00, "Suplemento proteico", 100);
            ProdutoSuplemento produto2 = new Termogenico("Termogênico", 80.00, "Suplemento que acelera o metabolismo", 50);
            ProdutoSuplemento produto3 = new Glutamina("Glutamina", 60.00,"importantíssima para o metabolismo de um corpo saudável", 30);
            ProdutoSuplemento produto4 = new Creatina("Creatina", 75.00, "recurso ergogênico eficaz devido auxílio no ganho de massa muscular e melhora do desempenho físico", 50);
            estoque.adicionarProduto(produto1);
            estoque.adicionarProduto(produto2);
            estoque.adicionarProduto(produto3);
            estoque.adicionarProduto(produto4);

            produtos = (ArrayList<ProdutoSuplemento>) estoque.listarProdutos();

            int opcao = 0;

            while (opcao != 4) {
                System.out.println("Escolha uma opção abaixo:");
                System.out.println("1 - FAQ");
                System.out.println("2 - Compras");
                System.out.println("3 - Avaliação Física");
                System.out.println("4 - Sair");

                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Dúvidas pertinentes dos clientes ao entrar no mundo da Musculação: ");
                        System.out.println("Descrição dos Biotipos do corpo:");
                        System.out.println("Ectomorfo: corpo magro, pouca gordura e dificuldade em ganhar massa muscular.");
                        System.out.println("Endomorfo: corpo com maior facilidade em acumular gordura, mais lento no ganho de massa muscular.");
                        System.out.println("Mesomorfo: corpo com facilidade em ganhar massa muscular e pouca gordura.");

                        System.out.println("Descrição dos Produtos:");
                        System.out.println("Whey Protein: suplemento proteico para ganho de massa muscular.");
                        System.out.println("Creatina: suplemento que ajuda no ganho de força e resistência muscular.");
                        System.out.println("Termogênicos: suplemento que acelera o metabolismo e auxilia na queima de gordura.");
                        break;

                        case 2:
                        if (produtos.isEmpty()) {
                            System.out.println("Não há produtos disponíveis no estoque.");
                        } else {
                            System.out.println("Produtos disponíveis:");
                            for (int i = 0; i < produtos.size(); i++) {
                                ProdutoSuplemento produto = produtos.get(i);
                                System.out.println(i + 1 + " - " + produto.getNome() + " - R$ " + produto.getPreco() + " - " + produto.getDescricao() + " - Quantidade em estoque: " + produto.getQuantidade());
                            }

                            System.out.print("Escolha o produto que deseja comprar: ");
                            int produtoEscolhido = input.nextInt();
                            input.nextLine(); // consome a quebra de linha

                            ProdutoSuplemento produto = produtos.get(produtoEscolhido - 1);

                            System.out.print("Quantidade desejada: ");
                            int quantidade = input.nextInt();
                            input.nextLine(); // consome a quebra de linha

                            System.out.print("Digite a região (ZN ou ZS): ");
                            String regiao = input.nextLine();

                            CalculadoraFrete calculadoraFrete;

                            if (regiao.equals("ZN")) {
                            calculadoraFrete = new CalculadoraFreteZN();
                            }   else if (regiao.equals("ZS")) {
                            calculadoraFrete = new CalculadoraFreteZS();
                            }   else {
                            System.out.println("Região não identificada");
                                continue;
                        }
                            Frete frete = new Frete(calculadoraFrete);
                            double valorFrete = frete.calcularFrete();

                            if (valorFrete < 0) {
                                System.out.println("Região não identificada");
                            } else {
                                double valorTotal = produto.getPreco() * quantidade + valorFrete;

                                if (estoque.verificarDisponibilidade(produto, quantidade)) {
                                    System.out.println("Compra realizada com sucesso!");
                                    System.out.println("Escolha a forma de pagamento:");
                                    System.out.println("1 - Cartão de Crédito");
                                    System.out.println("2 - Boleto Bancário");
                                    int formaPagamento = input.nextInt();
                                    input.nextLine();

                                    if (formaPagamento == 1) {
                                    } else {
                                    }
                                    cliente.comprarProduto(produto, quantidade);
                                    System.out.println("O valor total da compra foi de R$ " + valorTotal);
                                    estoque.atualizarEstoque(produto, quantidade);
                                } else {
                                    System.out.println("Infelizmente não temos essa quantidade disponível no estoque.");
                                }
                            }
                        }
                        break;


                        case 3:
                        System.out.println("Calcular IMC:");
                    
                        System.out.print("Digite sua idade: ");
                        input.nextInt();
                        input.nextLine();
                    
                        System.out.print("Digite sua altura em metros: ");
                        double altura = input.nextDouble();
                        input.nextLine();
                    
                        System.out.print("Digite seu peso em quilos: ");
                        double peso = input.nextDouble();
                        input.nextLine();
                    
                        double imc = CalculadoraIMC.calcularIMC(peso, altura);
                    
                        System.out.println("Seu IMC é: " + imc);
                    
                        String biotipo = BioTipo.getBiotipo(imc);
                        System.out.println("Seu biotipo é: " + biotipo);
                    
                        break;

                    case 4:
                        System.out.println("Obrigado por escolher a TG Suplementos! Volte sempre!");
                        break;

                    default:
                        System.out.println("Opção inválida, por favor escolha uma opção válida.");

                        break;
                }

                System.out.println();
            }

            input.close();
        }
    }
}
