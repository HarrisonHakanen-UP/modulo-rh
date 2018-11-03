# modulo-rh

### Rotas

1. Servico departamento:
  - POST Salva um Departamento: http://localhost:8080/departamento/post
  - GET  Retorna uma lista de Departamentos: http://localhost:8080/departamento/json
  - DELETE Deleta um Departamento: http://localhost:8080/departamento/delete

2. Serviço empregado:
  - POST Salva um Empregado: http://localhost:8080/empregado/post
  - GET  Retorna uma lista de Empregados: http://localhost:8080/empregado/json
  - GET  Retorna uma lista de Empregados por Departamento: http://localhost:8080/empregado/departamentos/json
  - GET Retorna uma lista de Pagamentos dos Empregados: http://localhost:8080/empregado/pagamentos/json
  - GET Retorna uma lista de Candidatos ao Emprego: http://localhost:8080/empregado/candidatos/json
  - DELETE  Deleta um Empregado: http://localhost:8080/empregado/delete
