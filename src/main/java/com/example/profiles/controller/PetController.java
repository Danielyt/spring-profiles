package com.example.profiles.controller;

import com.example.profiles.model.PetRepository;
import com.example.profiles.model.PetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("pet-types")
    public List<PetType> getPetTypes() {
        return petRepository.findPetTypes();
    }
}
