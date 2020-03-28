package com.selflearning.services.room.roomservices.web.rest;

import com.selflearning.services.room.roomservices.domain.RoomEntity;
import com.selflearning.services.room.roomservices.repository.RoomRepository;
import io.micrometer.core.instrument.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
@Api(value = "rooms", description = "Data method to load rooms", tags = "rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(method = RequestMethod.GET)

    public List<RoomEntity> findAll(@RequestParam(name = "roomNumber", required = false)String roomNumber) {

        if (StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(roomRepository.findByRoomNumber(roomNumber));
        }

        return (List<RoomEntity>) roomRepository.findAll();

    }
}
