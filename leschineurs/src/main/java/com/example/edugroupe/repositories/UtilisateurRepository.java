package com.example.edugroupe.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.edugroupe.model.Utilisateur;

public interface UtilisateurRepository extends PagingAndSortingRepository<Utilisateur, Integer> {

}
