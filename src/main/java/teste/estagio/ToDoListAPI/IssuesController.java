/*
 * Classe responsável pela comunicação http
 * */
package teste.estagio.ToDoListAPI;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import teste.estagio.ToDoListAPI.repository.IssuesRepository;
import teste.estagio.ToDoListAPI.repository.UsersRepository;
//import teste.estagio.ToDoListAPI.repository.issues_usersRepository;

@RestController //identifica que estamos trabalhando com rest API
@RequestMapping("/issues")
public class IssuesController {
	
	@Autowired
	private IssuesRepository issuesRepository;

	@Autowired
	private UsersRepository usersRepository;
	
	@GetMapping
	public List<Issues> listarIssues(){
		List<Issues> issues = issuesRepository.findAll();
		return issues;
	}
	
	@GetMapping("/{id}")
	public Issues listIssueById(@PathVariable Integer id){
		
		Issues issues = issuesRepository.findById(id).get();
		return issues;
	}

	@GetMapping("/users/{usId}")
	public List<Issues> listIssueByUser(@PathVariable Integer usId){
		
		List<Issues> issuesUser = issuesRepository.findIssuesUsers(usId);
		return issuesUser;
	}

	@PostMapping
	public ResponseEntity<Issues> registerIssues(@Valid @RequestBody FormIssues formIssues, UriComponentsBuilder uriBuilder) {
		
		Issues issues = formIssues.converterFormParaIssues(usersRepository);
		
		issuesRepository.save(issues);
		//responder no corpo da resposta o item gravado
		URI uri = uriBuilder.path("/issues/{id}").buildAndExpand(issues.getId()).toUri();
		return ResponseEntity.created(uri).body(issues);
			
	}
	/*
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<Issues> updateIssues(@PathVariable Integer id, @RequestBody FormIssuesUpdate formUpdate) {
		
		Issues issueUpdate = formUpdate.updateConvertFormIssues(id, issuesRepository);
		return ResponseEntity.ok(issueUpdate);
		
	}
	*/
	@DeleteMapping("/{id}")
	public ResponseEntity<?> removeIssues(@PathVariable Integer id){
		issuesRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
