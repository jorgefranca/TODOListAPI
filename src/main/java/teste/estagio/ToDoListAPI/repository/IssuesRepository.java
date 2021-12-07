package teste.estagio.ToDoListAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import teste.estagio.ToDoListAPI.Issues;

public interface IssuesRepository extends JpaRepository<Issues, Integer> {

	List<Issues> findAll();
	
	@Query("SELECT A, B.nome FROM Issues A JOIN Users B ON(B.id=:id AND A.userId=:id)")
	//@Query("SELECT A FROM Issues A WHERE id = (SELECT B.issues_Id FROM issues_users B WHERE B.users_Id=:id)")
	List<Issues> findIssuesUsers(Integer id);
	//@Query("SELECT Issues, Users FROM Issues, Users INNER JOIN Users WHERE Users.id= :id")
	
}
