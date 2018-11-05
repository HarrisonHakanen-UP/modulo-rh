# modulo-rh

### Rotas

1. Serviço departamento:
  - POST Salva um Departamento: http://localhost:8096/departamento/post
  - GET  Retorna uma lista de Departamentos: http://localhost:8096/departamento/json
  - DELETE Deleta um Departamento: http://localhost:8096/departamento/delete

2. Serviço empregado:
  - POST Salva um Empregado: http://localhost:8096/empregado/post
  - GET  Retorna uma lista de Empregados: http://localhost:8096/empregado/json
  - GET  Retorna uma lista de Empregados por Departamento: http://localhost:8096/empregado/departamentos/json
  - GET Retorna uma lista de Pagamentos dos Empregados: http://localhost:8096/empregado/pagamentos/json
  - GET Retorna uma lista de Candidatos ao Emprego: http://localhost:8096/empregado/candidatos/json
  - DELETE  Deleta um Empregado: http://localhost:8096/empregado/delete
