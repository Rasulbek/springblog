package uz.rasulbek.blog;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

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
    private Timestamp created;
    @Column(name = "viewed")
    private int viewed;

    public BlogModel() {
    }

    public BlogModel(int userId, String title, String blogText, Timestamp created, int viewed) {
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
        return created.toString();
    }

    public int getViewed() {
        return viewed;
    }

    public String[] getFormattedDate(){
        String str[]={"13","Fev","1994"};
        String mnth[]={"Yan","Fev","Mar","Apr","May","Iyn","Iyl","Avg","Sen","Okt","Noy","Dek"};
        str[0] = created.getDate()+"";
        str[1] = mnth[created.getMonth()];
        str[2] = (1900+created.getYear())+"";
        return str;
    }

    public String getDescription(){
        String descr = blogText.replaceAll("\\<[^>]*>","");
        descr = descr.substring(0, Math.min(100,descr.length()));
        return descr;
    }
}
