package com.example.tourist.controller;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.tourist.model.Tourist;
import com.example.tourist.repository.TouristRepository;
@RestController
@RequestMapping("/tourists")
public class TouristController {
 private final TouristRepository repo;
 public TouristController(TouristRepository repo){this.repo=repo;}
 @PostMapping public Tourist add(@RequestBody Tourist t){return repo.save(t);}
 @GetMapping public List<Tourist> all(){return repo.findAll();}
 @GetMapping("/{id}") public Tourist one(@PathVariable Long id){return repo.findById(id).orElse(null);}
 @DeleteMapping("/{id}") public String delete(@PathVariable Long id){repo.deleteById(id);return "Deleted";}
 @GetMapping("/ping") public String ping(jakarta.servlet.http.HttpServletRequest r){return "Tourist Service running on port "+r.getLocalPort();}
}