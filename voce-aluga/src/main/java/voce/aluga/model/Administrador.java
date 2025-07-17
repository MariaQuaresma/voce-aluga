package voce.aluga.model;

<<<<<<< HEAD
import javax.persistence.*;
=======
import jakarta.persistence.Entity;
>>>>>>> main

@Entity
public class Administrador extends Usuario {

    public boolean validarCadastro(Cliente cliente) {
        return cliente != null && cliente.getCpf() != null && cliente.getCnh() != null;
    }

    public void gerenciarManutencao() {
        System.out.println("Manutenção registrada ou atualizada pelo administrador.");
    }

    public void definirRegras(String regra) {
        System.out.println("Nova regra definida: " + regra);
    }

    public void receberRequisicao(String requisicao) {
        System.out.println("Requisição recebida: " + requisicao);
    }

    public void aprovarRequisicao(String requisicao) {
        System.out.println("Requisição aprovada: " + requisicao);
    }
}
