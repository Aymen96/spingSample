package com.example.demo.application.services;

import com.example.demo.application.dtos.service.TestDto;
import com.example.demo.infrastructure.repositories.TestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    private TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public List<TestDto> findAll() {
        return this.testRepository.findAllDtoBy();
    }

    public TestDto findTestById(int id) {
       return this.testRepository.findAllDtoById(id);
    }
}
