package com.example.demo.api.controler;

import com.example.demo.service.NameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class NameController {

    private final NameService nameService;

    @GetMapping("/name")
    public String getName() {
        return nameService.getARandomName();
    }

    @PutMapping("/name")
    public void updateName(@RequestBody String name) {
        nameService.setName(name);
    }

}
