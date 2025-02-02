public class Kunde {
  
  String kundenName = "Unbekannt";
  int kundenNr = 0; 
  
  public final int mvMinNr = 10000;
  public final int mvMaxNr = 99999;
  
  public Kunde() {  
  }
  
  public Kunde(String kundenName, int kundenNr) {
    setKundenName(kundenName);
    setKundenNr(kundenNr);
  }
  
  public int getKundenNr() {
    return kundenNr;  
  }
  
  public void setKundenNr(int kundenNr) {
    
    if (kundenNr >= mvMinNr && kundenNr <= mvMaxNr) {
      this.kundenNr = kundenNr;  
    }
  }
  
  public String getKundenName() {
    return kundenName;  
  }
  
  public void setKundenName(String kundenName) {
    this.kundenName = kundenName;
  }
  
  @Override
  public String toString() {
    return kundenNr + " " + kundenName;
  }
  
  @Override
  public boolean equals(Object obj) {
    if ((int)obj == getKundenNr()) {
      return true;
    } else {
      return false;
    }
  }
  
}

