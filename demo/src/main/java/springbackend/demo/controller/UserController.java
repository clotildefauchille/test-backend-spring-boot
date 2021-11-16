package springbackend.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbackend.demo.model.User;
import springbackend.demo.repository.UserRepository;
// Pour créer un contrôleur, il suffit de créer une classe et de l’annoter @RestController et de lui affected un point d’accès. Chacune des méthodes aura l’annotation @RequestMapping qui indique quel chemin de l’API la méthode couvre et quelle méthode HTTP lui correspond.

@RestController
@RequestMapping("api/")
public class UserController {

    // Le principe d’autowiring est un autre concept important dans Spring Boot. Simplement en ajoutant l’annotation @Autowired au constructeur, Spring s’occupera d’instancier la classe directement en injectant les dépendances décrites dans les paramètres du constructeur, par exemple des services, repositories ou encore des objets de contexte. Pour chacun des objets injectés, il s’agira d’un c, c’est-à-dire que chacune des classes qui ont le même service comme dépendance recevront la même instance du service.

    @Autowired
    private UserRepository userRepository;
    
    // @RequestMapping est un niveau de classe, @GetMapping est un niveau de méthode font la meme chose

    @GetMapping("users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
