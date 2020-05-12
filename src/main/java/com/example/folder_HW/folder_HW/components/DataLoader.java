package com.example.folder_HW.folder_HW.components;

import com.example.folder_HW.folder_HW.models.File;
import com.example.folder_HW.folder_HW.models.Folder;
import com.example.folder_HW.folder_HW.models.User;
import com.example.folder_HW.folder_HW.repositories.FileRepository;
import com.example.folder_HW.folder_HW.repositories.FolderRepository;
import com.example.folder_HW.folder_HW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User bob = new User("Bob");
        userRepository.save(bob);

        Folder desktop = new Folder("Desktop", bob);
        folderRepository.save(desktop);

        File codeClanSecrets = new File("CodeClan", ".exe", 10, desktop);
        fileRepository.save(codeClanSecrets);

        desktop.addFile(codeClanSecrets);
        bob.addFolder(desktop);

        folderRepository.save(desktop);
        userRepository.save(bob);

    }
}
