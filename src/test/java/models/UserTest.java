
package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNameReturnsCorrectName() {
        User user = setupUser();
        assertEquals("larry", user.getName());
    }

    @Test
    public void getPositionReturnsCorrectPosition() {
        User user = setupUser();
        assertEquals("manager", user.getPosition());
    }

    @Test
    public void getRoleReturnsCorrectRole() {
        User user = setupUser();
        assertEquals("news anchor", user.getRole());
    }

    @Test
    public void getDepartmentReturnsCorrectDepartment() {
        User user = setupUser();
        assertEquals(1, user.getDepartmentId());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        User user = setupUser();
        user.setName("madowo");
        assertNotEquals("larry",user.getName());
    }


    @Test
    public void setPositionSetsCorrectPosition() throws Exception {
        User user = setupUser();
        user.setPosition("junior");
        assertNotEquals("manager",user.getPosition());
    }

    @Test
    public void setRoleSetsCorrectRole() throws Exception {
        User user = setupUser();
        user.setRole("developer");
        assertNotEquals("news anchor",user.getRole());
    }

    //helper
    public User setupUser(){
        return  new User("larry","manager","news anchor",1);
    }

}