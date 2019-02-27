package ro.codrut.storage.dao.entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import com.datastax.driver.core.LocalDate;

import java.util.Date;

import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;

/**
 * Entity that describes an user.
 * Created by cordu on 2/24/2019.
 */
@Table("person_by_name")
public class Person {

    @PrimaryKeyColumn(type = PARTITIONED)
    private String name;
    private String password;
    private String email;
    private LocalDate birthday;

    public Person(String name, String password, String email, LocalDate birthday) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
