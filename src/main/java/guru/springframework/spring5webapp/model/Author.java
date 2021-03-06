package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastName;

    @ManyToMany(mappedBy = "Authors")
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public Author(String firstname, String lastName, Set<Book> books) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
