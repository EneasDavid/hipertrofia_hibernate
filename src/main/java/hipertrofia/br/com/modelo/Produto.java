package hipertrofia.br.com.modelo;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name="id",columnNames = {"id"}))
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Basic(optional=false)
	private String referencia;
	@Basic(optional=false)
	private String tamanho;
	@Basic(optional=false)
	private float preco;
	//Cadastro
	public Produto(String referencia, String tamanho, float preco) {
		this.referencia = referencia;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	//Atualização
	public Produto(int id, String referencia, String tamanho, float preco) {
		this.id = id;
		this.referencia = referencia;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	public Produto() {
	}
	
	public int getId() {
		return id;
	}
	public String getReferencia() {
		return referencia;
	}
	public String getTamanho() {
		return tamanho;
	}
	public float getPreco() {
		return preco;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setReferencia(String referencia) {
		this.referencia=referencia;
	}
	public void setTamanho(String tamanho) {
		this.tamanho=tamanho;
	}
	public void setPreco(float preco) {
		this.preco=preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", referencia=" + referencia + ", tamanho=" + tamanho + ", preco=" + preco + "]";
	}
	
}
