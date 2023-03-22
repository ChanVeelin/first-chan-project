package com.ezen.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.EquipmentDAO;
import com.ezen.biz.dto.EquipmentVO;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentDAO edao;

	@Override
	public EquipmentVO getEquipmentByRoomid(String roomId) {
		return edao.getEquipmentByRoomid(roomId);
	}

	@Override
	public void insertEquipment(EquipmentVO vo) {
		 	edao.insertEquipment(vo);		
	}
}
