package com.playtech.dsrautotest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity(name = "TestSuiteContent")
public class TestSuiteContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Long testId;

    @ManyToOne(fetch = FetchType.EAGER)
    TestSuite testSuite;
}
