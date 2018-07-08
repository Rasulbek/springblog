package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.rasulbek.blog.BlogModel;
import uz.rasulbek.blog.BlogRepo;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class AngularBlogController {
    @Autowired
    private BlogRepo blogRepo;

    @RequestMapping
    public List<BlogModel> getListOfBlogs(){
        return blogRepo.findAll();
    }
}
