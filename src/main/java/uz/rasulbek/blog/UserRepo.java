package uz.rasulbek.blog;


import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<UserModel, Long> {
//    List<UserModel> findByUser(String user);
    UserModel findByUser(String user);

    Optional<UserModel> findByUserAndPassword(String user, String pass);

}
