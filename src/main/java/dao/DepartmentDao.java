package dao;

import models.Department;
import models.News;

import java.util.List;

public interface DepartmentDao {
    // create
    void add(Department department);
    void addDepartmentToNews(Department department, News news);

    //read
    List<Department> getAll();
    List<News> getAllNewsForADepartment(int departmentId);
    Department findById(int id);

    //delete
    void deleteById(int id);
    void clearAll();
}




