package dao;

import models.Department;
import models.User;
import org.eclipse.jetty.server.Authentication;
import org.junit.*;
import org.sql2o.Connection;

import static org.junit.Assert.*;

public class Sql2oUserDaoTest {
    private static Connection conn;
    private static  Sql2oUserDao userDao;
    private static Sql2oDepartmentDao departmentDao;


    @BeforeClass
    public static void setUp() throws Exception {
        departmentDao = new Sql2oDepartmentDao(DB.sql2o);
        userDao = new Sql2oUserDao(DB.sql2o);
        conn = DB.sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("clearing database");
        departmentDao.clearAll();
        userDao.clearAll();
    }

    @AfterClass
    public static void shutDown() throws Exception{
        conn.close();
        System.out.println("connection closed");
    }


    @Test
    public void getAll() throws Exception {
        User user = setupUser();
        User user2 = setupUser();
        assertEquals(2, userDao.getAll().size());
    }

    @Test
    public void getAllUsersForADepartment() throws Exception {
        Department department1 = setupDepartment();
        Department department2 = setupDepartment();
        User user1 = setupUserForADepartment(department1);
        User user2 = setupUserForADepartment(department1);
        User otherUser = setupUserForADepartment(department2);

        assertEquals(2, userDao.getAllUsersForADepartment(department1.getId()).size());
    }

    @Test
    public void deleteById() throws Exception {
        User testUser = setupUser();
        User otherUser = setupUser();
        assertEquals(2, userDao.getAll().size());
        userDao.deleteById(testUser.getId());
        assertEquals(1, userDao.getAll().size());
    }

    @Test
    public void clearAll() throws Exception {
        User testUser = setupUser();
        User otherUser = setupUser();
        userDao.clearAll();
        assertEquals(0, userDao.getAll().size());
    }

    //helpers
    public User setupUser(){
        User user = new User("Mike","Intern","Junior writer",100);
        userDao.add(user);
        return  user;
    }

    public Authentication.User setupUserForADepartment(Department department){
        User user = new User("Mike","Intern","Junior writer",department.getId());
        userDao.add(user);
        return user;
    }

    public Department setupDepartment(){
        Department department =  new Department("IT", "build software", 10);
        departmentDao.add(department);
        return department;
    }
}