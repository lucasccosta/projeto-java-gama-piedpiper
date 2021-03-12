package piedpipergamaacademia.projetofinaljava.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno, Long> {

    /*TODO criar método necessarios utilizando spring DATA
    https://docs.spring.io/spring-data/jpa/docs/2.4.5/reference/html/#jpa.query-methods
    * */
	
	Optional<Aluno> findByNome(String nome);
	List<Aluno> findByCurso(String curso);
	void deleteById(Long id);
	
	void delete(Aluno aluno);
	
	void deleteByNome(String nome);
	
	@Query("SELECT d FROM Aluno a "
			+ "JOIN a.disciplinas d "
			+ "WHERE d.nome = :disciplinaNome "
			+ "AND a.id = :id")
	Optional<Disciplina> findByIdAndNome(@Param("id")Long id, @Param("disciplinaNome")String disciplinaNome);
	
	@Query("SELECT a FROM Aluno a "
			+ "JOIN a.disciplinas d "
			+ "WHERE d.nome = :disciplinaNome ")
	List<Aluno> findByDisciplina(@Param("disciplinaNome")String disciplinaNome);
	
	
	@Query("SELECT a FROM Aluno a "
			+ "JOIN a.disciplinas d "
			+ "WHERE d.conceito = :conceito ")
	List<Aluno> findAlunoPorConceito(@Param("conceito")String conceito);
	
}
