/*
 * Classe responsavel pela modelagem das tarefas
 * Atualizar data para ser definida quando for criada uma tarefa
 * */
package teste.estagio.ToDoListAPI;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity //entidade do banco de dados
@Table(name = "Issues")
public class Issues {

	@Id //parâmetros do banco de dados
	private Integer id;
	private String descr;
	private String createAT;
	private boolean todo;
	private boolean doing;
	private boolean done;
	private Integer userId;

	

	@ManyToMany
	@JoinTable(name="issues_users",
	joinColumns = @JoinColumn(name = "issues_Id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "users_Id", referencedColumnName = "id"))
	//Users users;
	private List<Users> users = new ArrayList<>(); //lista de usuários que podem ter aqui


	

	//constructores
	public Issues() {
		
	}
	
	public Issues(Integer id, String descr, String createAT, boolean todo, boolean doing, boolean done, Users user) {
		this.id = id;
		this.descr = descr;
		this.createAT = createAT;
		this.todo = todo;
		this.doing = doing;
		this.done = done;
		this.users.add(user);
		this.userId=user.getId();
		//this.users = users;//vai adicionar o usuário ao issues
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

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}