package com.example.resto.dingo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resto.dingo.models.Client;

public interface ClientRepository extends JpaRepository<Client,Long>  {

	Client findByEmailAndPassword(String email, String pwd);

}
