package com.unicms.core.repository;

import com.unicms.core.model.UserDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user_details", path = "user_details")
public interface UserDetailsRepository extends PagingAndSortingRepository<UserDetails, Long> {

    List<UserDetails> findByLastName(@Param("name") String name);

}
