package com.example.saana.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

    @OneToMany
    private Set<Category> category;
}
