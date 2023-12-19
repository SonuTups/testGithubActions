package test.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import test.test.model.Bikes;

public interface BikesRepo extends JpaRepository<Bikes, Long> {
}
