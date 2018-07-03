package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.rasulbek.blog.BlogModel;
import uz.rasulbek.blog.BlogRepo;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getMainPage(){return "index";}

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }

    @Autowired
    private BlogRepo blogRepo;
    @RequestMapping("/blog")
    public String blogs(Model model){
        model.addAttribute("blogs", blogRepo.findByUserId(1));
        return "blogs";
    }

    @RequestMapping("/addblog")
    public String add(){
        blogRepo.save(new BlogModel(1,"Yaratilgan title","desc"));
        return "ok";
    }
}
