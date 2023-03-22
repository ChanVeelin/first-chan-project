package com.ezen.biz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.RoomVO;

@Repository("Roomdao")
public class RoomDAO {
@Autowired
private JdbcTemplate jdbcTemplate;

private static final String SELECT_MAX_CAPACITY = "SELECT MAX(capacity) FROM room ";

private static final String GET_ROOM_NAME = "select room_name from room where room_id = ?";

private static final String  GET_ROOM_INFO = "select room_id,room_name,capacity from room where room_id =?";

private static final String GET_ALL_ROOM = "select * from room";

private static final String INSERT_ROOM = "insert into room values(?,?,?)";



public int findMaxCapacity() {
	return jdbcTemplate.queryForObject(SELECT_MAX_CAPACITY, Integer.class);
}

public String findRoomNameById(String roomId) {
	Object[] args = {roomId};
	
	return jdbcTemplate.queryForObject(GET_ROOM_NAME, args,String.class);
}
public RoomVO getRoomById(String roomId) {
	Object[] args = {roomId};
	return	jdbcTemplate.queryForObject(GET_ROOM_INFO,args,new RoomRowMapper());

}

public List<RoomVO> getAllRoom(){
	
	return jdbcTemplate.query(GET_ALL_ROOM,new RoomRowMapper());
}

public void insertRoom(RoomVO room) {
	Object[] args = {room.getRoom_id(), room.getRoom_name(),
					 room.getCapacity()};
	
	jdbcTemplate.update(INSERT_ROOM, args);
	
}


class RoomRowMapper implements RowMapper<RoomVO>{

    @Override
    public RoomVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        RoomVO room = new RoomVO();
        room.setRoom_id(rs.getString("room_id"));
        room.setRoom_name(rs.getString("room_name"));
        room.setCapacity(rs.getInt("capacity"));
        return room;
     }
  }




}