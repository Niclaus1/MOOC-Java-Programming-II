public class Book {

    private String bookName;
    private int ageRecommendation;
    
    public Book(String bookName, int ageRecommendation) {
        this.bookName = bookName;
        this.ageRecommendation = ageRecommendation;
    }

    public String getBookName() {
        return bookName;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return getBookName() + " (recommended for " + getAgeRecommendation() + " years-old or older)";
    }

    
}
