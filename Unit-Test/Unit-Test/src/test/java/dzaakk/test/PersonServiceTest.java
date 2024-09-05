package dzaakk.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import dzaakk.test.data.Person;
import dzaakk.test.repository.PersonRepository;
import dzaakk.test.service.PersonService;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testPersonGetSuccess() {
        Mockito.when(personRepository.selectById("001"))
                .thenReturn(new Person("001", "person1"));

        var person = personService.get("001");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("001", person.getId());
        Assertions.assertEquals("person1", person.getName());
    }
}
