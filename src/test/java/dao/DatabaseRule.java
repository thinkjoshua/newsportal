package dao;

import org.junit.rules.ExternalResource;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {
    @Override
    public void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/news_portal_test", "musau", "musau");

//        DB.sql2o = new Sql2o("jdbc:postgresql://ec2-3-216-113-109.compute-1.amazonaws.com:5432/d7hqiacsnied5j?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", "bgwqbtgpaaszcr", "e55b1fc7c6e8dba5d22fd3036bb6d22857d714694c997e8f9059ac8e54b162f3");
//
    }

    @Override
    public void after(){
        try(Connection conn = DB.sql2o.open()){
            String deleteUserQuery = "DELETE FROM users";
            String deleteDepartmentsQuery = "DELETE FROM departments";
            String deleteNewsQuery = "DELETE FROM news";
            conn.createQuery(deleteUserQuery).executeUpdate();
            conn.createQuery(deleteDepartmentsQuery).executeUpdate();
            conn.createQuery(deleteNewsQuery).executeUpdate();
        }
    }
}