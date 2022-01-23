package com.example.resto.dingo.services;

import java.util.List;

import com.example.resto.dingo.models.Client;
import com.example.resto.dingo.models.Plat;

public interface ClientService {

	public Client update(Client cp);
//	public void deleteClient(Long id);
	public Client signup(Client c);
	public Client login(String email,String pwd);
	public Client profil(Long id);
}
