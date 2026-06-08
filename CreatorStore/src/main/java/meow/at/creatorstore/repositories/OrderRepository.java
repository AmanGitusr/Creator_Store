package meow.at.creatorstore.repositories;

import meow.at.creatorstore.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
