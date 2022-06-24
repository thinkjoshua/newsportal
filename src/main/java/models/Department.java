package models;

import java.util.Objects;

public class Department {
    int id, number0fEmployees;
    String name,descripton;

    public Department(int number0fEmployees,String name, String descripton) {
        this.number0fEmployees = number0fEmployees;
        this.name=name;
        this.descripton=descripton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return number0fEmployees == that.number0fEmployees &&
                Objects.equals(name, that.name) &&
                Objects.equals(descripton, that.descripton);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number0fEmployees, name, descripton);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber0fEmployees() {
        return number0fEmployees;
    }

    public void setNumber0fEmployees(int number0fEmployees) {
        this.number0fEmployees = number0fEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }
}
