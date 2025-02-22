package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 464);
        Book book2 = new Book("Град обреченный", 448);
        Book book3 = new Book("Core Java", 928);
        Book book4 = new Book("Game Of Thrones", 694);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Меняем месстами 1 и 4 книгу:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Ищем книгу с именем \"Clean Code\":");
        for (Book book : books) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getNumberOfPages());
            }
        }
    }
}
