package com.home.brewer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name = "cerveja")
@Data
public class Cerveja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;

	@NotBlank(message = "SKU é obrigatório")
	private String sku;

	@NotBlank(message = "Nome é obrigatório")
	private String nome;

	@Size(min = 1, max = 50, message = "O tamanho da descrição deve estar entre 1 e 50")
	private String descricao;

	private BigDecimal valor;

	@Column(name = "teor_alcoolico")
	private BigDecimal teorAlcoolico;

	private BigDecimal comissao;

	@Column(name = "quantidade_estoque")
	private Integer quantidadeEstoque;

	@Enumerated(EnumType.STRING)
	private Origem origem;

	@Enumerated(EnumType.STRING)
	private Sabor sabor;

	@ManyToOne
	@JoinColumn(name = "codigo_estilo")
	private Estilo estilo;

}
