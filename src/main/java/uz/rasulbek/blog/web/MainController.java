package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.BlogModel;
import uz.rasulbek.blog.BlogRepo;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getMainPage(){return "index";}

    @RequestMapping("/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model){
        model.addAttribute("error", error!=null);
        model.addAttribute("logout", logout!=null);
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
