package uz.rasulbek.blog;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN;


    @Override
    public String getAuthority() {
        return name();
    }

    public static Role getRoleFromString(String s){
        switch (s){
            case "USER":
                return USER;

            case "ADMIN":
                return ADMIN;

        }
        return null;
    }
}
