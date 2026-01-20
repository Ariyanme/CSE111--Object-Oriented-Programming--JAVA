
public class Borrower{
  
  String Lname;
  String Lcode;
  String type="librarian";
  
  String Bname;
  String Bcode;
  //String Btype="borrower";
  
  Book librarian []= new Book[3];    // for Storing Librarian's Books;
  int Lcount;
  
  
  String borrowed_book;            //Borrower can borrow only one Book, String will be used to store the Borrowed Book;
  int Bcount;
  
  
  
  
  public Borrower(String n, String c, String t){
    
    if(t.equals(type)){                                //Gotta check if the constructor was called for librarian or borrower;
      
      Lname=n;
      Lcode=c;
      System.out.println("A new librarian has been created");
    }
    else{
      Bname=n; 
      Bcode=c;
      type="borrower";
      System.out.println("A new borrower has been created");
    }
  }
  
  public void addBook(Book b){
    
    if(Lcount<3){
      librarian[Lcount++]=b;
      System.out.println("Book: "+b.name+", added to librarian: "+Lname);
    }
    else{
      System.out.println("Cannot add more than 3 books to librarian: "+Lname);
    }
  }
  
  public void borrowBook(Book b){
    
    if(Bcount>=1){
      System.out.println(Bname+" has already borrowed a book: "+borrowed_book);
    }
    else if(b.flag){
      System.out.println("Cannot borrow "+b.name+", it is already borrowed by "+b.borrower_name);
    }
    else{
      System.out.println(Bname+" successfully borrowed "+b.name);
      
      b.flag=true;                                             //Updating borrower details in Book class 
      b.borrower_name=Bname; 
      
      Bcount++;
      borrowed_book=b.name;                    //Storing borrowed Book details in this class;
    }
  }
  
  public void printDetails(){
    
    if(this.type.equals("librarian")){                        //Twist: gotta check if the printDetails() called for borrower or Librarian;
      System.out.println("Books managed: "+Lcount);
      
      if(Lcount>0){
        for(int i=0; i<Lcount; i++){
          System.out.println("- "+librarian[i].name+"( "+librarian[i].type+" )");
        }
      }
      
    }
    else{
      System.out.println("Borrowed Book: "+borrowed_book);
    }
  }
}






