/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta.DAO;

import bancoconta.Cliente;
import java.util.LinkedList;

/**
 *
 * @author leand
 */
public class ClienteDAO {
    private LinkedList <Cliente> lista = new LinkedList<>();
    
    public Cliente getCliente(String cpf){
        for (int i = 0; i < lista.size(); i++) {
            Cliente cliente = lista.get(i);
            String cpf_cliente = cliente.getCpf();
            if(cpf.equals(cpf_cliente)){
                return cliente;
            }
        }
        return null;
    }
    
    public void addCliente(Cliente cliente){
        lista.add(cliente);
    }
}
