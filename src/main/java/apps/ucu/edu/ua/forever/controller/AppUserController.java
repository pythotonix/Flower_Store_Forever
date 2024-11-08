package apps.ucu.edu.ua.forever.controller;

import java.net.ResponseCache;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import apps.ucu.edu.ua.forever.model.AppUser;
import apps.ucu.edu.ua.forever.service.AppUserService;


@RestController
@RequestMapping("/api/v1")
public class AppUserController {


    private AppUserService AppUserService;

    @Autowired
    public AppUserController(AppUserService AppUserService) {
        this.AppUserService = AppUserService;
    }

    @GetMapping("/user")
    public List<AppUser> getUsers() {
        return AppUserService.getUsers();
    }

    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser user) {
        return AppUserService.createUser(user);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = AppUserService.getUserByEmail(email);
        if (userByEmail != null) {
            return ResponseEntity.ok(userByEmail);
        }

        return ResponseEntity.notFound().build();
    }
 
}
