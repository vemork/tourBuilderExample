class BasicTourPackageBuilder implements TourPackageBuilder {
  private final TourPackage tourPackage;

  public BasicTourPackageBuilder() {
    this.tourPackage = new TourPackage("Basic");
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
