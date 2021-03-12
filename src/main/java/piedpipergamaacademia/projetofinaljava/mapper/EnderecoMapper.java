package piedpipergamaacademia.projetofinaljava.mapper;

import java.util.List;
import java.util.stream.Collectors;

import piedpipergamaacademia.projetofinaljava.dto.EnderecoDto;
import piedpipergamaacademia.projetofinaljava.model.Endereco;
import piedpipergamaacademia.projetofinaljava.model.UF;
import piedpipergamaacademia.projetofinaljava.response.EnderecoResponse;

public class EnderecoMapper {

    //TODO criar métodos static para as transformações entre as representacoes de Endereco

    public static EnderecoResponse modelToResponse(Endereco endereco) {
        EnderecoResponse response = new EnderecoResponse();
        response.setId(endereco.getId());
        response.setCep(endereco.getCep());
        response.setCidade(endereco.getCidade());
        response.setRua(endereco.getRua());
        response.setNumero(endereco.getNumero());
        response.setComplemento(endereco.getComplemento());
        response.setUf(endereco.getUf().toString());
    	
    	return response;
    }

    public static Endereco dtoToModel(EnderecoDto dto) {
    	Endereco model = new Endereco();
    	model.setNumero(dto.getNumero());
    	model.setRua(dto.getRua());
    	model.setComplemento(dto.getComplemento());
    	model.setCidade(dto.getCidade());
    	model.setUf(UF.valueOf(dto.getUf()));
    	model.setCep(dto.getCep());
        
    	return model;
    }
    
    public static List<Endereco> getEnderecos(List<EnderecoDto> enderecos) {
    	return enderecos
    			.stream()
    			.map(EnderecoMapper::dtoToModel)
    			.collect(Collectors.toList());
    }

    public static List<EnderecoResponse> getEnderecoResponse(List<Endereco> enderecos) {
        return enderecos
                .stream()
                .map(EnderecoMapper::modelToResponse)
                .collect(Collectors.toList());
    }
    
}
