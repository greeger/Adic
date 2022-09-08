public class Book extends Edition{
    private String title;
    private int year;
    private String publishing;

    public Book(String title, String author, int year, String publishing) {
        this.title = title;
        setAuthor(author);
        this.year = year;
        this.publishing = publishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    @Override
    public void print() {
        System.out.println("\"" + title + "\", " + getAuthor() + ", " + year + " год, "+ publishing);
    }

    @Override
    public boolean equals(Edition edition) {
        if (edition == null || getClass() != edition.getClass()) {
            return false;
        }

        Book book = (Book) edition;

        if (!getTitle().equals(book.getTitle())) {
            return false;
        }
        if (!getAuthor().equals(book.getAuthor())) {
            return false;
        }
        if (getYear() != book.getYear()) {
            return false;
        }
        if (!getPublishing().equals(book.getPublishing())) {
            return false;
        }
        return true;
    }
}