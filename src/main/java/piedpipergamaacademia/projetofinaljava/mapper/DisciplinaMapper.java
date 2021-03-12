package piedpipergamaacademia.projetofinaljava.mapper;

import java.util.List;
import java.util.stream.Collectors;

import piedpipergamaacademia.projetofinaljava.dto.DisciplinaDto;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;
import piedpipergamaacademia.projetofinaljava.response.DisciplinaResponse;

public class DisciplinaMapper {

    //TODO criar métodos static para as transformações entre as representacoes de Disciplina

    public static DisciplinaResponse modelToResponse(Disciplina disciplina) {
    	DisciplinaResponse response = new DisciplinaResponse();
    	response.setId(disciplina.getId());
    	response.setNome(disciplina.getNome());
    	response.setConceito(disciplina.getConceito());
    	response.setNotaFinal(disciplina.getMedia());
    	response.setStatus(disciplina.getStatus());
    	
        return response;
    }

    public static Disciplina dtoToModel(DisciplinaDto dto){
    	Disciplina model = new Disciplina();
    	model.setNome(dto.getNome());
    	model.setNota1(dto.getNota1());
    	model.setNota2(dto.getNota2());
    	model.setNotaApresentacao(dto.getNotaApresentacao());
    	model.setNotaTrabalho(dto.getNotaApresentacao());
        return model;
    }
    
    public static List<DisciplinaResponse> getDisciplinaResponse(List<Disciplina> disciplinas) {
        return disciplinas
                .stream()
                .map(DisciplinaMapper::modelToResponse)
                .collect(Collectors.toList());
    }
    
    public static List<Disciplina> getDisciplinas(List<DisciplinaDto> disciplinas) {
    	return disciplinas
    			.stream()
    			.map(DisciplinaMapper::dtoToModel)
    			.collect(Collectors.toList());
    }
    
    
}
