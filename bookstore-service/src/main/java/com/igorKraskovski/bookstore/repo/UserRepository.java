package com.igorKraskovski.bookstore.repo;

import com.igorKraskovski.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
