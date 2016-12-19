package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.Visit;

public interface VisitsRepository extends JpaRepository<Visit, Long>{
	

}
