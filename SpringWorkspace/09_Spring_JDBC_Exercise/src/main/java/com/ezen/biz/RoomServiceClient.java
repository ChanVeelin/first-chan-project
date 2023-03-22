package com.ezen.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.EquipmentVO;
import com.ezen.biz.dto.RoomVO;
import com.ezen.biz.service.EquipmentService;
import com.ezen.biz.service.RoomService;

public class RoomServiceClient {
	
private	static RoomService roomService = null;
private static EquipmentService equipService;
	
	
	public static void main(String[] args) {
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		roomService = (RoomService) container.getBean("roomService");
		
		
		
		List<RoomVO> RoomList = roomService.getAllRoom();
		for (RoomVO vo : RoomList) {
			System.out.println(vo);
		}
		
		RoomVO vo = roomService.getRoomById("A001");
		printRoomInfo(vo);
			
		//새로운 회의실과 설비 저장
		RoomVO room1 = new RoomVO();
		room1.setRoom_id("B001");
		room1.setRoom_name("방문객 회의실");
		room1.setCapacity(6);
		
		
		List<EquipmentVO> eList = new ArrayList<>();
		EquipmentVO item1 = new EquipmentVO();
		item1.setEquipment_id("50-1");
		item1.setEquipment_name("회의용 테이블");
		item1.setEquipment_count(1);
		item1.setEquipment_remarks("");
		item1.setRoom_id("B001");
		
		eList.add(item1);
		
	//	roomService.addRoomAndEquipment(room1, eList);
		/*
		 * roomService.insertRoom(room1); for(int i=0; i<eList.size(); i++) {
		 * equipService.insertEquipment(eList.get(i)); }
		 */
		List<RoomVO> roomList = roomService.getAllRoom();
		System.out.println(">> 모든회의실 목록");
		for(RoomVO room : roomList) {
			System.out.println("\t"+room);
		}
	}
	
	public static void printRoomInfo(RoomVO vo) {
		System.out.println(">> 회의실정보");
		System.out.println(vo);
	}
	
}	
	
	
	


	


