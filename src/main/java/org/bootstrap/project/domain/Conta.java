package org.bootstrap.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
@NamedQueries({
	@NamedQuery(name = "Conta.findAllByUsuario", query = "SELECT c FROM Conta c WHERE c.usuario = :usuario")})
public class Conta extends AbstractPersistable {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario = new Usuario();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipoconta", nullable = false)
	private TipoConta tipoConta = new TipoConta();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estabelecimento", nullable = false)
	private Estabelecimento estabelecimento = new Estabelecimento();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="conta")
	private List<Parcela> parcelas = new ArrayList<Parcela>();
	
	 

	private double saldoAtual;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	
	

}
