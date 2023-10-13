package br.com.gianllucaleme.todolist.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

//nome de classe em letra maiuscula
/*
 * Modificadores:
 *  public
 *  private
 *  protected
*/

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel){
        
        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
    
}