public class Book {
    public String title;
    public String author;
    public int numberOfPages;
    Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String toString(){
        return ("Book:" + title + ", by author: " + author + ", Pages:" + numberOfPages);
    }
    @Override
    public boolean equals(Object other){
        if(other instanceof Book new_other){
            return(this.author.equals(((Book) other).author))&&(this.title.equals(new_other))&&(this.numberOfPages == new_other.numberOfPages);
        }
        else{
            return false;
        }

    }
}
