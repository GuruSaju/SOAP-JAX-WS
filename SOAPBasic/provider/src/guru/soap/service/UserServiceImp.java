package guru.soap.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import guru.soap.model.User;

/**
 * 
 * @author Srisarguru
 *
 */
public class UserServiceImp implements UserInterface{
	
	private static Map<Integer,User> users = new HashMap();
	
	@Override
	public boolean addUser(User user) {
		users.put(user.getId(), user);
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		if(users.get(id)==null)
			return false;
		users.remove(id);
		return true;
	}

	@Override
	public User getUser(int id) {	
		return users.get(id);
	}

	@Override
	public User[] getAllPersons() {
		ArrayList<User> alUser = users.values().stream().collect(Collectors.toCollection(ArrayList::new));
		return (User[]) alUser.toArray();
	}

}
