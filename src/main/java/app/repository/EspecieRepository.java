package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import app.entity.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {
	
	@Query("SELECT v FROM Especie v WHERE v.nome LIKE CONCAT(:letra, '%')")
    List<Especie> findByNomeStartingWith(@Param("letra") String letra);

}
