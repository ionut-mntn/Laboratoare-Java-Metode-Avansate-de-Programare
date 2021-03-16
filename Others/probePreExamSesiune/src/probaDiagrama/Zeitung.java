package probaDiagrama;

import java.util.List;

public class Zeitung {

    private int Id;
    private float price;
    private String date;
    private List<Article> articleList;
    private List<Person> subscribers;

    public Zeitung(int id, float price, String date, List<Article> articleList) {
        Id = id;
        this.price = price;
        this.date = date;
        this.articleList = articleList;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public void subscribe(Person p){
        subscribers.add(p);
    }

}
