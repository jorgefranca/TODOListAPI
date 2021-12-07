package teste.estagio.ToDoListAPI.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import teste.estagio.ToDoListAPI.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	//List<Users> findAll();
	
	
}
