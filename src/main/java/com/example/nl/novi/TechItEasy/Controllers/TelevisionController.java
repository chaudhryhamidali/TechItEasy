package com.example.nl.novi.TechItEasy.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {
    @GetMapping("televisions")
    public ResponseEntity<String> getAllTelevisions(){
        return ResponseEntity.ok("television");
    }
    @GetMapping("televisions/{id}")
    public ResponseEntity<String> getTelevisionId(@PathVariable int id){
        return ResponseEntity.ok("television " + id);
    }
    @PutMapping("telvisions/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable int id, @RequestParam String name){
        return ResponseEntity.noContent().build();
    }
    @PostMapping("televisions")
    public ResponseEntity<String> addTvList(@RequestBody String television){
        return ResponseEntity.created(null).body("television");
    }
    @DeleteMapping("televisions")
    public ResponseEntity<String> deleteTelevision(@PathVariable int id){
        return ResponseEntity.noContent().build();
    }
}
