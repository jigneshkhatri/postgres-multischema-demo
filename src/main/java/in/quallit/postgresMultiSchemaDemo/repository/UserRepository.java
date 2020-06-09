package in.quallit.postgresMultiSchemaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.quallit.postgresMultiSchemaDemo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
