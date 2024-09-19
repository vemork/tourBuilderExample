class TourPackage {
  private String type;
  private String destination;
  private String accommodation;
  private String transportation;
  private String activities;

  public TourPackage(String type) {
    this.type = type;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public void setAccommodation(String accommodation) {
    this.accommodation = accommodation;
  }

  public void setTransportation(String transportation) {
    this.transportation = transportation;
  }

  public void setActivities(String activities) {
    this.activities = activities;
  }

  @Override
  public String toString() {
    return "TourPackage{" +
        "type='" + type + '\'' +
        ", destination='" + destination + '\'' +
        ", accommodation='" + accommodation + '\'' +
        ", transportation='" + transportation + '\'' +
        ", activities='" + activities + '\'' +
        '}';
  }
}