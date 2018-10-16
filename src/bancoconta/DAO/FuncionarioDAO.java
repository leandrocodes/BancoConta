/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta.DAO;

import bancoconta.Funcionario;
import java.util.LinkedList;

/**
 *
 * @author leand
 */
public class FuncionarioDAO {
    private LinkedList <Funcionario> lista = new LinkedList<>();
    
    public Funcionario getFuncionario(String cpf){
        for(int i = 0; i < lista.size(); i++){
            Funcionario funcionario = lista.get(i);
            String cpf_funcionario = funcionario.getCpf();
            if(cpf.equals(cpf_funcionario)){
                return funcionario;
            }
        }
        return null;
    }
    
    public void addFuncionario(Funcionario funcionario){
        lista.add(funcionario);
    }
}
