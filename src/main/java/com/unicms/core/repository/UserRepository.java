package com.unicms.core.repository;

import com.unicms.core.model.User;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends CrudRepository<User, Long> {

    Flux<User> findAllUsers();

}

