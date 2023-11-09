public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        if(numberOfPages < 0){
            this.numberOfPages = 1;
        }
        else{
            this.numberOfPages = numberOfPages;
        }

        if(!title.isEmpty()){
            this.title = "";
        }
        else{
            this.title = title;
        }

        if(!author.isEmpty()){
            this.author = "";
        }
        else{
            this.author = author;
        }
    }
    @Override
    public String toString(){
        return "Book: " + title + " by " + author + ", Pages: " + numberOfPages + ".";
    }

    public void equals(String title, String author, int numberOfPages) {
        System.out.println(title.equals(this.title));
        System.out.println(author.equals(this.author));
        System.out.println(numberOfPages == this.numberOfPages);
    }
}
