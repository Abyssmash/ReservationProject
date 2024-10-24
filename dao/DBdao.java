package dao;

import java.util.ArrayList;

import dto.resBusDTO;
import dto.resListDTO;
import dto.signUpDTO;
import dto.userDTO;

public interface DBdao {
	
	public void add(resBusDTO resbusdto);
	public void add(resListDTO reslistdto);
	public void add(signUpDTO signupdto);
	public void add(userDTO userdto);
	public ArrayList<resListDTO> selectAll();
	public void delete(resListDTO reslistdto);
}
