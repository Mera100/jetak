package life.majd.jetak.jetak.repository;

import life.majd.jetak.jetak.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepo extends JpaRepository<Business, Long> {
    Business findByName(String name);
}
