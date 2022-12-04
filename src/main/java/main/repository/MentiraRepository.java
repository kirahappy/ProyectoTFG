package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.model.Mentira;

@Repository
public interface MentiraRepository extends JpaRepository<Mentira, Integer> {

}
