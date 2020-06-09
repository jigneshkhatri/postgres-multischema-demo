package in.quallit.postgresMultiSchemaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.quallit.postgresMultiSchemaDemo.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
