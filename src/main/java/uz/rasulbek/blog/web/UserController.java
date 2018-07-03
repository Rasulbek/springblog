package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.UserRepo;
import uz.rasulbek.blog.UserModel;

@Controller
@RequestMapping(path="/users")
public class UserController {
    @RequestMapping("/all")
    public String getUserPage(Model model){
        model.addAttribute("users",rep.findAll());
        return "user";
    }

    @Autowired
    UserRepo rep;

    @RequestMapping("/init")
    public void proccess(){
        rep.save(new UserModel("test1","test1","Test2"));
//        return "Done";
    }
    @RequestMapping("/find")
    public void greeting(@RequestParam(value="name", defaultValue="") String name) {
        System.out.println( rep.findByUser(name).toString());
    }
    @RequestMapping("/try")
    public void tryLogin(@RequestParam(value="name", defaultValue="") String name,@RequestParam(value="pass", defaultValue="") String pass) {
        System.out.println( rep.findByUserAndPassword(name,pass).toString());
    }
}
