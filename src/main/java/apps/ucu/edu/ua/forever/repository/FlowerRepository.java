package apps.ucu.edu.ua.forever.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apps.ucu.edu.ua.forever.model.Flower;

@Repository
public interface FlowerRepository  extends JpaRepository<Flower, Long> {

}
