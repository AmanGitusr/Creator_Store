package meow.at.creatorstore.repositories;

import meow.at.creatorstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
