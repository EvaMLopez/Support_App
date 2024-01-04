package dev.evalopez.appsupport.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.evalopez.appsupport.Model.User;
import dev.evalopez.appsupport.Service.UserService;

@RestController
@RequestMapping("${api-endpoint}/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
    User user = userService.findById(id);    
    if (user != null) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    } else {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Usuario no encontrado");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    }

    @GetMapping
    public List<User> listAll() {
        List<User> users = userService.getAll();
        logger.info("Usuarios devueltos: {}", users);
        return users;
    }

    @PostMapping
    public User save(@RequestBody User entity) {
        User savedUser = userService.save(entity);
        logger.info("Usuario guardado: {}", savedUser);
        return savedUser;
    }
}