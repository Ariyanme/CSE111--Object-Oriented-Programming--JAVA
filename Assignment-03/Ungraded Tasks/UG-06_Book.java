
//Ungraded Task-06

public class Book{
  String title;
  String author="Unknown";
  String genre;
  int pages;
  
  public void createBook(String t){
    title=t;
  }
  
  public void createBook(String t, String a){
    title=t;
    author=a;
  }
  
  public void createBook(String t, String a, String g){
    title=t;
    author=a;
    genre=g;
  }
  
  public void customizeGenre(String g){
    genre=g;
    System.out.println("Updated genre of '"+title+"' to "+genre);
  }
  
  public void customizePages(int a){
    pages=a;
    System.out.println("Updated pages of '"+title+"' to "+pages+" pages.");
  }
  
  public void displayDetails(){
    System.out.println("Title: "+title+", Author: "+author+", Genre: "+genre+", Pages: "+pages);
  }
}




