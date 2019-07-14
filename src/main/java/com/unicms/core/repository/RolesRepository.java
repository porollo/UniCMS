package com.unicms.core.repository;

import com.unicms.core.model.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RolesRepository extends CrudRepository<Roles, Long> {
}
