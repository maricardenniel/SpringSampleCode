package com.maricardenniela.test.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maricardenniela.test.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

}
