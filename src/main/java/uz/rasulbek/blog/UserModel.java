package uz.rasulbek.blog;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "public", name = "user")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "user")
    private String user;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public UserModel() {
    }

    public UserModel(String user, String password, String role) {
        this.user = user;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, user=%s, password=%s, role=%s]",id,user,password,role);
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
