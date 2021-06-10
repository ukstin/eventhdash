package br.com.ukstin.eventdash.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="itmn_evento")
public class Evento {
	
	@Column(name="num_seq")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numSeq;
	
	@Column(name="data_evt")
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "id_alarme")
	private Alarme alarme;
	
	@ManyToOne
	@JoinColumn(name = "id_equip")
	private Equipamento equipamento;

	public int getNumSeq() {
		return numSeq;
	}

	public void setNumSeq(int numSeq) {
		this.numSeq = numSeq;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Alarme getAlarme() {
		return alarme;
	}

	public void setAlarme(Alarme alarme) {
		this.alarme = alarme;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
}
