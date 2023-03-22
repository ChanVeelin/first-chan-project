package com.ezen.biz.service;

import java.util.List;

import com.ezen.biz.dto.EquipmentVO;
import com.ezen.biz.dto.RoomVO;

public interface RoomService {

	int findMaxCapacity();

	String findRoomNameById(String roomId);

	RoomVO getRoomById(String RoomId);

	List<RoomVO> getAllRoom();

	void insertRoom(RoomVO room);
	
	void addRoomAndEquipment(RoomVO vo,List<EquipmentVO> equipmentList);

}