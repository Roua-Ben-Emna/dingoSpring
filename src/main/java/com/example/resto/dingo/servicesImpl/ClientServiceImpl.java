package com.example.resto.dingo.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resto.dingo.models.Client;
import com.example.resto.dingo.models.Plat;
import com.example.resto.dingo.repositories.ClientRepository;
import com.example.resto.dingo.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	@Autowired
	public ClientRepository ClientRepository;

	@Override
	public Client update(Client c) {
		// TODO Auto-generated method stub
		return ClientRepository.save(c);
	}



	@Override
	public Client signup(Client c) {
		// TODO Auto-generated method stub
		return ClientRepository.save(c);
	}

	@Override
	public Client login(String email, String pwd) {
		// TODO Auto-generated method stub
		return ClientRepository.findByEmailAndPassword(email,pwd);

	}

	@Override
	public Client profil(Long id) {
		Optional<Client> Client=ClientRepository.findById(id);
		return Client.isPresent()? Client.get(): null;
	}
//	@Override
//	public void deleteClient(Long id) {
//		ClientRepository.deleteById(id)
//		
//	}

}
