package refactor.org.models;

public class Novel {
    private String title;
    private String author;
    private String gender;
    private int targetAge;
    private int novelStock;
    private int novelBorrowedCount;
    private int novelAvailableStock;

    public Novel() {
    }

    public Novel(String title, String author, String gender, int targetAge, int novelStock,
                 int novelBorrowedCount, int novelAvailableStock){

        this.title = title;
        this.author = author;
        this.gender = gender;
        this.targetAge = targetAge;
        this.novelStock = novelStock;
        this.novelBorrowedCount = novelBorrowedCount;
        this.novelAvailableStock = novelAvailableStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public int getTargetAge() {
        return targetAge;
    }

    public int getNovelStock() {
        return novelStock;
    }

    public int getNovelBorrowedCount() {
        return novelBorrowedCount;
    }

    public int getNovelAvailableStock() {
        return novelAvailableStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTargetAge(int targetAge) {
        this.targetAge = targetAge;
    }

    public void setNovelStock(int novelStock) {
        this.novelStock = novelStock;
    }

    public void setNovelBorrowedCount(int novelBorrowedCount) {
        this.novelBorrowedCount = novelBorrowedCount;
    }

    public void setNovelAvailableStock(int novelAvailableStock) {
        this.novelAvailableStock = novelAvailableStock;
    }
}