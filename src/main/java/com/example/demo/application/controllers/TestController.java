package com.example.demo.application.controllers;

import com.example.demo.application.controllers.Api.TestApi;
import com.example.demo.application.dtos.TestMapper;
import com.example.demo.application.dtos.response.TestResponse;
import com.example.demo.application.dtos.service.TestDto;
import com.example.demo.application.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.TabExpander;
import java.util.List;

@RestController
public class TestController implements TestApi {
    private TestService testService;
    private TestMapper testMapper;

    @Autowired
    public TestController(TestService testService, TestMapper testMapper) {
        this.testMapper = testMapper;
        this.testService = testService;
    }

    public List<TestResponse> getTests() {
        return testMapper.toResponseList(testService.findAll());
    }

    public TestResponse getTest(@PathVariable int id) {
        return testMapper.toResponse(testService.findTestById(id));
    }

}
