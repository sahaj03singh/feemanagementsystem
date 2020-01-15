package com.surbhi.data;
import com.surbhi.model.User;
public interface UserDAO {

	public void addUser(User user)throws Exception;
	public User getUser(String userId) throws Exception;
	
}
