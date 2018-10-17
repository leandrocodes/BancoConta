/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta;

import bancoconta.DAO.AgenciaDAO;
import bancoconta.DAO.ClienteDAO;
import bancoconta.DAO.ContaDAO;
import bancoconta.DAO.FuncionarioDAO;
import java.util.Scanner;

/**
 *
 * @author leand
 */
public class BancoConta {

    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        AgenciaDAO agenciaDAO = new AgenciaDAO();
        ContaDAO contaDAO = new ContaDAO();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Scanner aux = new Scanner(System.in);

        while (true) {
            System.out.println("Inserir uma Conta - Digite 1");
            System.out.println("Buscar uma Conta - Digite 2");
            System.out.println("Sair - Digite 3");

            int op = aux.nextInt();
            boolean exit = false;

            switch (op) {
                case 1:
                    System.out.println("Digite o número da Agência: ");
                    int numero = aux.nextInt();
                    Agencia agencia = agenciaDAO.getAgencia(numero);

                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = aux.nextLine();
                    Cliente cliente = clienteDAO.getCliente(cpf);

                    if (agencia == null || cliente == null) {
                        System.out.println("Não foi possível criar, cliente ou agência inexistentes");
                    } else {
                        System.out.println("Digite o número da conta: ");
                        int nc = aux.nextInt();

                        Conta ct = contaDAO.getConta(nc);

                        if (ct == null) {
                            Conta c = new Conta(nc, 0, agencia, cliente);
                            contaDAO.addConta(c);
                        } else {
                            System.out.println("Conta bancária já existente");
                        }

                    }
                    break;
                case 2:
                    System.out.println("Digite o número da conta: ");
                    int contaBusca = aux.nextInt();
                    Conta c = contaDAO.getConta(contaBusca);

                    if (c != null) {
                        System.out.println("Número: " + c.getNumero());
                        System.out.println("Saldo: " + c.getSaldo());
                        System.out.println("Nome do cliente: " + c.getCliente().getNome());
                    }

                    break;
                case 3:
                    exit = true;
                    break;
            }
            if (exit) {
                break;
            }
        }

    }

}
