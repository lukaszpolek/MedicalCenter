package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.FreeDay;

public interface FreeDayRepository extends JpaRepository<FreeDay, Long> {

}
