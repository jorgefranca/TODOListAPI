/*
* cadastro de usuários
* implementar: senhas
*/

package teste.estagio.ToDoListAPI;

import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
    
    //parametros

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String email;
    @ManyToMany(mappedBy = "users")
    private List<Issues> issues; //lista de tarefas para esse usuário;


    //construtores
    public Users(){
        //default
    }
    public Users(Integer id, String nome, String email){

        this.id   = id;
        this.nome  = nome;
        this.email = email; 
    }

    //getter and setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    
    /*public List<Issues> getIssues() {
        return issues;
    }
    public void setIssues(List<Issues> issues) {
        this.issues = issues;
    }*/





}
