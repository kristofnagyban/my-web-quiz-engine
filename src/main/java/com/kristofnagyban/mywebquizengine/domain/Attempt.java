package com.kristofnagyban.mywebquizengine.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Attempt {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Quiz quiz;
    private Double result;
    private LocalDateTime completedAt;
    @OneToMany(mappedBy = "attempt")
    private List<Answer> answers;

    public Attempt() {
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

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }
}
