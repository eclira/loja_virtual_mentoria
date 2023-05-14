package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cup_desc")
@SequenceGenerator(name= "seq_cup_desc", sequenceName = "seq_cup_desc", allocationSize = 1, initialValue = 1 )
public class CupDesc implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cup_desc")
	private Long id;
	
	@Column(name = "cod_descricao", nullable = false)
	private String codDescricao;
	
	@Column(name = "valor_real_desc", nullable = false)
	private BigDecimal valorRealDesc;
	
	@Column(name = "valor_porcento_desc", nullable = false)
	private BigDecimal valorPorcentoDesc;
	
	@Column(name = "data_valiade_cupom", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataValiadeCupom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodDescricao() {
		return codDescricao;
	}

	public void setCodDescricao(String codDescricao) {
		this.codDescricao = codDescricao;
	}

	public BigDecimal getValorRealDesc() {
		return valorRealDesc;
	}

	public void setValorRealDesc(BigDecimal valorRealDesc) {
		this.valorRealDesc = valorRealDesc;
	}

	public BigDecimal getValorPorcentoDesc() {
		return valorPorcentoDesc;
	}

	public void setValorPorcentoDesc(BigDecimal valorPorcentoDesc) {
		this.valorPorcentoDesc = valorPorcentoDesc;
	}

	public Date getDataValiadeCupom() {
		return dataValiadeCupom;
	}

	public void setDataValiadeCupom(Date dataValiadeCupom) {
		this.dataValiadeCupom = dataValiadeCupom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CupDesc other = (CupDesc) obj;
		return Objects.equals(id, other.id);
	}
	

}
