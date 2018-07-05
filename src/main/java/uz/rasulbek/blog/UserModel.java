package uz.rasulbek.blog;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(schema = "public", name = "user")
public class UserModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    public UserModel() {
    }

    public UserModel(String user, String password, String role) {
        this.username = user;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, user=%s, password=%s, role=%s]",id,username,password,role);
    }

    public long getId() {
        return id;
    }

    public String getUser() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    /*@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    public Set<BlogModel> getBlogModel() {
        return blogModels;
    }

    public void setBooks(Set<BlogModel> blogModels) {
        this.blogModels = blogModels;
    }*/
}
