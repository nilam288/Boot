package yash.repository;

import yash.bean.User;
import org.springframework.data.repository.CrudRepository;

//@RepositoryRestResource

//@CrossOrigin(origins = "http://localhost:4200")

public interface UserRepository extends CrudRepository<User, Integer> {}