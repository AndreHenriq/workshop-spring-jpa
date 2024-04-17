package com.nelio.workshopspringjpa.repositories;

import com.nelio.workshopspringjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
