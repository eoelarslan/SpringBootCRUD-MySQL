package com.docker.one.model;

import com.docker.one.model.base.DataEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Column(name = "surname", nullable = false)
    @NotEmpty(message = "Surname cannot be empty")
    private String surname;

    @Column(name = "date_of_birth", nullable = false)
    @NotNull(message = "Date of birth cannot be empty")
    private LocalDate dateOfBirth;

    @Column(name = "date_of_place", nullable = false)
    @NotEmpty(message = "Date of place cannot be empty")
    private String dateofPlace;

    @Column(name = "national", nullable = false)
    @NotEmpty(message = "National cannot be empty")
    private String national;

    @Column(name = "worth", nullable = false)
    @NotNull(message = "Worth cannot be empty")
    private int worth;
}
