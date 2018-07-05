package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.*;

@Controller
public class MainController {
    PageConfig pageConfig = PageConfig.get();

    @Autowired
    private UserRepo userRepo;

    @RequestMapping("/")
    public String getMainPage(@RequestParam(value = "info", required = false) String info,Model model){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try{
            User user = (User)  auth.getPrincipal();
            pageConfig.setUserName(user.getUsername());
            pageConfig.setUserId((int)userRepo.findByUsername(user.getUsername()).getId());
            model.addAttribute("user",pageConfig.getUserName());
        }catch (Exception e){
//            model.addAttribute("user","mehmon");
        }
        model.addAttribute("info", info!=null);
        return "index";
    }

    @RequestMapping("/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model){
        model.addAttribute("error", error!=null);
        model.addAttribute("logout", logout!=null);

        return "login";
    }


}
