package com.example.ktp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin(origins = "*")

public class KtpController {

    @Autowired
    private KtpService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody KtpDto dto) {
        try {
            return ResponseEntity.ok(service.create(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public List<KtpEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public KtpEntity getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public KtpEntity update(@PathVariable Integer id, @RequestBody KtpDto dto) {
        return service.update(id, dto);
    }


}
