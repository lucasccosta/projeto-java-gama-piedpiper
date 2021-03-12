package piedpipergamaacademia.projetofinaljava.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="DisciplinaResponse")
public class DisciplinaResponse {

    //TODO definir quais dados vão ser retornado na resposta

    private Long id;
    private String nome;
    private String conceito;
    private String notaFinal;
    private String status;

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

    public String getConceito() {
        return conceito;
    }

    public void setConceito(String conceito) {
        this.conceito = conceito;
    }



	public String getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
	
    
}
