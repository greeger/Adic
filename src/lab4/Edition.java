package lab4;

public abstract class Edition {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void print();

    public abstract boolean equals(Edition edition);

    public int CompareTo(Edition edition){
        return this.author.compareTo(edition.author);
    }
}
