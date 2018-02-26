package model.itemspkg.bookpkg;

public class Publisher {
    private String idPublisher;
    private String publisherName;

    public Publisher() {
    }

    public Publisher(String idPublisher, String publisherName) {
        this.idPublisher = idPublisher;
        this.publisherName = publisherName;
    }

    public String getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(String idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}
