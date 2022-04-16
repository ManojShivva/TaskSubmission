package com.kaiburr.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaiburr.entities.Framework;
import com.kaiburr.repositories.FrameworkRepo;

@RestController
public class FrameworkController {
@Autowired
private FrameworkRepo repository;

@PostMapping("/addFramework")
public String saveBook(@RequestBody Framework framework) {
	repository.save(framework);
	return "Framework added";
}

@GetMapping("/findAllFrameworks")
public List<Framework> getAllFrameworks(){
	return repository.findAll();
}

@GetMapping("/findById/{id}")
public Optional<Framework> getFramework(@PathVariable int id) {
	return repository.findById(id);
}

@DeleteMapping("/deleteById/{id}")
public String deleteFramework(@PathVariable int id) {
	repository.deleteById(id);
	return "Framework deleted";
}

}

