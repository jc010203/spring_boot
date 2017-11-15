package readingList;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by juan.hernandez on 11/15/17.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findReaderBy(String reader);
}