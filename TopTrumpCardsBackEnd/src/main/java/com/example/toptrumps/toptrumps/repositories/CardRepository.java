package com.example.toptrumps.toptrumps.repositories;

import com.example.toptrumps.toptrumps.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findCardByName(String name);

}
