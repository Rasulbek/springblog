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

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

@Controller
public class BlogController {
    @Autowired
    private BlogRepo blogRepo;

    @RequestMapping("/blog")
    public String blogs(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try{
            User user = (User)  auth.getPrincipal();
            model.addAttribute("user",user.getUsername());
        }catch (Exception e){

        }
        model.addAttribute("blogs", blogRepo.findAll());
        return "blogs";
    }

    @RequestMapping("/addblog")
    public String add(){
        blogRepo.save(new BlogModel(1,"Yaratilgan title","desc"));
        return "ok";
    }

    @RequestMapping("/newblog")
    public String newBlog(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        try{
            User user = (User)  auth.getPrincipal();
            model.addAttribute("user",user.getUsername());
        }catch (Exception e){

        }
        return "write";
    }
    @RequestMapping(value = "/newblog", method = RequestMethod.POST)
    public void addBlog(@RequestParam(name = "title") String title, @RequestParam(name = "blogtext") String blogtext, HttpServletResponse httpServletResponse) throws IOException {

        blogRepo.save(new BlogModel(1,title,blogtext, new Timestamp(System.currentTimeMillis()),0));
        httpServletResponse.sendRedirect("/blog");

    }
}
