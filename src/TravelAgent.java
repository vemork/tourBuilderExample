class TravelAgent {
  private TourPackageBuilder builder;

  public void setTourPackageBuilder(TourPackageBuilder builder) {
    this.builder = builder;
  }

  public TourPackage createTourPackage(String destination, String accommodation, String transportation, String activities) {
    builder.buildDestination(destination);
    builder.buildAccommodation(accommodation);
    builder.buildTransportation(transportation);
    builder.buildActivities(activities);
    return builder.getTourPackage();
  }
}