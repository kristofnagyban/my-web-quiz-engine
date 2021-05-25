package com.kristofnagyban.mywebquizengine.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Quiz {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private User user;
    private String title;
    private String description;
    @OneToMany(mappedBy = "quiz")
    private List<Question> questions;
    private LocalDateTime createdAt;
    private Boolean restricted;
    @OneToMany(mappedBy = "quiz")
    private List<Attempt> attempts;

    private Quiz() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
