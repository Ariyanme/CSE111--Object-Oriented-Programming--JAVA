public class Multiclass_Ride_Share_Tester { 
  public static void main(String[] args) { 
    User user1 = new User("Brooks", "Banani", "Shared"); 
    User user2 = new User("Jocelyn", "Uttara"); 
    User user3 = new User("Robert", "Gulshan", "Shared"); 
    User user4 = new User("Langdon", "Mohakhali", "Shared"); 
    user1.status(); 
    user2.status(); 
    user3.status(); 
    user4.status(); 
    System.out.println("----------------------------------"); 
    Uber car1 = new Uber("0K32BH", "Shared", "Mohakhali", "Banani", "Nikunja", "Uttara"); 
    car1.details(); 
    System.out.println("----------------------------------");
    car1.pick(user1, user2, user3, user4); 
    System.out.println("----------------------------------"); 
    user1.status(); 
    user2.status(); 
    user3.status(); 
    user4.status(); 
    System.out.println("----------------------------------"); 
    Uber car2 = new Uber("5GD2BD", "Single", "Uttara"); 
    Uber car3 = new Uber("4T12FR", "Shared", "Gulshan", "Bashundhara"); 
    car2.details(); 
    car3.details(); 
    System.out.println("----------------------------------"); 
    car2.pick(user2, user3);
    System.out.println("----------------------------------"); 
    car3.pick(user3); 
    System.out.println("----------------------------------"); 
    user2.status(); 
    user3.status(); 
  } 
}
