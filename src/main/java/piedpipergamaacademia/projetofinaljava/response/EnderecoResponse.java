package piedpipergamaacademia.projetofinaljava.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="EnderecoResponse")
public class EnderecoResponse {

    //TODO definir quais dados vão ser retornado na resposta
	private Long id;
    private String rua;
    private String cidade;
    private String uf;
    private String cep;
    private String numero;
    private String complemento;
    
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
