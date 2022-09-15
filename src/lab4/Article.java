package lab4;

public class Article extends Edition{
    private String title;
    private String magazine;
    private int number;
    private int year;

    public Article(String title, String author, String magazine, int number, int year) {
        this.title = title;
        setAuthor(author);
        this.magazine = magazine;
        this.number = number;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMagazine() {
        return magazine;
    }

    public void setMagazine(String magazine) {
        this.magazine = magazine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println("\"" + title + "\", " + getAuthor() + ", \"" + magazine + "\", номер " + number + ", " + year + "год");
    }

    @Override
    public boolean equals(Edition edition) {
        if (edition == null || getClass() != edition.getClass()) {
            return false;
        }

        Article article = (Article) edition;

        if (!getTitle().equals(article.getTitle())) {
            return false;
        }
        if (!getAuthor().equals(article.getAuthor())) {
            return false;
        }
        if (!getMagazine().equals(article.getMagazine())) {
            return false;
        }
        if (getNumber() != article.getNumber()) {
            return false;
        }
        if (getYear() != article.getYear()) {
            return false;
        }
        return true;
    }
}