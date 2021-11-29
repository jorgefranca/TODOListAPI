/*
 * Classe responsavel pela modelagem das tarefas
 * Atualizar data para ser definida quando for criada uma tarefa
 * */
package teste.estagio.ToDoListAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //entidade do banco de dados
public class Issues {

	@Id //parâmetros do banco de dados
	private Integer id;
	private String descr;
	private String createAT;
	private boolean todo;
	private boolean doing;
	private boolean done;
	
	
	//constructores
	public Issues() {
		
	}
	
	public Issues(Integer id, String descr, String createAT, boolean todo, boolean doing, boolean done) {
		this.id = id;
		this.descr = descr;
		this.createAT = createAT;
		this.todo = todo;
		this.doing = doing;
		this.done = done;
	}
	
	//setters e getters
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
	public void setCreateAT(String createAT) {
		this.createAT = createAT;
	}
	public String getCreateAT() {
		return createAT;
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
}