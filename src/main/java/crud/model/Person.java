package crud.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Component
public class Person {
    private int id;

    @Size(min = 2, max = 30, message = "{person.name.size}")
    private String name;

    @Min(value = 0, message = "{person.age.min}")
    private int age;

    @NotEmpty(message = "{person.email.notempty}")
    @Email(message = "{person.email}")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
