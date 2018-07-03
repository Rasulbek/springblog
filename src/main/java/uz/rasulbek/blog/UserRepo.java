package uz.rasulbek.blog;


import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<UserModel, Long> {
//    List<UserModel> findByUser(String user);
    UserModel findByUsername(String user);

    Optional<UserModel> findByUsernameAndPassword(String user, String pass);

}
