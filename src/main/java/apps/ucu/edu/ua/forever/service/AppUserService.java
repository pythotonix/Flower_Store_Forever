package apps.ucu.edu.ua.forever.service;

import apps.ucu.edu.ua.forever.model.AppUser;
import apps.ucu.edu.ua.forever.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public AppUser createUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser getUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
