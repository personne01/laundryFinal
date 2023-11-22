package com.example.demo.controller;


import com.example.demo.dto.response.LaundryRequestDto;
import com.example.demo.dto.response.LaundryResponseDto;
import com.example.demo.model.Laundry;
import com.example.demo.service.LaundryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/v1/laundry")
@RequiredArgsConstructor
public class LaundryController {
    private final LaundryService service;
    @PostMapping
    public ResponseEntity create(@RequestBody LaundryRequestDto requestDto) {
        return ResponseEntity.ok(service.create(requestDto));
    }

    @GetMapping()
    public List<Laundry> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LaundryResponseDto get(@PathVariable("id") Long id) {
        return service.getById(id);
    }

}
