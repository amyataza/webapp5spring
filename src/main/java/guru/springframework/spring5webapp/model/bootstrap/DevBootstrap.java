package guru.springframework.spring5webapp.model.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

   public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
       initData();
   }
    private void initData(){
        //Eric
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        //Rod
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","2344","work");
        rod.getBooks().add(noEJB);
    }
}
