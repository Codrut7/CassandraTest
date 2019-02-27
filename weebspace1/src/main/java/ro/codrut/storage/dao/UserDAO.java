package ro.codrut.storage.dao;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ro.codrut.storage.dao.entities.Person;

import java.util.List;

/**
 * DAO for user.
 * Created by cordu on 2/26/2019.
 */
@Repository
public interface UserDAO extends CassandraRepository<Person,String> {

    /**
     * Query to search for a person by its name.
     * @param name of the person you want to search for.
     * @return
     */
    List<Person> findByName(final String name);
}
