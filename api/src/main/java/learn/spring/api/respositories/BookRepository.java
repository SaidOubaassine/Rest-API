package learn.spring.api.respositories;

import learn.spring.api.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, String> {
}
