package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.UserModel;
import uz.rasulbek.blog.UserRepo;

@Controller
public class RegController {

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegForm(){
        return "registration";
    }

    @Autowired
    private UserRepo userRepo;

    @RequestMapping(method=RequestMethod.POST, value = "/registration")
    public String regUser(@RequestParam(value = "username", required = false) String username,
                          @RequestParam(value = "password", required = false) String password,
                          @RequestParam(value = "cpass", required = false) String confirmation
            , Model model){

        if(password.length()<4){
            model.addAttribute("response","Parol juda kichik! Kamida 4 ta belgi bo'lishi kerak.");
        }else if(!password.equals(confirmation)){
            model.addAttribute("response","Parollar bir hil emas");
        }else if(userRepo.findByUsername(username)!=null){
            model.addAttribute("response","Ushbu <b>"+username+"</b> foydalanuvchi nomi band!");
        }else{
            userRepo.save(new UserModel(username,new BCryptPasswordEncoder().encode(password),"USER"));
//            model.addAttribute("response",username+" muvaffaqqiyatli ro'yhatdan o'tdi!");
            return "redirect:/?info";
        }
        return "registration";
    }
}
