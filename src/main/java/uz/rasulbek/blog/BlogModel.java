package uz.rasulbek.blog;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(schema = "public", name = "blog")
public class BlogModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "user_id")
    private int userId;
    @Column(name = "title")
    private String title;
    @Column(name = "blog_text")
    private String blogText;
    @Column(name = "created")
    private String created;
    @Column(name = "viewed")
    private int viewed;

    public BlogModel() {
    }

    public BlogModel(int userId, String title, String blogText, String created, int viewed) {
        this.userId = userId;
        this.title = title;
        this.blogText = blogText;
        this.created = created;
        this.viewed = viewed;
    }

    public BlogModel(int userId, String title, String blogText) {
        this.userId = userId;
        this.title = title;
        this.blogText = blogText;
    }

    public long getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBlogText() {
        return blogText;
    }

    public String getCreated() {
        return created;
    }

    public int getViewed() {
        return viewed;
    }
}
