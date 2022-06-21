package hipertrofia.br.com.modelo;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name="id",columnNames = {"id"}))
public class Cartao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Basic(optional=false)
	private int numeroCartao;
	@Basic(optional=false)
	@Column(unique=true)
	private int Cvc;
	@Basic(optional=false)
	private int dataVencimento;
	
	//Cadastro
	public Cartao(int numeroCartao, int Cvc, int dataVencimento) {
		this.numeroCartao = numeroCartao;
		this.Cvc = Cvc;
		this.dataVencimento = dataVencimento;
	}
	//Atualização
	public Cartao(int id, int numeroCartao, int Cvc, int dataVencimento) {
		this.id = id;
		this.numeroCartao = numeroCartao;
		this.Cvc = Cvc;
		this.dataVencimento = dataVencimento;
	}
	public Cartao() {
	}

	public int getId() {
		return id;
	}
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public int getCvc() {
		return Cvc;
	}
	public int getDataVencimento() {
		return dataVencimento;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao=numeroCartao;
	}
	public void setCvc(int Cvc) {
		this.Cvc=Cvc;
	}
	public void setDataVencimento(int dataVencimento) {
		this.dataVencimento=dataVencimento;
	}
	@Override
	public String toString() {
		return "Cartao [id=" + id + ", numeroCartao=" + numeroCartao + ", Cvc=" + Cvc + ", dataVencimento="
				+ dataVencimento + "]";
	}
	
	
	
}
