public class eBook extends Book{
    private String format;

    eBook(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }

}
