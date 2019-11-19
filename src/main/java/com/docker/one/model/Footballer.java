package com.docker.one.model;

import com.docker.one.model.base.DataEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Created by ersin on 16.11.2019.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "footballer")
public class Footballer extends DataEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "date_of_place", nullable = false)
    private String dateofPlace;

    @Column(name = "national", nullable = false)
    private String national;

    @Column(name = "worth", nullable = false)
    private int worth;
}
