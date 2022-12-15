package com.baranbatur;

import com.baranbatur.data.entity.EmployeeEntity;
import com.baranbatur.data.repository.EmployeeRepository;
import com.baranbatur.test.TestCrud;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootKodluyoruzApplicationTests implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Override
    @Test
    public void testCreate() {

        // Employee entity i builder olarak tanımladıgımız için burada builder yapısı kullanmayı tercih ettik.
        EmployeeEntity employeeEntity = EmployeeEntity.builder().name("Baran").surname("Batur").emailId("barnabatu@gmaşl.com").build();

        employeeRepository.save(employeeEntity);

        assert employeeEntity.getId() != null;
    }

    @Override
    @Test

    public void testList() {

        List<EmployeeEntity> list = employeeRepository.findAll();
        assert list.size() > 0;
    }

    @Override
    @Test
    public void testFindById() {

        EmployeeEntity employeeEntity = employeeRepository.findById(8L).get();
        Assertions.assertEquals("Baran", employeeEntity.getName());
    }

    @Override
    @Test

    public void testUpdate() {

        EmployeeEntity employeeEntity = employeeRepository.findById(8L).get();
        employeeEntity.setName("Baran updated");
        employeeRepository.save(employeeEntity);

        Assertions.assertEquals("Baran updated", employeeEntity.getName());
    }


    @Override
    @Test
    public void testDelete() {

        employeeRepository.deleteById(8L);
        Assertions.assertFalse(employeeRepository.findById(8L).isPresent());
    }
}
