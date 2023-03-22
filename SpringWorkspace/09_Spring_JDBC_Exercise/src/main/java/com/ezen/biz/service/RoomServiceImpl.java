package com.ezen.biz.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.EquipmentDAO;
import com.ezen.biz.dao.RoomDAO;
import com.ezen.biz.dto.EquipmentVO;
import com.ezen.biz.dto.RoomVO;

@Service("roomService")
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDAO rdao;
	@Autowired
	private EquipmentDAO edao;
	
	@Override
	public int findMaxCapacity() {
		
		return rdao.findMaxCapacity();
	}
	
	@Override
	public RoomVO getRoomById(String roomId){
		
		return rdao.getRoomById(roomId);
	}
	@Override
	public List<RoomVO> getAllRoom(){
		
		return rdao.getAllRoom();
	}
	
	
	@Override
	public void insertRoom(RoomVO room) {
		
		rdao.insertRoom(room);
	}


	@Override
	public String findRoomNameById(String roomId) {
		
				return rdao.findRoomNameById(roomId);
	}

	@Override
	public void addRoomAndEquipment(RoomVO vo, List<EquipmentVO> EquipmentList) {
		//회의실 정보 저장
		insertRoom(vo);
		
		//설비 목록 저장
		for(int i=0; i<EquipmentList.size(); i++) {
			edao.insertEquipment(EquipmentList.get(i));
		}
	}
	
}
