
//Ungraded Task-07

public class Movie{
  
  String title;
  String director;
  double rating;
  String actors[]=new String [3];
  int count;
  public void addActors(String s){
    actors[count]=s;
    count++;
    System.out.println("Added actor '"+s+"' to '"+title+"'.");
  }
  
  public void addActors(String s1, String s2){
    addActors(s1);
    addActors(s2);
  }
  
  public void addActors(String s1, String s2, String s3){
    addActors(s1);
    addActors(s2);
    addActors(s3);
  }
  
  public void setMovieDetails(String t, String d, double r){
    title=t;
    director=d;
    rating=r;
  }
  
  public void setMovieDetails(String t, String d){
    title=t;
    director=d;
  }
  
  public void updateRating(double r){
    rating =r;
    System.out.println("Updated rating of '"+title+"' to "+rating);
  }
  
  public void showInfo(){
    System.out.println("Title: "+title+"\nDirector: "+director+"\nRating: "+rating);
    System.out.print("Actors: ");
    for(int i=0; i<count; i++){
      if(actors[i]!=null && i==count-1){
        System.out.print(actors[i]);
      }
      else{
        System.out.print(actors[i]+", ");
      }
    }
    System.out.println();
  }
}



