/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Evaldo
 */
public class Funcionario {
      private int codigo;
      private String nome;
      private String sobrenome;
      private int idade;
      private double salario;

    public Funcionario() {
    }
    
    
    public Funcionario(int codigo, String nome, String sobrenome, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
      
      
      
      
}
