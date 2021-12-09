package library;

public class Book {
    private String author;
    private String title;
    private int pages;
    private String giver;
    private String pressMark;
    private boolean needsRepair;


    public Book(String author,
                String title,
                int pages,
                String giver,
                String pressark) {
        this.author = author;
        this.giver = giver;
        this.title = title;
        this.pages = pages;
        this.pressMark = pressark;
        generatePressMark();

    }

    public String generatePressMark() {
        return this.author + this.giver + this.title + this.pages + this.pressMark;
    }

    public void setAuthor(String author) {
        this.author = author;
        generatePressMark();
    }

    public void setGiver(String giver) {
        this.giver = giver;
        generatePressMark();
    }

    public void setPages(int pages) {
        this.pages = pages;
        generatePressMark();
    }

    public void setPressMark(String pressMark) {
        this.pressMark = pressMark;
        generatePressMark();
    }

    public void setTitle(String title) {
        this.title = title;
        generatePressMark();
    }

    public void setNeedsRepair(boolean needsREpair) {
        this.needsRepair = needsREpair;
        generatePressMark();
    }

    public boolean isNeedsRepair() {
        return needsRepair;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGiver() {
        return giver;
    }

    public String getPressark() {
        return pressMark;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", giver='" + giver + '\'' +
                ", pressark='" + pressMark + '\'' +
                ", needsRepair='" + needsRepair +
                '}';
    }
}
