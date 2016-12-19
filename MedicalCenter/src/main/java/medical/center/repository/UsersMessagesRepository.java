package medical.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import medical.center.domain.UserMessage;

public interface UsersMessagesRepository extends JpaRepository<UserMessage, Long>{
		
}
