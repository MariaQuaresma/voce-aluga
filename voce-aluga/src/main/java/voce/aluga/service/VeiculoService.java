package voce.aluga.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import voce.aluga.model.Veiculo;
import voce.aluga.repository.VeiculoRepository;
=======
import voce.aluga.model.Veiculo;
import voce.aluga.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
>>>>>>> main

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

<<<<<<< HEAD
    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

=======
>>>>>>> main
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

<<<<<<< HEAD
    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public void deletar(Long id) {
        veiculoRepository.deleteById(id);
    }

    public List<Veiculo> buscarPorStatus(String status) {
        return veiculoRepository.findByStatus(status);
    }

    public List<Veiculo> buscarPorCategoria(String categoria) {
        return veiculoRepository.findByCategoria(categoria);
    }

    public List<Veiculo> buscarPorMarca(String marca) {
        return veiculoRepository.findByMarca(marca);
    }

    public List<Veiculo> buscarPorFilial(Integer filialId) {
        return veiculoRepository.findByFilialId(filialId);
    }

    public List<Veiculo> listarPorStatus(String status) {
        return veiculoRepository.findByStatus(status);
    }

    public void atualizarStatus(Long id, String novoStatus) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            Veiculo v = veiculo.get();
            v.setStatus(novoStatus);
            veiculoRepository.save(v);
        }
    }
=======
    public Optional<Veiculo> buscarPorId(Integer id) {
        return veiculoRepository.findById(id);
    }

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo atualizarVeiculo(Integer id, Veiculo novo) {
        return veiculoRepository.findById(id).map(v -> {
            v.setModelo(novo.getModelo());
            v.setAno(novo.getAno());
            v.setPlaca(novo.getPlaca());
            v.setQuilometragem(novo.getQuilometragem());
            v.setCapacidadeTanque(novo.getCapacidadeTanque());
            v.setConsumoMedio(novo.getConsumoMedio());
            v.setDataProximaManutencao(novo.getDataProximaManutencao());
            v.setHistoricoManutencao(novo.getHistoricoManutencao());
            v.setStatus(novo.getStatus());
            v.setFilialId(novo.getFilialId());
            v.setGrupo(novo.getGrupo());
            return veiculoRepository.save(v);
        }).orElseThrow(() -> new RuntimeException("Veículo não encontrado"));
    }

    public void deletar(Integer id) {
        veiculoRepository.deleteById(id);
    }
>>>>>>> main
}
