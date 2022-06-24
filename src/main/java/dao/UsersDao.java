
package dao;

import models.User;
import org.eclipse.jetty.server.Authentication;

import java.util.List;

public interface UserDao {
    //create
    void add(User user);

    //read
    List<User> getAll();
    List<User> getAllUsersForADepartment(int departmentId);

    //delete
    void deleteById(int id);
    void clearAll();

}

