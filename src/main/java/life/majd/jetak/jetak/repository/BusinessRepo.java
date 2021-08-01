package life.majd.jetak.jetak.repository;

import life.majd.jetak.jetak.model.Business;
import life.majd.jetak.jetak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessRepo extends JpaRepository<Business, Long> {
    Business findByName(String name);

    @Query("SELECT b FROM Business b WHERE ?1 member of b.owners")
    List<Business> findByOwner(User owner);
}
