package voce.aluga.model;

import javax.persistence.*;
import java.util.Date;

@Entity
<<<<<<< HEAD
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
=======
public class Cliente extends Usuario {

    @Column(nullable = false, length = 50)
    private String documento;

    @Column(length = 255)
    private String fidelidade;

    @Column
    private boolean listaSuja;

    @Column(nullable = false, unique = true, length = 14)
    private String cpf;

    @Column(nullable = false, unique = true, length = 20)
>>>>>>> main
    private String cnh;
    
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    
    private String status;
    
    @Column(name = "usuarioId")
    private Integer usuarioId;

<<<<<<< HEAD
    public Cliente() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
=======
    public String getDocumento() { 
        return documento; 
    }

    public void setDocumento(String documento) {
         this.documento = documento; 
        }

    public String getFidelidade() { 
        return fidelidade; 
    }

    public void setFidelidade(String fidelidade) { 
        this.fidelidade = fidelidade; 
    }

    public boolean isListaSuja() { 
        return listaSuja; 
    }
    public void setListaSuja(boolean listaSuja) { 
        this.listaSuja = listaSuja; 
    }

    public int resgatarPontosFidelidades() {
        try {
            return Integer.parseInt(fidelidade);
        } catch (NumberFormatException e) {
            return 0;
        }
>>>>>>> main
    }

    public String getCpf() { 
        return cpf; 
    }
    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnh() { 
        return cnh; 
    }
    public void setCnh(String cnh) { 
        this.cnh = cnh; 
    }
    
    public Cliente orElse(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElse'");
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
