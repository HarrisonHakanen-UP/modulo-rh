package br.edu.up.jpa.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.jpa.dominio.Employee;
import br.edu.up.jpa.dominio.EmployeeDepartmentHistory;
import br.edu.up.jpa.dominio.EmployeePayHistory;
import br.edu.up.jpa.dominio.JobCandidate;
import br.edu.up.jpa.repository.EmployeeDepartmentHistoryRepository;
import br.edu.up.jpa.repository.EmployeePayHistoryRepository;
import br.edu.up.jpa.repository.EmployeeRepository;
import br.edu.up.jpa.repository.JobCandidateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="")
@RestController
@RequestMapping("/empregado")
public class EmployeeResource {
	
	@Autowired
	private EmployeeRepository empregadoRepository;/*
	private EmployeeDepartmentHistoryRepository empregadoDepartamentoRepository;
	private EmployeePayHistoryRepository empregadoPagamentoRepository;
	private JobCandidateRepository candidatoEmprego;*/
	
	@ApiOperation(value="Salva um Empregado")
	@PostMapping("/empregado/post")
	public Employee postEmpregado(@RequestBody @Valid Employee empregado) {
		return empregadoRepository.save(empregado);
	}
	
	@ApiOperation(value="Retorna uma lista de Empregados")
	@GetMapping(produces="empregado/json")
	public @ResponseBody Iterable<Employee> listaEmpregados(){
		Iterable<Employee> listaEmpregados = empregadoRepository.findAll();
		return listaEmpregados;
	}
	/*
	@ApiOperation(value="Retorna uma lista de Empregados por Departamento")
	@GetMapping(produces="empregado/departamentos/json")
	public @ResponseBody Iterable<EmployeeDepartmentHistory> listaEmpregadosDepartamentos(){
		Iterable<EmployeeDepartmentHistory> listaEmpregadosDepartamentos = empregadoDepartamentoRepository.findAll();
		return listaEmpregadosDepartamentos;
	}
	
	@ApiOperation(value="Retorna uma lista de Pagamentos dos Empregados")
	@GetMapping(produces="empregado/pagamentos/json")
	public @ResponseBody Iterable<EmployeePayHistory> listaPagamentosEmpregados(){
		Iterable<EmployeePayHistory> listaPagamentosEmpregados = empregadoPagamentoRepository.findAll();
		return listaPagamentosEmpregados;
	}
	
	@ApiOperation(value="Retorna uma lista de Candidatos ao Emprego")
	@GetMapping(produces="empregado/candidatos/json")
	public @ResponseBody Iterable<JobCandidate> listaCandidatosEmprego(){
		Iterable<JobCandidate> listaCandidatosEmprego = candidatoEmprego.findAll();
		return listaCandidatosEmprego;
	}*/
	
	@ApiOperation(value="Deleta um Empregado")
	@DeleteMapping("/empregado/delete")
	public Employee deletaEmpregado(@RequestBody Employee empregado) {
		empregadoRepository.delete(empregado);
		return empregado;
	}

}
