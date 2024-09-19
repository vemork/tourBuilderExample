// Implementación para paquete completo
class CompleteTourPackageBuilder implements TourPackageBuilder {
  private TourPackage tourPackage;

  public CompleteTourPackageBuilder() {
    this.tourPackage = new TourPackage("Complete");
  }

  @Override
  public void buildDestination(String destination) {
    tourPackage.setDestination(destination);
  }

  @Override
  public void buildAccommodation(String accommodation) {
    tourPackage.setAccommodation(accommodation);
  }

  @Override
  public void buildTransportation(String transportation) {
    tourPackage.setTransportation(transportation);
  }

  @Override
  public void buildActivities(String activities) {
    tourPackage.setActivities(activities);
  }

  @Override
  public TourPackage getTourPackage() {
    return this.tourPackage;
  }
}