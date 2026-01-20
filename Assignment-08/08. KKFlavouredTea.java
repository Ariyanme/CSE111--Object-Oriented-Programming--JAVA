
public class KKFlavouredTea extends KKTea{
  
  public KKFlavouredTea(String name, int p, int b){
    
    super(name, p, b);
  }
  
  public static void updateSoldStatusFlavoured (KKFlavouredTea tea){
    
    total++;
    flavourCount++;
    tea.status=true;               //Status--> Instance var.
  }
  
}
