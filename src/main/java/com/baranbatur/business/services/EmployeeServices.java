package com.baranbatur.business.services;

import com.baranbatur.business.dto.EmployeeDto;
import com.baranbatur.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {

    public List<EmployeeDto> getAllEmployees();

    public EmployeeDto saveEmployee(EmployeeDto employeeDto);

    public ResponseEntity<EmployeeDto> getEmployeeById(Long id);

    public ResponseEntity<EmployeeDto> updateEmployee(Long id, EmployeeDto employeeDto);

    public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);

    //Model Mapper
    public EmployeeDto entityToDto(EmployeeEntity employeeEntity);

    public EmployeeEntity dtoToEntity(EmployeeDto employeeDto);
}
