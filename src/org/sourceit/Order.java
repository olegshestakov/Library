package org.sourceit;

public class Order {

    private String authorName;
    private long readerId;
    private String nameOfBook;
    private OrderType type;

    public Order(String authorName, long readerId, String nameOfBook, OrderType type) {
        this.authorName = authorName;
        this.readerId = readerId;
        this.nameOfBook = nameOfBook;
        this.type = type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long readerId) {
        this.readerId = readerId;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }
}
