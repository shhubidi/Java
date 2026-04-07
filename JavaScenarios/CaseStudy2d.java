abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println(itemId + " - " + title);
    }

    public abstract void processLoan();
}

class TextBook extends LibraryItem {

    public TextBook(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void processLoan() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}

class ResearchPaper extends LibraryItem {

    public ResearchPaper(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void processLoan() {
        System.out.println("Generating secure PDF download link...");
    }
}

public class CaseStudy2d {
    public static void main(String[] args) {

        LibraryItem item1 = new TextBook("B101", "Java Core");
        item1.processLoan();


        item1.processLoan();

        LibraryItem item2 = new ResearchPaper("R99", "AI Ethics");
        item2.processLoan();
    }
}