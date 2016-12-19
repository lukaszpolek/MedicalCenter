package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.Receptionist;

public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

}
