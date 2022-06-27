import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    samochody Samochod1 = new  samochody("Suzuki Baleno");
    samochody Samochod2 = new  samochody("Opel Astra");
    samochody Samochod3 = new  samochody("Volvo S50");
    samochody Samochod4 = new  samochody("Audi A3");

    
    ArrayList lista = new ArrayList();
    lista.add(Samochod1);
    lista.add(Samochod2);
    lista.add(Samochod3);
    lista.add(Samochod4);

    System.out.println("Liczba samochodów do sprzedania: " + lista.size());
    
      for(Object k : lista){
         System.out.println((( samochody)k).nazwa);
      }
  System.out.println("Sprzedany samochód to: Opel Astra");
  
  
     System.out.println("Czy samochód Opel Astra został sprzedany ? : " + lista.contains(Samochod1));
    lista.remove(Samochod2);
    
    System.out.println("Spis samochodów po sprzedaniu Opla Astry: ");
      for(Object k : lista){
         System.out.println((( samochody)k).nazwa);
      }
  }
}