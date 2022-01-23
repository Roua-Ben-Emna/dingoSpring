package com.example.resto.dingo.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.resto.dingo.services.*;
import com.example.resto.dingo.models.Plat;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/plats") 
public class PlatController {
	
	@Autowired
	private PlatService PlatService;
	
	@GetMapping("")
	public List<Plat> getAllPlats(){
	return PlatService.getAllPlats();
	}
	@PutMapping("/{id}")
	public Plat update(@PathVariable Long id ,@RequestBody Plat plat) 
	{ return PlatService.updatePlat(plat);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) 
	{ PlatService.deletePlat(id);
	}
	@PostMapping
	public Plat add(@RequestBody Plat plat) { 
		return PlatService.addPlat(plat);
	}
	
	@GetMapping("/{id}")
	public Plat getPlatsById(@PathVariable Long id) { 
		return PlatService.findPlat(id);
	}
}
