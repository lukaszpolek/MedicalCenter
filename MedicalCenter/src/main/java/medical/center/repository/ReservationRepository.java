package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
