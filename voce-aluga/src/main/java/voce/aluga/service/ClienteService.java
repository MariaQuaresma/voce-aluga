package voce.aluga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voce.aluga.model.Cliente;
import voce.aluga.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

<<<<<<< HEAD
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void deletar(Long id) {
=======
    public Optional<Cliente> buscarPorId(long id) {
        return clienteRepository.findById(id);
    }

    public void deletar(long id) {
>>>>>>> main
        clienteRepository.deleteById(id);
    }

    public Cliente login(String email, String senha) {
        return clienteRepository.findByEmailAndSenha(email, senha);
    }
}
