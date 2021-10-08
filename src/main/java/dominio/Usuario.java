package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javassist.SerialVersionUID;

@Entity
public class Usuario {	
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	private String curso;
	private String periodo;	
	
	
	public Usuario(String nome, Date dtNascimento, String curso, String periodo) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.curso = curso;
		this.periodo = periodo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDtNascimento() {
		return dtNascimento;
	}


	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public Usuario() {
		
	}

	
	
	
	
	

}
