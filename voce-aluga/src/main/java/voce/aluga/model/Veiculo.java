package voce.aluga.model;

<<<<<<< HEAD
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "VEICULO")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String placa;
    private Integer ano;
    private String status;
    private BigDecimal quilometragem;
    private BigDecimal capacidadeTanque;
    
    @Temporal(TemporalType.DATE)
    private Date dataProximaManutencao;
    
    private BigDecimal consumoMedio;
    
    @Column(name = "grupoVeiculo")
    private Integer grupoVeiculo;
    
    @Column(name = "filialId")
    private Integer filialId;

    // Campos adicionais para compatibilidade com frontend
    private String marca;
    private String cor;
    private String categoria;
    private BigDecimal preco_diario;
    private Integer km_atual;

    public Veiculo() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
=======
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private LocalDate ano;

    @Column(nullable = false, unique = true)
    private String placa;

    @Column(nullable = false)
    private int quilometragem;

    @Column(nullable = false)
    private int capacidadeTanque;

    @Column(nullable = false)
    private float consumoMedio;

    @Column(nullable = false)
    private LocalDate dataProximaManutencao;

    @Column(columnDefinition = "TEXT")
    private String historicoManutencao;

    @Column(nullable = false)
    private String status; 

    @Column(nullable = false)
    private Integer filialId;

    @Column(nullable = false)
    private String grupo;


    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void atualizarFilial(Integer novaFilialId) {
        this.filialId = novaFilialId;
    }

    public int calcularAutonomia() {
        return Math.round(capacidadeTanque * consumoMedio);
    }

    public LocalDate verificarProximaManutencao() {
        return this.dataProximaManutencao;
    }

    public void verificarPlaca(String placaInformada) {
        if (!this.placa.equalsIgnoreCase(placaInformada)) {
            throw new IllegalArgumentException("Placa informada não corresponde ao veículo.");
        }
    }

    public boolean isAlugado() {
        return this.status.equalsIgnoreCase("alugado");
    }

    public boolean isEmManutencao() {
        return this.status.equalsIgnoreCase("em manutenção");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
>>>>>>> main
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }
<<<<<<< HEAD
=======

>>>>>>> main
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

<<<<<<< HEAD
    public String getPlaca() {
        return placa;
    }
=======
    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

>>>>>>> main
    public void setPlaca(String placa) {
        this.placa = placa;
    }

<<<<<<< HEAD
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
=======
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public float getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(float consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public LocalDate getDataProximaManutencao() {
        return dataProximaManutencao;
    }

    public void setDataProximaManutencao(LocalDate dataProximaManutencao) {
        this.dataProximaManutencao = dataProximaManutencao;
    }

    public String getHistoricoManutencao() {
        return historicoManutencao;
    }

    public void setHistoricoManutencao(String historicoManutencao) {
        this.historicoManutencao = historicoManutencao;
>>>>>>> main
    }

    public String getStatus() {
        return status;
    }
<<<<<<< HEAD
=======

>>>>>>> main
    public void setStatus(String status) {
        this.status = status;
    }

<<<<<<< HEAD
    public BigDecimal getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(BigDecimal quilometragem) {
        this.quilometragem = quilometragem;
    }

    public BigDecimal getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(BigDecimal capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public Date getDataProximaManutencao() {
        return dataProximaManutencao;
    }
    public void setDataProximaManutencao(Date dataProximaManutencao) {
        this.dataProximaManutencao = dataProximaManutencao;
    }

    public BigDecimal getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(BigDecimal consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public Integer getGrupoVeiculo() {
        return grupoVeiculo;
    }
    public void setGrupoVeiculo(Integer grupoVeiculo) {
        this.grupoVeiculo = grupoVeiculo;
    }

    public Integer getFilialId() {
        return filialId;
    }
=======
    public Integer getFilialId() {
        return filialId;
    }

>>>>>>> main
    public void setFilialId(Integer filialId) {
        this.filialId = filialId;
    }

<<<<<<< HEAD
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getPreco_diario() {
        return preco_diario;
    }
    public void setPreco_diario(BigDecimal preco_diario) {
        this.preco_diario = preco_diario;
    }

    public Integer getKm_atual() {
        return km_atual;
    }
    public void setKm_atual(Integer km_atual) {
        this.km_atual = km_atual;
    }
=======
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    
>>>>>>> main
}
