package piedpipergamaacademia.projetofinaljava.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema(name="AlunoDto")
public class AlunoDto {

	@NotEmpty
	@Length(min=5, message = "Deve ser colocado o nome completo")
    private String nome;
    
	@Pattern(regexp="\\([1-9]{2}\\) {0,1}{2}[1-9][0-9]{3,4}-{0,1}[0-9]{4}", message = "O Telefone deve seguir o padrão (99) 99999-9999")
    private String telefone;
    
	@NotEmpty(message = "O nome do curso é obrigatório e não pode ser deixado em branco")
    private String curso;
    
	@Valid
    private List<EnderecoDto> endereco;
    
	@Valid
    private List<DisciplinaDto> disciplinas;

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

	public List<EnderecoDto> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoDto> endereco) {
		this.endereco = endereco;
	}

	public List<DisciplinaDto> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinaDto> disciplinas) {
		this.disciplinas = disciplinas;
	}


    
}
