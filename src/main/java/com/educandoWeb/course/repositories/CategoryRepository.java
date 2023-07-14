package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.Category;
import com.educandoWeb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
