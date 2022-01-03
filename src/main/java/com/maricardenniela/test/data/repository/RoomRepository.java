package com.maricardenniela.test.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maricardenniela.test.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}