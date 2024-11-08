package apps.ucu.edu.ua.forever.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import apps.ucu.edu.ua.forever.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    AppUser findUserByEmail(String email);

    AppUser findByEmail(String email);
}
