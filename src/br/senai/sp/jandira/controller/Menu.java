package br.senai.sp.jandira.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while (continuar){
            System.out.println("/-        Bem Vindo        -/");
            System.out.println("/---------------------------/");
            System.out.println("/-            Menu          /");
            System.out.println("1 - cadastrar funcionario    ");
            System.out.println("2 -    listar funcionario    ");
            System.out.println("3 -   deletar funcionario    ");
            System.out.println("4 - pesquisar funcionario    ");
            System.out.println("5 - atualizar salario        ");
            System.out.println("6 -         sair             ");
            System.out.println("/---------------------------/");

            Scanner scanner = new Scanner(System.in);

            int opcao = scanner.nextInt();
            scanner.nextLine();

            FuncionarioController funcionarioController = new FuncionarioController();

            switch (opcao){
                case 1:
                    FuncionarioController funcionarioController1 = new FuncionarioController();

                    break;

                case 2:
                    funcionarioController.listarFuncionarios();
                    break;

                case 3:
                    System.out.println(" informe o nome de quem deseja deletar ");
                    String nomeDelete = scanner.nextLine();

                    funcionarioController.deletarFuncionarios(nomeDelete);

                    break;

                case 4:
                    System.out.println("informe o nome que deseja pesquisar");
                    String nomePesquisado = scanner.nextLine();
                    funcionarioController.pesquisarFuncionarios(nomePesquisado);
                    break;

                case 5:
                    System.out.println(" informeo nome que deseja atualizar");
                    String nomeSalario =scanner.nextLine();
                    System.out.println("informe o novo salario");
                    Double newSalario = scanner.nextDouble();
                    scanner.nextLine();

                    funcionarioController.atualizarSalario(nomeSalario, newSalario);
                    break;

                case 6:
                    continuar = false;
                    break;
            }

        }
    }
}
