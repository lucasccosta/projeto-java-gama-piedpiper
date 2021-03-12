package piedpipergamaacademia.projetofinaljava.mapper;

import java.util.ArrayList;
import java.util.List;

import piedpipergamaacademia.projetofinaljava.dto.AlunoDto;
import piedpipergamaacademia.projetofinaljava.model.Aluno;
import piedpipergamaacademia.projetofinaljava.model.Disciplina;
import piedpipergamaacademia.projetofinaljava.model.Endereco;
import piedpipergamaacademia.projetofinaljava.response.AlunoResponse;
import piedpipergamaacademia.projetofinaljava.response.DisciplinaResponse;
import piedpipergamaacademia.projetofinaljava.response.EnderecoResponse;

public class AlunoMapper {

	public static AlunoResponse modelToResponse(Aluno aluno) {
		AlunoResponse response = new AlunoResponse();
		response.setId(aluno.getId());
		response.setNome(aluno.getNome());
		response.setTelefone(aluno.getTelefone());
		response.setCurso(aluno.getCurso());

		List<DisciplinaResponse> disciplinas = DisciplinaMapper.getDisciplinaResponse(aluno.getDisciplinas());
		response.setDisciplinas(disciplinas.size() > 0 ? disciplinas : new ArrayList<DisciplinaResponse>());
		List<EnderecoResponse> enderecos = EnderecoMapper.getEnderecoResponse(aluno.getEnderecos());
		response.setEndereco(enderecos.size() > 0 ? enderecos : new ArrayList<EnderecoResponse>());


		return response;
	}

	public static Aluno dtoToModel(AlunoDto dto) {
		Aluno model = new Aluno();
		model.setNome(dto.getNome());
		model.setTelefone(dto.getTelefone());
		model.setCurso(dto.getCurso());

		List<Disciplina> disciplinas = DisciplinaMapper.getDisciplinas(dto.getDisciplinas());
		model.setDisciplinas(disciplinas);

		List<Endereco> enderecos = EnderecoMapper.getEnderecos(dto.getEndereco());
		model.setEnderecos(enderecos);

		return model;
	}

}
