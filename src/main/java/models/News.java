package models;

import java.util.Objects;

public class News {
    int id;
    String post;

    public News (String post){
        this.post=post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;
        News news = (News) o;
        return Objects.equals(post, news.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
