package com.objectwerx.repository;

/**
 * Created by bryan on 2/25/17.
 */

import com.objectwerx.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

}
