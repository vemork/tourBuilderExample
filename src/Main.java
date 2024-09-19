public class Main {

  public static void main(String[] args) {

    TravelAgent agent = new TravelAgent();

    TourPackageBuilder basicBuilder = new BasicTourPackageBuilder();
    agent.setTourPackageBuilder(basicBuilder);
    TourPackage basicPackage = agent.createTourPackage("Cancún", "Hotel 3 estrellas", "Vuelo directo", "Snorkel y playa");
    System.out.println(basicPackage);

    TourPackageBuilder completeBuilder = new CompleteTourPackageBuilder();
    agent.setTourPackageBuilder(completeBuilder);
    TourPackage completePackage = agent.createTourPackage("Barcelona", "Hotel 4 estrellas", "Vuelo + transporte", "Visitas guiadas");
    System.out.println(completePackage);

    TourPackageBuilder deluxeBuilder = new DeluxeTourPackageBuilder();
    agent.setTourPackageBuilder(deluxeBuilder);
    TourPackage deluxePackage = agent.createTourPackage("París", "Hotel 5 estrellas", "Vuelo + limusina", "Cena gourmet");
    System.out.println(deluxePackage);
  }
}