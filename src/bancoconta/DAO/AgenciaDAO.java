/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta.DAO;

import bancoconta.Agencia;
import java.util.LinkedList;

/**
 *
 * @author leand
 */
public class AgenciaDAO {
    private LinkedList<Agencia> lista = new LinkedList<>();
    
    
    public Agencia getAgencia(int numero){
        for(int i = 0; i < lista.size(); i++){
            Agencia agencia = lista.get(i);
            int numero_agencia = agencia.getNumero();
            if(numero_agencia == numero){
                return agencia;
            }
        }
        return null;
    }
    
    public void addAgencia(Agencia agencia){
        lista.add(agencia);
    }
}
