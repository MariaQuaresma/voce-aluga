package voce.aluga.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import voce.aluga.model.Veiculo;
import voce.aluga.service.VeiculoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
@CrossOrigin(origins = "http://localhost:3000")
=======
import voce.aluga.model.Veiculo;
import voce.aluga.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
>>>>>>> main
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

<<<<<<< HEAD
    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Veiculo> buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Veiculo atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        veiculo.setId(id);
        return veiculoService.salvar(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        veiculoService.deletar(id);
    }

    @GetMapping("/disponiveis")
    public List<Veiculo> listarDisponiveis() {
        return veiculoService.listarPorStatus("disponivel");
    }

    @PostMapping("/{id}/manutencao")
    public void enviarParaManutencao(@PathVariable Long id) {
        veiculoService.atualizarStatus(id, "manutencao");
    }

    @PostMapping("/{id}/disponivel")
    public void marcarComoDisponivel(@PathVariable Long id) {
        veiculoService.atualizarStatus(id, "disponivel");
=======
    @GetMapping
    public ResponseEntity<List<Veiculo>> listarTodos() {
        try {
            return ResponseEntity.ok(veiculoService.listarTodos());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Integer id) {
        try {
            return veiculoService.buscarPorId(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping
    public ResponseEntity<Veiculo> cadastrar(@RequestBody Veiculo veiculo) {
        try {
            return ResponseEntity.ok(veiculoService.cadastrarVeiculo(veiculo));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Integer id, @RequestBody Veiculo novo) {
        try {
            return ResponseEntity.ok(veiculoService.atualizarVeiculo(id, novo));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        try {
            veiculoService.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
>>>>>>> main
    }
}
