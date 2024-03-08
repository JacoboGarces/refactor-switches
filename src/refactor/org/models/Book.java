package refactor.org.models;

public class Book {
    private String title;
    private String author;
    private String knowledgeArea;
    private int numberPages;
    private int bookStock;
    private int borrowedCount;
    private int availableStock;

    public Book() {
    }

    public Book(String title, String author, String knowledgeArea, int numberPages, int bookStock, int borrowedCount, int availableStock){
        this.title = title;
        this.author = author;
        this.knowledgeArea = knowledgeArea;
        this.numberPages = numberPages;
        this.bookStock = bookStock;
        this.borrowedCount = borrowedCount;
        this.availableStock = availableStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getKnowledgeArea() {
        return knowledgeArea;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getBookStock() {
        return bookStock;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setKnowledgeArea(String knowledgeArea) {
        this.knowledgeArea = knowledgeArea;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }

    public void setBorrowedCount(int borrowedCount) {
        this.borrowedCount = borrowedCount;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}