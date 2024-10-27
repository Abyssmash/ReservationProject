package dao;

import java.sql.Connection;
import java.util.ArrayList;

import dto.BusDTO;
import dto.reservationDTO;
import dto.signUpDTO;
import dto.userDTO;

public interface DBdao {
	
	
	public void add(BusDTO resbusdto);
	public void add(reservationDTO reslistdto);
	public void add(signUpDTO signupdto);
	public void add(userDTO userdto);
	public ArrayList<reservationDTO> selectAll();
	public void delete(reservationDTO reslistdto);
	
	
}
