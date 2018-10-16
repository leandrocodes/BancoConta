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
public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String sobrenome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
