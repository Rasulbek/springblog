package uz.rasulbek.blog;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepo extends JpaRepository<BlogModel, Long> {

    List<BlogModel> findByUserId(int userId);

    default BlogModel findById2(int id){
        BlogModel bm = findById(Long.valueOf(id)).get();
        bm.setViewed();
        this.save(bm);
        return bm;
    }

}
