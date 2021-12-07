package teste.estagio.ToDoListAPI;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class FormUsers {
    @Positive
	private Integer id;
	@NotNull @NotEmpty 
	private String nome;
	@NotNull @NotEmpty 
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users converterFormParaUsers() {
		/*
		 * if usado para verificar se dois status recebem valor 'true'
		 * se houver dois valores 'true', o if é executado. Caso contrário, o else é executado.
		 * o 'new Issue()' foi feito apenas para gerar um erro e impedir a gravação dos dados.
		 * É preciso retornar uma mensagem de erro adequada.
		 * */
		//if ((this.todo && this.doing) || (this.todo && this.done) || (this.done && this.doing)) { 
			
			//return new Issues();
			
		//}else {
			System.out.println("Funcionando até aqui");
			return new Users(id, nome, email);
		//}
	}
}
