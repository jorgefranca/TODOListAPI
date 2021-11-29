/**
 * Classe para cadastrar dados.
 * Caso deseje alterar os critérios de cadastro, pode utilizar essa classe.
 * */
package teste.estagio.ToDoListAPI;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class FormIssues {
	@Positive
	private Integer id;
	@NotNull @NotEmpty 
	private String descr;
	@NotNull @NotEmpty 
	private String createAT;
	@NotNull
	private boolean todo;
	@NotNull
	private boolean doing;
	@NotNull
	private boolean done;
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescr() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public String getCreateAT() {
		return createAT;
	}


	public void setCreateAT(String createAT) {
		this.createAT = createAT;
	}


	public boolean isTodo() {
		return todo;
	}


	public void setTodo(boolean todo) {
		this.todo = todo;
	}


	public boolean isDoing() {
		return doing;
	}


	public void setDoing(boolean doing) {
		this.doing = doing;
	}


	public boolean isDone() {
		return done;
	}


	public void setDone(boolean done) {
		this.done = done;
	}


	public Issues converterFormParaIssues() {
		/*
		 * if usado para verificar se dois status recebem valor 'true'
		 * se houver dois valores 'true', o if é executado. Caso contrário, o else é executado.
		 * o 'new Issue()' foi feito apenas para gerar um erro e impedir a gravação dos dados.
		 * É preciso retornar uma mensagem de erro adequada.
		 * */
		if ((this.todo && this.doing) || (this.todo && this.done) || (this.done && this.doing)) { 
			
			return new Issues();
			
		}else {
			return new Issues(id, descr, createAT, todo, doing, done);
		}
	}
}