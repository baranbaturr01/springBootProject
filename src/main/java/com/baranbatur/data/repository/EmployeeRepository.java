package com.baranbatur.data.repository;

import com.baranbatur.data.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepo > CrudRepo > PagingAndSortingRepo > Repo

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
