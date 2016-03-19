package org.sourceit;

public class Reader {

    private static long counter;

    private String lastName;
    private String firstName;
    private Long readerId;

    public Reader() {
        this.lastName = "Shestakov";
        this.firstName = "Oleg";
        this.readerId = counter++;
    }

    public Reader(String lastName, String firstName, Long readerId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.readerId = readerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getReaderId() {
        return readerId;
    }

    public void setReaderId(Long readerId) {
        this.readerId = readerId;
    }

    public Order createOrder(String author, String bookName, OrderType type) {
        Order order = new Order(author, this.readerId, bookName, type);
        return order;
    }
}
