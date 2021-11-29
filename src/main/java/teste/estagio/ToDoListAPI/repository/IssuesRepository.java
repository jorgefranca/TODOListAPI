package teste.estagio.ToDoListAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import teste.estagio.ToDoListAPI.Issues;

public interface IssuesRepository extends JpaRepository<Issues, Integer>{

	List<Issues> findAll();
	
	
}
