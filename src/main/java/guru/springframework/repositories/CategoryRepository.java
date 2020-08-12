package guru.springframework.repositories;

import guru.springframework.domain.Catagory;
import org.springframework.data.repository.CrudRepository;

import java.util.Locale;
import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Catagory, Long> {
    Optional<Locale.Category> findByDescription(String description);
}
