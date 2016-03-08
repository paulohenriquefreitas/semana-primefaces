package com.algaworks.comercial.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name="orcamento")
public class Orcamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String cliente;
	
	@NotEmpty
	@CPF
	private String cpf;
	
	@NotEmpty	
	private String telefone;	
	
	@Column(name="condicao_pagamento")
	private String condicaoPagamento;
	
	@Column(name="dias_entrega")
	private String diasEntrega;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_validade")
	private Date dataValidade;
}
