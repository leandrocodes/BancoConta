/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoconta;

/**
 *
 * @author leand
 */
public class Agencia {
    private Funcionario gerente;
    private String endereco;
    private int numero;

    public Agencia(Funcionario gerente, String endereco, int numero) {
        this.gerente = gerente;
        this.endereco = endereco;
        this.numero = numero;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
