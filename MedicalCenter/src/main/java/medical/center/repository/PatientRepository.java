package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
