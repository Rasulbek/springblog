package uz.rasulbek.blog;

import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(userRepo.findByUser(username).getUser(),
                userRepo.findByUser(username).getPassword(),
                ImmutableList.of(Role.getRoleFromString(userRepo.findByUser(username).getRole())));
//        return new User(username,"{noop}password", ImmutableList.of(Role.USER));
    }
//
//    public UserDetails loadUserByUsernameAndPassword(String u, String p){
//        return new User(u,p, ImmutableList.of(Role.USER));
//    }
}
