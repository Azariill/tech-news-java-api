package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@JsonIgnoreProperties({"hiberanteLazyInitializer", "handler"})
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String email;
    private String password;
    boolean loggedIn;
    private List<Post> posts;
    private List<Vote> votes;
    private List<Comment> comments;

}
