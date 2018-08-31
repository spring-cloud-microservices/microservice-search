package com.quadbaze.microservice.search.controllers;

import com.quadbaze.microservice.common.core.Route;
import com.quadbaze.microservice.domain.entities.Employee;
import com.quadbaze.microservice.domain.repositories.EmployeeRepository;
import com.quadbaze.microservice.domain.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Olatunji O. Longe: Created on (29/05/2018)
 */

@RestController
@RequestMapping(Route.Search.ENTRY_PATH)
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    private RoleRepository roleRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository, RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        return optional.isPresent() ? optional.get() : optional.orElse(null);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
