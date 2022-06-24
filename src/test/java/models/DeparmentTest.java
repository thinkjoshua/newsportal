package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    @Test
    public void getNameReturnsCorrectName() {
        Department department = setupDepartment();
        assertEquals("IT", department.getName());
    }

    @Test
    public void getDescriptionReturnsCorrectDescription() {
        Department department = setupDepartment();
        assertEquals("building software", department.getDescription());
    }

    @Test
    public void getNumberOfEmployeesReturnsCorrectNumberOfEmployees() {
        Department department = setupDepartment();
        assertEquals(10, department.getNumberOfEmployees());
    }

    @Test
    public void setNameSetsCorrectName() throws Exception {
        Department department =setupDepartment();
        department.setName("HR");
        assertNotEquals("IT",department.getName());
    }

    @Test
    public void setDescriptionSetsCorrectDescription() throws Exception {
        Department department = setupDepartment();
        department.setDescription("maximum productivity");
        assertNotEquals("building software",department.getDescription());
    }

    @Test
    public void setNumberOfEmployeesSetsCorrectNumberOfEmployees() throws Exception {
        Department department = setupDepartment();
        department.setNumberOfEmployees(80);
        assertNotEquals(20,department.getNumberOfEmployees());
    }

    //helper
    public Department setupDepartment(){
        return  new Department("IT","building software",10);
    }

}