package dao;

import models.Department;
import models.News;

import java.util.List;

public interface NewsDao {
    //create
    void add(News news);
    void addNewsToDepartment(News news, Department department);

    //read
    List<News> getAll();
    List<Department> getAllDepartmentsForANews(int id);
    News findById(int id);

    //delete
    void deleteById(int id);
    void clearAll();
}

