package com.example.resto.dingo.servicesImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.resto.dingo.models.Plat;
import com.example.resto.dingo.repositories.PlatRepository;
import com.example.resto.dingo.services.PlatService;

@Service
public class PlatServiceImpl implements PlatService  {
	@Autowired
	public PlatRepository PlatRepository;
	
	@Override
	public List<Plat> getAllPlats() {
		// TODO Auto-generated method stub
		return PlatRepository.findAll();
	}

	@Override
	public Plat updatePlat(Plat p) {
		// TODO Auto-generated method stub
		return PlatRepository.save(p);
	}
	
	@Override
	public void deletePlat(Long id) {
		// TODO Auto-generated method stub
		PlatRepository.deleteById(id);
	}

	@Override
	public Plat addPlat(Plat p) {
		// TODO Auto-generated method stub
		return PlatRepository.save(p);
	}

	@Override
	public Plat findPlat(Long id) {
		Optional<Plat> Plat=PlatRepository.findById(id);
		return Plat.isPresent()? Plat.get(): null;
	}




}
