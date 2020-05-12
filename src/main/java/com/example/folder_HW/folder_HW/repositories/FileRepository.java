package com.example.folder_HW.folder_HW.repositories;


import com.example.folder_HW.folder_HW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
