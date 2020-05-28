package com.playtech.dsrautotest.model;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@Data
@Entity(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Column
    private String name;

    @NotEmpty
    private String script;

    @UpdateTimestamp
    @Column(updatable = false)
    private Timestamp insertDate;

    @UpdateTimestamp
    @Column
    private Timestamp lastModified;
}
