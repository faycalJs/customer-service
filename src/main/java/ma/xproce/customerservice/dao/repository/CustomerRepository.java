package ma.xproce.customerservice.dao.repository;

import ma.xproce.customerservice.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
