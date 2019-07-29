package testesFrank.model;

public class Conta {

	public int numeroDaConta;
	protected String tipoDaConta;
	private String donoConta;
	private float saldo;
	private boolean status;

	public Conta() {
		saldo = 0;
		status = false;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTipoDaConta() {
		return tipoDaConta;
	}

	public void setTipoDaConta(String tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipoDaConta) {
		setTipoDaConta(tipoDaConta);
		setStatus(true);

		if (tipoDaConta == "cc") {
			setSaldo(50);
		} else if (tipoDaConta == "cp") {
			setSaldo(150);
		} else {
			System.out.println("Não é possivel efetuar a Abertura de conta usando o tipo: " + tipoDaConta);
		}

	}

	public void fecharConta() {
		if (getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (getSaldo() < 0) {
			System.out.println("Conta em debito");
		} else {
			setStatus(false);
			System.out.println("Conta Fechada");
		}
	}

	public void depositar(float deposito) {

		if (isStatus() == true) {
			setSaldo(getSaldo() + deposito);
		} else {
			System.out.println("Impossivel Depositar");
		}
	}

	public void sacar(float sacar) {
		if (isStatus() == true) {
			if (getSaldo() >= sacar) {

				setSaldo(getSaldo() - sacar);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel sacar");

		}

	}

	public void pagarMensal() {
		float valorMensalidade;
		if (getTipoDaConta() == "cc") {
			valorMensalidade = 12;
		} else {
			valorMensalidade = 20;
		}
		if (isStatus() == true) {
			if (getSaldo() > valorMensalidade) {
				setSaldo(getSaldo() - valorMensalidade);
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Impossivel pagar");
		}
	}

	@Override
	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", tipoDaConta=" + tipoDaConta + ", donoConta=" + donoConta
				+ ", saldo=" + saldo + ", status=" + status + "]";
	}

}