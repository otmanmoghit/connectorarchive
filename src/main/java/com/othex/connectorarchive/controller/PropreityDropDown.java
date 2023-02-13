package com.othex.connectorarchive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.othex.connectorarchive.model.User;
import com.othex.connectorarchive.repository.UserRepository;
 
import jakarta.validation.Valid;


@RestController
@GetMapping("/api/PropreityDropDopwns")

public class PropreityDropDopwnController {

    @Autowired
    private PropreityDropDopwnRepository repository;
    public List<PropreityDropDopwn> getAll() {
        return repository.findAll();
    }

    @PostMapping("/{id}")
    public PropreityDropDopwn create(@RequestBody PropreityDropDopwn PropreityDropDopwn) {
        return repository.save(PropreityDropDopwn);
    }

    @GetMapping("/{id}")
    public PropreityDropDopwn getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public PropreityDropDopwn update(@RequestBody PropreityDropDopwn PropreityDropDopwn, @PathVariable Long id) {
        PropreityDropDopwn.setId(id);
        return repository.save(PropreityDropDopwn);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}