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
        
        
        while(true){
            System.out.println("Inserir uma Conta - Digite 1");
            System.out.println("Buscar uma Conta - Digite 2");
            System.out.println("Sair - Digite 3");
        
        int op = aux.nextInt();
        boolean exit = false;
        
        switch(op){
            case 1:
                   System.out.println("Digite o número da Agência: ");
                   int numero = aux.nextInt();
                   Agencia agencia = agenciaDAO.getAgencia(numero);
                   
                   System.out.println("");
        }
        }
        
    }
    
}
