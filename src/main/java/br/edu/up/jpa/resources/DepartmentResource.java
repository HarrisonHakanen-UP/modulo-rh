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

import br.edu.up.jpa.dominio.Department;
import br.edu.up.jpa.repository.DepartmentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "")
@RestController
@RequestMapping("/departamento")
public class DepartmentResource {

	@Autowired
	private DepartmentRepository departamentoRepository;

	@ApiOperation(value = "Salva um Departamento")
	@PostMapping("/departamento/post")
	public Department postDepartment(@RequestBody @Valid Department departamento) {
		return departamentoRepository.save(departamento);
	}

	@ApiOperation(value = "Retorna uma lista de Departamentos")
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Department> listaDepartamentos() {
		Iterable<Department> listaDepartamentos = departamentoRepository.findAll();
		return listaDepartamentos;
	}

	@ApiOperation(value = "Deleta um Departamento")
	@DeleteMapping("/departamento/delete")
	public Department deletaDepartamento(@RequestBody Department departamento) {
		departamentoRepository.delete(departamento);
		return departamento;
	}

}
