package it.prova.automobileresth2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Automobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modello;
	private String targa;

	@Temporal(TemporalType.DATE)
	private Date dataImmatricolazione;
	private Boolean inProduzione;

	public Automobile(String marca, String modello, String targa, Date dataImmatricolazione, Boolean inProduzione) {
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.dataImmatricolazione = dataImmatricolazione;
		this.inProduzione = inProduzione;
	}

}
