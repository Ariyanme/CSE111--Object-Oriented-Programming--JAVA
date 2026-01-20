
                                               //Task-06 

public class Book extends Product{
  
  String isbn;
  String publisher;
  
  public Book(int id, String title, int price, String isbn, String publi){
    
    super(id, title, price);
    this.isbn=isbn;
    publisher=publi;
  }
  
  public String printDetail(){
    
    return super.getIdTitlePrice() + "\nISBN: "+isbn+" Publisher: "+publisher;
  }
  
}

