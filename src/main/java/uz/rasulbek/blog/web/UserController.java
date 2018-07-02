package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.DBHelper;
import uz.rasulbek.blog.UserModel;

@Controller
@RequestMapping(path="/users")
public class UserController {
    @RequestMapping("/all")
    public String getUserPage(){return "user";}

    @Autowired
    DBHelper rep;
    @RequestMapping("/init")
    public void proccess(){
        rep.save(new UserModel("test","test","Test"));
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
