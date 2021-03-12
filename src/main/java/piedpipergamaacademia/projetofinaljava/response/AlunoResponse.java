package piedpipergamaacademia.projetofinaljava.response;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema(name="AlunoResponse")
public class AlunoResponse {

    //TODO definir quais dados vão ser retornado na resposta
	private Long id;
    private String nome;
    private String telefone;
    private String curso;
    private List<EnderecoResponse> endereco;
    private List<DisciplinaResponse> disciplinas;
    
    
  

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<EnderecoResponse> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<EnderecoResponse> endereco) {
        this.endereco = endereco;
    }

 

    public List<DisciplinaResponse> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinaResponse> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

	
}
