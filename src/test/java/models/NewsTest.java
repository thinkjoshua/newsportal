package models;

import models.News;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {
    @Test
    public void getPostReturnsCorrectPost() {
        News news = setupNews();
        assertEquals("BBI Demolition", news.getPost());
    }

    @Test
    public void setPostSetsCorrectPost() throws Exception {
        News news =setupNews();
        news.setPost("Olympics");
        assertNotEquals("BBI Demolition",news.getPost());
    }

    public News setupNews(){
        return new News("BBI Demolition");
    }
}