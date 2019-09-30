package com.newsoft.mercadinho.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	@NotNull
	@Column(unique=true)
	@Size(min=1, max=80)
	private String nome;
	
	
    @Size(max = 100)
    private String descricao;
	
	@NotNull
	private LocalDate data_cadastro =  LocalDate.now();
	
	@NotNull
	@DecimalMin(value = "0.01")
	@DecimalMax(value = "99999.99")
	private BigDecimal valor_unitario;
	
	@NotNull
	@DecimalMin(value = "0.01")
	@DecimalMax(value = "999.99")
	private BigDecimal estoque;	

	@NotNull
	@Size(max = 2)
    private String unidade;
	
	@NotNull
    private boolean ativo = true;

	public BigDecimal getValor_unitario() {
		return valor_unitario;
	}

	public void setValor_unitario(BigDecimal valor_unitario) {
		this.valor_unitario = valor_unitario;
	}

	public BigDecimal getEstoque() {
		return estoque;
	}

	public void setEstoque(BigDecimal estoque) {
		this.estoque = estoque;
	}

	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public LocalDate getData_cadastro() {
	
		return data_cadastro;
	}

	public void setData_cadastro(LocalDate data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
    

	
}
