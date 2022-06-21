package hipertrofia.br.com.modelo;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name="id",columnNames = {"id"}))
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Basic(optional=false)
	private String referenciaP;
	@Basic(optional=false)
	private String tamanhoP;
	@Basic(optional=false)
	private float precoP;
	@Basic(optional=false)
	private int metodoPagamento;
	
	//Cadastro
	public Pedido(String referenciaP, String tamanhoP, float precoP, int metodoPagamento) {
		this.referenciaP = referenciaP;
		this.tamanhoP = tamanhoP;
		this.precoP = precoP;
		this.metodoPagamento = metodoPagamento;
	}
	//Atualização
	public Pedido(int id, String referenciaP, String tamanhoP, float precoP, int metodoPagamento) {
		this.id = id;
		this.referenciaP = referenciaP;
		this.tamanhoP = tamanhoP;
		this.precoP = precoP;
		this.metodoPagamento = metodoPagamento;
	}
	public Pedido() {
	}
	
	public int getId() {
		return id;
	}

	public String getReferenciaP() {
		return referenciaP;
	}
	public String getTamanhoP() {
		return tamanhoP;
	}
	public float getPrecoP() {
		return precoP;
	}
	public int getMetodoPagamento() {
		return metodoPagamento;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setReferenciaP(String referenciaP) {
		this.referenciaP = referenciaP;
	}
	public void setTamanhoP(String tamanhoP) {
		this.tamanhoP = tamanhoP;
	}
	public void setPrecoP(float precoP) {
		this.precoP = precoP;
	}
	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", referenciaP=" + referenciaP + ", tamanhoP=" + tamanhoP + ", precoP=" + precoP
				+ ", metodoPagamento=" + metodoPagamento + "]";
	}
		
}
