package com.baranbatur.business.services.impl;

import com.baranbatur.business.dto.EmployeeDto;
import com.baranbatur.business.services.EmployeeServices;
import com.baranbatur.data.entity.EmployeeEntity;
import com.baranbatur.data.repository.EmployeeRepository;
import com.baranbatur.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    //    List
//    http://localhost:8081/api/v1/employees
    @Override
    @GetMapping("/employees")
    public List<EmployeeDto> getAllEmployees() {

        List<EmployeeDto> employeeDtoList = new ArrayList<>();
        Iterable<EmployeeEntity> employeeEntityList = employeeRepository.findAll();

        for (EmployeeEntity employeeEntity : employeeEntityList) {
            EmployeeDto employeeDto = entityToDto(employeeEntity);
            employeeDtoList.add(employeeDto);
        }
        return employeeDtoList;
    }

    //    Save
//    http://localhost:8081/api/v1/employees
    @Override
    @PostMapping("/employees")
    public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = dtoToEntity(employeeDto);
        employeeRepository.save(employeeEntity);
        return employeeDto;
    }

    //    Find by id
//    http://localhost:8081/api/v1/employees/1
    @Override
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id : " + id));
        EmployeeDto employeeDto = entityToDto(employeeEntity);
        return ResponseEntity.ok(employeeDto);
    }

    //    Update
//    http://localhost:8081/api/v1/employees/1
    @PutMapping("/employees/{id}")
    @Override
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {

        EmployeeEntity employeeEntity = dtoToEntity(employeeDto);//ModelMapper
        EmployeeEntity employee = employeeRepository.findById(id).get();
        employee.setName(employeeEntity.getName());
        employee.setSurname(employeeEntity.getSurname());
        employee.setEmailId(employeeEntity.getEmailId());
        employeeRepository.save(employee);
        return ResponseEntity.ok(employeeDto);

    }

    //    Delete by id
//    http://localhost:8081/api/v1/employees/1
    @Override
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        employeeRepository.delete(employeeEntity);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


    //    //Model Mapper
    @Override
//    Entity to DTO
    public EmployeeDto entityToDto(EmployeeEntity employeeEntity) {

        return modelMapper.map(employeeEntity, EmployeeDto.class);
    }

    @Override
//    DTO to Entity
    public EmployeeEntity dtoToEntity(EmployeeDto employeeDto) {
        return modelMapper.map(employeeDto, EmployeeEntity.class);
    }
}
