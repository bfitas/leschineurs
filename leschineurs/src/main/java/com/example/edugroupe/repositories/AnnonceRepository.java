package com.example.edugroupe.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.edugroupe.model.Annonce;

public interface AnnonceRepository extends PagingAndSortingRepository<Annonce, Integer> {

}
