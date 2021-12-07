/*
* Gerenciar cadastro de usuários
*/
package teste.estagio.ToDoListAPI;

import java.net.URI;
//import java.net.URI;
import java.util.List;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import teste.estagio.ToDoListAPI.repository.UsersRepository;

@RestController //identifica que estamos trabalhando com rest API
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;

	
	@GetMapping
	public List<Users> listarUsers(){
		List <Users> users = usersRepository.findAll();
        return users;
	}
	
	@GetMapping("/{id}")
	public Users listUsersById(@PathVariable Integer id){
		
	 Users users = usersRepository.findById(id).get();
		return users;
	}
    
	@PostMapping
	@Transactional
	public ResponseEntity<Users> registerUsers(@Valid @RequestBody FormUsers formUsers, UriComponentsBuilder uriBuilder) {
	

		Users users = formUsers.converterFormParaUsers();
		usersRepository.save(users);
		//responder no corpo da resposta o item gravado
		URI uri = uriBuilder.path("/users/{id}").buildAndExpand(users.getId()).toUri();
		return ResponseEntity.created(uri).body(users);
	}
	/*
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity Users> updateIssues(@PathVariable Integer id, @RequestBody FormIssuesUpdate formUpdate) {
		
	 Users issueUpdate = formUpdate.updateConvertFormIssues(id, usersRepository);
		return ResponseEntity.ok(issueUpdate);
		
	}
	*/
	@DeleteMapping("/{id}")
	public ResponseEntity<?> removeUsers(@PathVariable Integer id){
		usersRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
