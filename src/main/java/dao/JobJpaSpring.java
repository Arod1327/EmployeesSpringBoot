package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Jobs;

public interface JobJpaSpring extends JpaRepository<Jobs, Integer>{
	Jobs findByName(String name);
	@Transactional
	@Modifying
	@Query("Delete from Jobs b Where b.name=?1")
	void eliminarJob(String name);
}
