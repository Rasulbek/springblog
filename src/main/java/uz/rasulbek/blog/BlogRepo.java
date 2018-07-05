package uz.rasulbek.blog;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BlogRepo extends JpaRepository<BlogModel, Long> {

    List<BlogModel> findByUserId(int userId);

    default BlogModel findById2(int id){
        BlogModel bm = findById(Long.valueOf(id)).get();
        bm.setViewed();
        this.save(bm);
        return bm;
    }

}
