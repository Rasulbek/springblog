package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uz.rasulbek.blog.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogRepo blogRepo;
    PageConfig pageConfig = PageConfig.get();

    @RequestMapping(value = "/blogs")
    public String blogs(@RequestParam(name="page", required = false,defaultValue = "1") int pageId, Model model){
        model.addAttribute("user",pageConfig.getUserName());
        model.addAttribute("cp", pageId);
        return "blogsang";
    }

    @RequestMapping("/addblog")
    public String add(){
        blogRepo.save(new BlogModel(1,"Yaratilgan title","desc"));
        return "ok";
    }

    @RequestMapping("/newblog")
    public String newBlog(Model model){
        model.addAttribute("user",pageConfig.getUserName());
        model.addAttribute("userId",pageConfig.getUserId());
        return "write";
    }

    @RequestMapping(value = "/newblog", method = RequestMethod.POST)
    public void addBlog(@RequestParam(name = "title") String title, @RequestParam(name = "blogtext") String blogtext, HttpServletResponse httpServletResponse) throws IOException {
        blogRepo.save(new BlogModel(pageConfig.getUserId(),title,blogtext, new Timestamp(System.currentTimeMillis()),0));
        httpServletResponse.sendRedirect("/blogs");

    }

    @RequestMapping("/blog/{blogId}")
    public String blog(@PathVariable(value="blogId") int id, Model model){
        model.addAttribute("blog", blogRepo.findById2(id));
        model.addAttribute("user",pageConfig.getUserName());
        return "blog";
    }
}
