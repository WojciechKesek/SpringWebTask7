package com.example.springtask7b.controller;

import com.example.springtask7b.modelDto.NamedPairs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Slf4j
@RestController
public class NameRestController {

    @GetMapping("/api/pairs/{name}")
    public NamedPairs getName(@PathVariable(value = "name") String name){
        return NamedPairs.builder()
                .pairName(name)
                .pairs(new HashMap<>())
                .build();
    }

}
