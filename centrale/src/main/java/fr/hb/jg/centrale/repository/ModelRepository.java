package fr.hb.jg.centrale.repository;

import fr.hb.jg.centrale.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {


}