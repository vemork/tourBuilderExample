interface TourPackageBuilder {
  void buildDestination(String destination);
  void buildAccommodation(String accommodation);
  void buildTransportation(String transportation);
  void buildActivities(String activities);
  TourPackage getTourPackage();
}