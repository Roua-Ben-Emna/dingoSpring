package com.example.resto.dingo.services;

import java.util.List;
import java.util.Optional;

import com.example.resto.dingo.models.Plat;
public interface PlatService {
	public List<Plat> getAllPlats();
	public Plat updatePlat(Plat p);
	public void deletePlat(Long id);
	public Plat addPlat(Plat p);
	public Plat findPlat(Long id);
	

}
