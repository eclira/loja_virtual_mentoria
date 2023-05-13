package jdev.mentoria.lojavirtual.enums;

public enum StatusContaPagar {

	COBRANCA("Cobraça"),
	VENCIDA("Vencida"),
	ABERTA("Aberta"),
	QUITADA("Quitada");	
	
	
	private String descricao;

	private StatusContaPagar(String descricao) {
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
