package uz.rasulbek.blog;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepo extends CrudRepository<BlogModel, Long> {

    List<BlogModel> findByUserId(int userId);

}
