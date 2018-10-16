/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta.DAO;

import bancoconta.Conta;
import java.util.LinkedList;

/**
 *
 * @author leand
 */
public class ContaDAO {
    private LinkedList<Conta> lista = new LinkedList<>();
    
    public Conta getConta(int numero){
        for(int i = 0; i < lista.size(); i++){
            Conta conta = lista.get(i);
            int numero_conta = conta.getNumero();
            if(numero_conta == numero){
                return conta;
            }
        }
        return null;
    }
    
    public void addConta(Conta conta){
        lista.add(conta);
    }
}
