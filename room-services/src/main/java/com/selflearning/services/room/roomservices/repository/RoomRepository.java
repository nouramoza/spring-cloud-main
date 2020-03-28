package com.selflearning.services.room.roomservices.repository;

import com.selflearning.services.room.roomservices.domain.RoomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

    public RoomEntity findByRoomNumber(String roomNumber);
}
