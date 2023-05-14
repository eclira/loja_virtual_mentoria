package jdev.mentoria.lojavirtual.enums;

public enum StatusContaReceber {

	COBRANCA("Cobraça"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	QUITADA("Quitada"),	
	RENEGOCIADA("Renegociada");	
	
	
	private String descricao;

	private StatusContaReceber(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.descricao;
	}
}
