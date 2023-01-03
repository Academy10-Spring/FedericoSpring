package it.sabafed.miosito.repository;

import org.springframework.data.repository.CrudRepository;

import it.sabafed.miosito.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
