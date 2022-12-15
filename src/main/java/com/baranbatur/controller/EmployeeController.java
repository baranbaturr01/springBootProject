package com.baranbatur.controller;

import com.baranbatur.business.dto.EmployeeDto;
import com.baranbatur.business.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;


    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees() {
        List<EmployeeDto> employeeDtoList = employeeServices.getAllEmployees();
        return employeeDtoList;
    }


    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> findEmployeeById(@PathVariable Long id) {
        return employeeServices.getEmployeeById(id);
    }

    //SAVE
    @PostMapping("/employees")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto) {
        System.out.println("saveEmployee Contorller " + employeeDto);
        return employeeServices.saveEmployee(employeeDto);
    }

    @PostMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
        return employeeServices.updateEmployee(id, employeeDto);
    }
}
