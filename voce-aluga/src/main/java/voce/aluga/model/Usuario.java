package voce.aluga.model;

import javax.persistence.*;

@Entity
<<<<<<< HEAD
@Table(name = "USUARIO")
public class Usuario {
=======
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

>>>>>>> main
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false, unique = true, length = 255)
    private String endereco;

    @Column(nullable = false, unique = true, length = 255)
    private String email;
    private String senha;
    private String tipo; // "admin" ou "cliente"
    private String cpf;
    private String telefone;
    
    @Column(name = "CNH")
    private String cnh;

    @Column(nullable = false, length = 255)
    private String senha;

    public Usuario() {}

<<<<<<< HEAD
    public Usuario(String nome, String endereco, String email, String senha, String tipo) {
=======
    public Usuario(String nome, String endereco, String email, String senha) {
>>>>>>> main
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
<<<<<<< HEAD
        this.tipo = tipo;
    }

    // Getters e Setters
    public Long getId() {
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
=======
    }

    public Long getId() { 
        return id; 
    }
>>>>>>> main

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getEndereco() { 
        return endereco; 
    }
    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

<<<<<<< HEAD
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
=======
    public String getSenha() { 
        return senha; 
    }

    public void setSenha(String senha) { 
        this.senha = senha; 
>>>>>>> main
    }
}
