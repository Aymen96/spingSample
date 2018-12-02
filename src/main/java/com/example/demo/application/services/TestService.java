package com.example.demo.application.services;

import com.example.demo.application.dtos.service.TestDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    public List<TestDto> findAll() {
        List<TestDto> dtos = new ArrayList<TestDto>();
        dtos.add(new TestDto() {
            @Override
            public int getId() {
                return 1;
            }

            @Override
            public String getName() {
                return "test1";
            }

            @Override
            public String getDescription() {
                return "description1";
            }
        });
        dtos.add(new TestDto() {
            @Override
            public int getId() {
                return 2;
            }

            @Override
            public String getName() {
                return "test2";
            }

            @Override
            public String getDescription() {
                return "description2";
            }
        });
        return dtos;
    }
}
