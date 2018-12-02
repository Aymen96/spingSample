package com.example.demo.infrastructure.repositories;

import com.example.demo.application.dtos.service.TestDto;
import com.example.demo.domain.modal.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Integer> {

    List<TestDto> findAllDtoBy();

    TestDto findAllDtoById(int id);
}
