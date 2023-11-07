package com.viagenstka.model;

import java.time.LocalDate;

public class Cliente {

	private int idCliente;
	private String nomeCliente;
	private LocalDate dataNascimentoCliente;
	private String telefoneCliente;
	private String loginCliente;
	private String senhaCliente;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public LocalDate getDataNascimentoCliente() {
		return dataNascimentoCliente;
	}

	public void setDataNascimentoCliente(LocalDate dataNascimentoCliente) {
		this.dataNascimentoCliente = dataNascimentoCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	public String getLoginCliente() {
		return loginCliente;
	}

	public void setLoginCliente(String loginCliente) {
		this.loginCliente = loginCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", dataNascimentoCliente="
				+ dataNascimentoCliente + ", telefoneCliente=" + telefoneCliente + ", login=" + loginCliente + ", senha="
				+ senhaCliente + "]";
	}

}
