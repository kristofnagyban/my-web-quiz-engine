package com.kristofnagyban.mywebquizengine.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private Quiz quiz;
    private String questionBody;
    @OneToMany(mappedBy = "question")
    private List<Option> options;
    private Boolean illustration;

    private Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Boolean getIllustration() {
        return illustration;
    }

    public void setIllustration(Boolean illustration) {
        this.illustration = illustration;
    }
}
