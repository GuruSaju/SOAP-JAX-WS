package guru.soap.service;

import guru.soap.model.User;

/**
 * 
 * @author Srisarguru
 *
 */
public interface UserInterface {
	
public boolean addUser(User user);
	
	public boolean deleteUser(int id);
	
	public User getUser(int id);
	
	public User[] getAllPersons();
}
