package com.cleverdev.clientService.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;



@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "company_user")
@ToString
public class User {

    // id int8 NOT NULL GENERATED BY DEFAULT AS IDENTITY
    @Id
    @NotNull
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // login varchar(255) NOT NULL
    @NotEmpty(message = "Поле не может быть пустым")
    @NotNull
    @Size(min = 3, max = 20, message = "Длина в пределах 3-20")
    @Column(name = "login", unique = true)
    private String login;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdByUserId")
    private List<Note> listNoteForUserCreated;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lastModifiedByUserId")
    private List<Note> listNoteForUserUpdated;
}
