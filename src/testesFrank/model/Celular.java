package testesFrank.model;

public class Celular {
	private String modelo;
	private String sistemaOperacional;
	private float versaoSO;
	private String cor;
	private double valor;
	private Long anoFabricacao;
	private Long imei;
	private boolean ativo;
	private boolean vemComFone;
	private int anoGarantiaExtendida;
	private double Desconto;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public float getVersaoSO() {
		return versaoSO;
	}
	public void setVersaoSO(float versaoSO) {
		this.versaoSO = versaoSO;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Long getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Long getImei() {
		return imei;
	}
	public void setImei(Long imei) {
		this.imei = imei;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isVemComFone() {
		return vemComFone;
	}
	public void setVemComFone(boolean vemComFone) {
		this.vemComFone = vemComFone;
	}
	public int getAnoGarantiaExtendida() {
		return anoGarantiaExtendida;
	}
	public void setAnoGarantiaExtendida(int anoGarantiaExtendida) {
		this.anoGarantiaExtendida = anoGarantiaExtendida;
	}
	public double getDesconto() {
		return Desconto;
	}
	public void setDesconto(double Desconto) {
		this.Desconto = Desconto;
	}
	public double calculaDesconto() {
		return this.getValor() - (this.valor * this.Desconto);
	}
	public String getLabelDefaultParaLED() {
		return this.modelo + " de "+ this.getValor() + " por apenas " + calculaDesconto();
	}
	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", sistemaOperacional=" + sistemaOperacional + ", versaoSO=" + versaoSO
				+ ", cor=" + cor + ", valor=" + valor + ", anoFabricacao=" + anoFabricacao + ", imei=" + imei
				+ ", ativo=" + ativo + ", vemComFone=" + vemComFone + ", anoGarantiaExtendida=" + anoGarantiaExtendida
				+ ", Desconto=" + Desconto + "]";
	}
	
	
	
	
	
	
	
}