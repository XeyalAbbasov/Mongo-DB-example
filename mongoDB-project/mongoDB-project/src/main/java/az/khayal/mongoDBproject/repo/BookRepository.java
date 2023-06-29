package az.khayal.mongoDBproject.repo;

import az.khayal.mongoDBproject.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
