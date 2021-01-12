package wcci.exercise.todolist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import wcci.exercise.todolist.Book;

@Repository
public class BookRepository {


        Map<Long, Book> booklList = new HashMap<>();
        public BookRepository() {
            Book jlaNew52 = new Book("JLA New 52","Geoff Johns","After Dc's characters become to powerful to write stories for, they decide to scrap things and start all over.","/JLA-New-52.jpg","This book was boring","poor",0L);
            Book kingdomCome = new Book("Kingdom Come","Alex Ross","Taking place in the future and aged JLA must form to defeat a new foe.","/kingdom-come.jpg","Best book this year","good",1L);
            Book lastAvengersStory = new Book("Last Avengers Story","Peter David","Taking place many years in the future Ultron reforms and any heros left must bad together to stop him.","/Last-Avengers-Story.jpg","Really well thought out book","good",2L);
            booklList.put(jlaNew52.getId(), jlaNew52);
            booklList.put(kingdomCome.getId(), kingdomCome );
            booklList.put(lastAvengersStory.getId(), lastAvengersStory);
        }
        public Collection<Book> getAllBooks() {
            return booklList.values();
        }
        public Book getOneBook(Long id) {
            return booklList.get(id);
        }

    }


