package pl.coderbrother.dockerintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderbrother.dockerintro.model.Customer;

import java.util.List;

@Repository
public interface CustomerCrudRepository extends JpaRepository<Customer, Integer> {
}
