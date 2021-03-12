package piedpipergamaacademia.projetofinaljava.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import piedpipergamaacademia.projetofinaljava.dto.AlunoDto;
import piedpipergamaacademia.projetofinaljava.dto.DisciplinaDto;
import piedpipergamaacademia.projetofinaljava.dto.EnderecoDto;
import piedpipergamaacademia.projetofinaljava.mapper.AlunoMapper;
import piedpipergamaacademia.projetofinaljava.mapper.DisciplinaMapper;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;
import piedpipergamaacademia.projetofinaljava.response.AlunoResponse;
import piedpipergamaacademia.projetofinaljava.response.DisciplinaResponse;
import piedpipergamaacademia.projetofinaljava.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	


	private final AlunoService service;

	@Autowired
	public AlunoController(AlunoService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<AlunoResponse>> getAlunos(@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "conceito", required = false) String conceito,
			@RequestParam(value = "disciplina", required = false) String disciplinaNome,
			@RequestParam(value = "curso", required = false) String curso) {
		List<Aluno> alunos = service.getAlunos(nome, conceito, disciplinaNome, curso);
		List<AlunoResponse> alunosResponse = alunos.stream().map(AlunoMapper::modelToResponse)
				.collect(Collectors.toList());
		return ResponseEntity.ok(alunosResponse);
	}
	
	@GetMapping("/conceito/{conceito}")
	public ResponseEntity<List<AlunoResponse>> getAlunoPorDisciplina1(@PathVariable("conceito") String conceito) {
		List<Aluno> alunos = service.findAlunoPorConceito(conceito);

		if (alunos.isEmpty()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		List<AlunoResponse> alunosResponse = alunos.stream().map(AlunoMapper::modelToResponse)
				.collect(Collectors.toList());
		return ResponseEntity.ok(alunosResponse);
	}
	
	@GetMapping("/curso/{curso}")
	public ResponseEntity<List<AlunoResponse>> getAlunoPorCurso(@PathVariable("curso") String curso) {
		List<Aluno> alunos = service.findAlunoPorCurso(curso);

		if (alunos.isEmpty()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		List<AlunoResponse> alunosResponse = alunos.stream().map(AlunoMapper::modelToResponse)
				.collect(Collectors.toList());
		return ResponseEntity.ok(alunosResponse);
	}
	
	@GetMapping("/disciplina/{disciplina}")
	public ResponseEntity<List<AlunoResponse>>  getAlunoPorDisciplina(@PathVariable("disciplina") String disciplina) {
		List<Aluno> alunos  = service.findAlunoPorDisciplina(disciplina);

		if (alunos.isEmpty()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		List<AlunoResponse> alunosResponse = alunos.stream().map(AlunoMapper::modelToResponse)
				.collect(Collectors.toList());
		return ResponseEntity.ok(alunosResponse);
	}

	@GetMapping("/{id}")
	public ResponseEntity<AlunoResponse> getAlunoPorId(@PathVariable("id") Long id) {
		Optional<Aluno> alunoOptional = service.findAlunoPorId(id);

		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		Aluno aluno = alunoOptional.get();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<AlunoResponse> getAlunoPorNome(@PathVariable("nome") String nome) {
		Optional<Aluno> alunoOptional = service.findAlunoPorNome(nome);

		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		Aluno aluno = alunoOptional.get();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/{id}/disciplina/{disciplina}/status")
	public ResponseEntity<String> getAlunoDisciplinaAprovacao(@PathVariable("id") Long id,
			@PathVariable("disciplina") String disciplinaNome) {

		Optional<Disciplina> disciplinaOptional = service.findStatusDisciplinaDeAluno(id, disciplinaNome);

		if (!disciplinaOptional.isPresent()) {
			throw new ResourceNotFoundException("Disciplina não encontrada");
		}

		Disciplina disciplina = disciplinaOptional.get();
		String status = disciplina.getStatus();
		return ResponseEntity.ok(status);
	}

	@GetMapping("/{id}/disciplina/{disciplina}/conceito")
	public ResponseEntity<String> getAlunoDisciplinaConceito(@PathVariable("id") Long id,
			@PathVariable("disciplina") String disciplinaNome) {
		Optional<Disciplina> disciplinaOptional = service.findStatusDisciplinaDeAluno(id, disciplinaNome);

		if (!disciplinaOptional.isPresent()) {
			throw new ResourceNotFoundException("Disciplina não encontrada");
		}

		Disciplina disciplina = disciplinaOptional.get();
		return ResponseEntity.ok(disciplina.getConceito());
	}

	@GetMapping("/{id}/disciplina/{disciplina}/notas")
	public ResponseEntity<DisciplinaResponse> getAlunoDisciplinaNotas(@PathVariable("id") Long id,
			@PathVariable("disciplina") String disciplinaNome) {
		Optional<Disciplina> disciplinaOptional = service.findDisciplinadeAlunoPorNome(id, disciplinaNome);
		
		if (!disciplinaOptional.isPresent()) {
			throw new ResourceNotFoundException("Disciplina não encontrada");
		}

		Disciplina disciplina = disciplinaOptional.get();
		DisciplinaResponse response = DisciplinaMapper.modelToResponse(disciplina);
		return ResponseEntity.ok(response);
	}

	@PostMapping
	public ResponseEntity<AlunoResponse> postAluno(@RequestBody @Valid AlunoDto alunoDto) {
		Optional<Aluno> optionalAluno = service.saveAluno(alunoDto);

		if(!optionalAluno.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}
		
		Aluno aluno = optionalAluno.get();
		URI location = MvcUriComponentsBuilder.fromController(getClass())
	            .path("/{id}")
	            .buildAndExpand(aluno.getId())
	            .toUri();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.created(location).body(response);
	}

	@PutMapping("/{id}")
	public ResponseEntity<AlunoResponse> putAluno(@PathVariable("id") Long id, @RequestBody @Valid AlunoDto alunoDto) {
		Optional<Aluno> alunoOptional = service.updateAluno(id, alunoDto);
		
		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		Aluno aluno = alunoOptional.get();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/{id}/disciplina")
	public ResponseEntity<AlunoResponse> putAlunoDisciplinaNota(@PathVariable("id") Long id,
			 @RequestBody @Valid DisciplinaDto disciplina) {
		Optional<Aluno> alunoOptional = service.updateDisciplinaAluno(id, disciplina);
		
		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		Aluno aluno = alunoOptional.get();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.ok(response);
	}

	@PutMapping("/{id}/endereco/{idEndereco}")
	public ResponseEntity<AlunoResponse> putAlunoEndereco(@PathVariable("id") Long id,
			@PathVariable("idEndereco") Long idEndereco, @RequestBody @Valid EnderecoDto endereco) {
		Optional<Aluno> alunoOptional = service.updateEnderecoAluno(id, idEndereco, endereco);
		
		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}

		Aluno aluno = alunoOptional.get();
		AlunoResponse response = AlunoMapper.modelToResponse(aluno);
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping("/id/{id}")
	public Map<String, Boolean> deleteAlunoPorId(@PathVariable(value = "id") Long id){
		
		Optional<Aluno> alunoOptional = service.findAlunoPorId(id);
		
		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}
		service.deletePorId(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	@DeleteMapping("/nome/{nome}")
	public Map<String, Boolean> deleteAlunoPorNome(@PathVariable("nome") String nome){
		Optional<Aluno> alunoOptional = service.findAlunoPorNome(nome);
		
		if (!alunoOptional.isPresent()) {
			throw new ResourceNotFoundException("Aluno não encontrado");
		}
		
		Aluno aluno = alunoOptional.get();
		service.deletePorNome(aluno);
		
		Map<String, Boolean> response = new HashMap<> ();
		response.put("deleted", Boolean.TRUE);
		
		return response;
		
	}
	
	
}
