
                                           //Task-01

public class Song {
  
  public String title;
  public String artist;
  public int length;
  public Song next;
  
  public Song(String t, String a, int l){
    title=t;
    artist=a;
    length=l;
  }
  
  public void songInfo(){
    System.out.println("Title: "+title+", Artist: "+artist+"\nLength: "+length+" minutes");
  }
}
