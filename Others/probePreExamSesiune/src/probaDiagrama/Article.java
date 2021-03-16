package probaDiagrama;

public class Article {

    private String thematik;
    private Author author;

    public Article(String thematik) {
        this.thematik = thematik;
    }

    public String getThematik() {
        return thematik;
    }

    public void setThematik(String thematik) {
        this.thematik = thematik;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



}
