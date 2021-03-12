package piedpipergamaacademia.projetofinaljava.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import io.swagger.v3.oas.annotations.media.Schema;
@Schema(name="EnderecoDto")
public class EnderecoDto {
	

	@NotBlank(message = "O nome da rua é obrigatório")
    private String rua;
	
	@NotBlank(message ="O número do endereço é obrigatório")
    private String numero;
	
    private String complemento;

    @NotBlank(message ="O nome da Cidade é obrigatório")
    private String cidade;

    @Pattern(regexp = "(AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|RO|RR|SC|SP|SE|TO)", message = "Coloque uma sigla de estado válida")
    private String uf;

    @Pattern(regexp = "[0-9]{5}-[0-9]{3}", message = "Coloque um cep válido no formato 99999-999")
    private String cep;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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
