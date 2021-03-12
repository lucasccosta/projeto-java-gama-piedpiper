package piedpipergamaacademia.projetofinaljava.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema(name="DisciplinaDto")
public class DisciplinaDto {

	@NotBlank(message = "O nome da disciplina é obrigatório")
    private String nome;
	
	@Range(min= 0, max=10, message= "Insira um valor entre 0 a 10")
    private Double nota1;
    
	@Range(min= 0, max=10, message= "Insira um valor entre 0 a 10")
    private Double nota2;

	@Range(min= 0, max=10, message= "Insira um valor entre 0 a 10")
    private Double notaTrabalho;

	@Range(min= 0, max=10, message= "Insira um valor entre 0 a 10")
    private Double notaApresentacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public Double getNotaApresentacao() {
        return notaApresentacao;
    }

    public void setNotaApresentacao(Double notaApresentacao) {
        this.notaApresentacao = notaApresentacao;
    }
}
