public class Toyota extends Kendaraan{
  public void setStart() {
    MesinToyota mesin = new MesinToyota();//komposisi 
    mesin.start();
  }
}