package com.kristofnagyban.mywebquizengine.domain;

import javax.persistence.*;

@Entity
public class Answer {

    @GeneratedValue
    @Id
    private Long id;
    @ManyToOne
    private Attempt attempt;
    @ManyToOne
    private Option option;
}
