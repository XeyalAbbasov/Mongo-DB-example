package az.khayal.mongoDBproject.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "Book")
public class Book {

    private Integer id;
    private String bookName;
    private String authorName;
}
