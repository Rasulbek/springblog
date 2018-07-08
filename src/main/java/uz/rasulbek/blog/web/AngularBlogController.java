package uz.rasulbek.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Page<BlogModel> getListOfBlogs(@RequestParam(defaultValue = "0") int page){
        return blogRepo.findAll(new PageRequest(page,4));
    }
}
