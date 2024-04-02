/*
 * Copyright (C) 2024 Christian Amsberg Janner <janner.chris15@outlook.com>
 * Copyright (C) 2024 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex4;

/**
 *
 *@author1 Christian Amsberg Janner <janner.chris15@outlook.com>
 *@author2 Pedro Sousa Assumpção <pedroheitor55@gmail.com>
 *@date 01/04/2024
 *brief class CafeShop
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CafeShop {
    public static void main(String[] args) {
        CafeShop cafeShop = new CafeShop();
        cafeShop.inicializar();
        cafeShop.executar();
    }

    private Map<Integer, Produto> menu;
    private double totalConta;
    private Scanner scanner;

    public CafeShop() {
        menu = new HashMap<>();
        scanner = new Scanner(System.in);
        totalConta = 0.0;
    }

    public void inicializar() {
        menu.put(1, new Produto("Café expresso", 0.75));
        menu.put(2, new Produto("Café capuccino", 1.0));
        menu.put(3, new Produto("Leite com café", 1.25));
        menu.put(4, new Produto("Brigadeiro", 2.00));
        menu.put(5, new Produto("Chá Gelado", 1.50));
        menu.put(6, new Produto("Empada", 1.75));
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    mostrarTotalConta();
                    break;
                case 4:
                    pagarParteConta();
                    break;
                case 5:
                    pagarTotalConta();
                    break;
                case 6:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
    }

    private void exibirMenu() {
        System.out.println("\nMENU DE OPÇÕES: ");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Mostrar total da conta");
        System.out.println("4 - Pagar parte da conta");
        System.out.println("5 - Pagar total da conta");
        System.out.println("6 - Sair");
    }

    private void adicionarProduto() {
        System.out.println("\nADICIONAR PRODUTO: ");
        System.out.println("Escolha o produto:");
        menu.forEach((key, value) -> System.out.println(key + " - " + value.getNome()));
        int produtoSelecionado = scanner.nextInt();
        Produto produto = menu.get(produtoSelecionado);
        if (produto != null) {
            System.out.println("Informe a quantidade:");
            int quantidade = scanner.nextInt();
            if (quantidade > 0) {
                totalConta += produto.getPreco() * quantidade;
                System.out.println("Produto adicionado com sucesso!");
            } else {
                System.out.println("Quantidade inválida. Tente novamente.");
            }
        } else {
            System.out.println("Produto inválido. Tente novamente.");
        }
    }

    private void removerProduto() {
        // Aqui você pode implementar a remoção de produtos da lista de compras
        System.out.println("\nREMOVER PRODUTO: ");
        // Implementação não fornecida, pois depende de como a lista de compras está sendo armazenada
    }

    private void mostrarTotalConta() {
        System.out.println("\nTOTAL DA CONTA: " + totalConta);
    }

    private void pagarParteConta() {
        System.out.println("\nPAGAR PARTE DA CONTA: ");
        System.out.println("Informe o valor a ser pago:");
        double valorPago = scanner.nextDouble();
        if (valorPago <= totalConta) {
            totalConta -= valorPago;
            System.out.println("Valor pago com sucesso!");
        } else {
            System.out.println("Valor excede o total da conta. Tente novamente.");
        }
    }

    private void pagarTotalConta() {
        System.out.println("\nPAGAR TOTAL DA CONTA: ");
        System.out.println("Total da conta: " + totalConta);
        totalConta = 0.0;
        System.out.println("Conta paga com sucesso!");
    }

    private void sair() {
        if (totalConta > 0) {
            System.out.println("Conta em aberto. Por favor, pague a conta antes de sair.");
        } else {
            System.out.println("Encerrando o programa. Obrigado por utilizar!");
        }
    }
}