package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import medical.center.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
