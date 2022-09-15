package lab4;

public class OnlineResource extends Edition{
    private String title;
    private String link;
    private String annotation;

    public OnlineResource(String title, String author, String link, String annotation) {
        this.title = title;
        setAuthor(author);
        this.link = link;
        this.annotation = annotation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public void print() {
        System.out.println("\"" + title + "\", " + getAuthor() + ", ссылка: " + getLink() + ". " + getAnnotation());
    }

    @Override
    public boolean equals(Edition edition) {
        if (edition == null || getClass() != edition.getClass()) {
            return false;
        }

        OnlineResource onlineResource = (OnlineResource) edition;

        if (!getTitle().equals(onlineResource.getTitle())) {
            return false;
        }
        if (!getAuthor().equals(onlineResource.getAuthor())) {
            return false;
        }
        if (!getLink().equals(onlineResource.getLink())) {
            return false;
        }
        if (!getAnnotation().equals(onlineResource.getAnnotation())) {
            return false;
        }
        return true;
    }
}