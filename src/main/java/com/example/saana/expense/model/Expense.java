package com.example.saana.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private Long id;
    private Instant expensedate;
    private String description;
    private String location;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

}
