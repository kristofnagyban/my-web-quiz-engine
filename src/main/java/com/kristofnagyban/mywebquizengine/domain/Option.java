package com.kristofnagyban.mywebquizengine.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Option {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private Question question;
    private String optionBody;
    private Boolean correct;
    @OneToMany(mappedBy = "option")
    private List<Answer> answers;

    private Option() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getOptionBody() {
        return optionBody;
    }

    public void setOptionBody(String optionBody) {
        this.optionBody = optionBody;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }
}
