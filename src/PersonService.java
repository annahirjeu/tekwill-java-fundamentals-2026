//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

import java.util.Optional;

/**
 *
 * @author aminoiu
 * @since 6/17/2026
 */
public class PersonService {

    public Optional<Person> getById(int id) {
        if (id == 1) return Optional.of(new Person("Anna", 20));
        return Optional.empty();
    }
}