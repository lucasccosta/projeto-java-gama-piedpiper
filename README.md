# Turma 1 da Gama Academia - Accademia Accenture 2.0
Projeto de Java - Grupo Pied Piper

[Swagger com documentação API REST do projeto](https://piedpiper-gama-java.herokuapp.com/index.html)

### Integrantes
- [Felipe Mandu](https://github.com/felipemandu)
- [Laís Marques](https://github.com/laismarques)
- [Lucas Costa](https://github.com/lucasccosta)

### Requisitos do projeto
O Projeto trata do desenvolvimento de uma API REST utilizando o conhecimento nas API Java, Banco de dados relacionais SQL e [Framework Spring]( https://spring.io/projects/spring-boot).
A aplicação deve ser capaz de realizar as operações de CRUD e possuir regras de negócios a serem definidas pelos integrantes do grupo.
Faz parte dos requisitos uma classe que representaria um Aluno de alguma instituição e possuiria dados comuns a este modelo. O Aluno também deveria ser uma entidade a ser persistida em um banco de dados.

### Etapas do desenvolvimento
Utilizando o [Spring Boot initializr](https://start.spring.io/) foi gerado um projeto em Maven em Java 8 e com as dependências comuns necessárias a criação de uma API REST. Com o projeto estruturado em Maven, foi iniciado o desenvolvimento usando a IDE [Eclipse](https://www.eclipse.org/).

Utilizamos na etapa de desenvolvimento o banco de dados relacionais [H2]( http://www.h2database.com/html/main.html) com a base de dados em memória. No deploy da aplicação o banco [Postgresql]( https://www.postgresql.org/) foi escolhido por ser um serviço com uma faixa gratuita na plataforma [Heroku](https://www.heroku.com/).

A partir daí foram desenvolvidas as classes controllers, repositories e services do projeto, para tal foi utilizado o framework Spring em seu módulo Spring Web. Tais classes são responsáveis respectivamente por criar e servir endpoints para usuários da API, gerenciar o acesso as entidades no banco de dados e a coordenação do fluxo da aplicação entre a comunicação externa pela API e core business da aplicação.

A fim de isolar as classes do modelo da comunicação externa foram criadas classes DTO de entrada e saída da aplicação. Devido as DTOs foram desenvolvidos mappers, assim garantindo a capacidade de esconder possíveis aspectos sensíveis do modelo e ter uma ferramenta de transformação entre os dados que representam o modelo.

Já nesse momento do projeto nos focamos na validação de entrada de dados usando a biblioteca Bean Validation do Spring. Também foi adicionado a biblioteca [SpringDoc]( https://springdoc.org/) para documentação Swagger do projeto.

Com a aplicação pronta foram realizadas as configurações necessárias para o ambiente de produção e foi realizado o deploy da aplicação para a plataforma Heroku onde a aplicação está hospedada.
A documentação do projeto está na URL [https://piedpiper-gama-java.herokuapp.com/index.html](https://piedpiper-gama-java.herokuapp.com/index.html])

### Tecnologias utilizadas

- Spring Framework
- Java 8
- Postgresql
- H2
- MongoDB (tentativa de utilização)
- Heroku
- Git
- Github
- Trello
- Maven
- Eclipse
- Springdoc
