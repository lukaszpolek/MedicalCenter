package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}
