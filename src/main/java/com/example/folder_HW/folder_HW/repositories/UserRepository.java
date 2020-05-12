package com.example.folder_HW.folder_HW.repositories;

import com.example.folder_HW.folder_HW.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
