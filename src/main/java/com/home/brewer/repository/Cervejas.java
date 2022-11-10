package com.home.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.brewer.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {

}
