package com.example.saana.expense.repository;

import com.example.saana.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName (String name);
}
