package com.example.demo.application.controllers;

import com.example.demo.application.controllers.Api.TestApi;
import com.example.demo.application.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.TabExpander;
import java.util.List;

@RestController
public class TestController implements TestApi {
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    public Object[] getTests() {
        return this.testService.findAll();
    }

}
