package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
@AllArgsConstructor
public class NameService {

    private String name = "teste teste";

    private int contador = 0;
    public String getARandomName() {
        List<String> names = new ArrayList<>();
        names.add("primeiro");
        names.add("segundo");
        names.add("terceiro");
        if(contador >= names.size()) {
            contador = 0;
        }
        return names.get(contador++);
    }

}
