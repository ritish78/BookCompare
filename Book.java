public class Book implements Comparable<Book>{
    private String title;
    private int age;
    public Book(String title, int age){
        this.title=title;
        this.age=age;
    }
    public String getTitle(){
        return this.title;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){
        return this.title+" (recommended for "+this.age+" years-olds or older)";
    }

    @Override
    public int compareTo(Book book) {
        int compareResult=this.age-book.getAge();
        if (compareResult==0){
            return this.title.compareTo(book.getTitle());
        }else if(this.age>book.getAge()){
            return 1;
        }else{
            return -1;
        }
    }
}
