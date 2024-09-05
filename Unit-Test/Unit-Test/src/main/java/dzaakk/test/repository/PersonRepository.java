package dzaakk.test.repository;

import dzaakk.test.data.Person;

public interface PersonRepository {
    Person selectById(String id);
}
