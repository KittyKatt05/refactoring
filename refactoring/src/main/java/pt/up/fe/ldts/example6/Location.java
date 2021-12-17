package pt.up.fe.ldts.example6;

public class Location {

    protected String locationLatitude;
    protected String locationLongitude;
    protected String locationName;

    public Location(String locationLatitude, String locationLongitude, String locationName){
        this.locationLatitude = locationLatitude;
        this.locationLongitude = locationLongitude;
        this.locationName = locationName;
    }

    public String getLocationLatitude(){
        return locationLatitude;
    }

    public String getLocationLongitude(){
        return locationLongitude;
    }

    public String getLocationName(){
        return locationName;
    }

    public void setLocationLatitude(String locationLatitude){
        this.locationLatitude = locationLatitude;
    }

    public void setLocationLongitude(String locationLongitude){
        this.locationLongitude = locationLongitude;
    }

    public void setLocationName(String locationName){
        this.locationName = locationName;
    }

    public String toString() {
        return this.locationLatitude + "," + this.locationLongitude + " (" + this.locationName + ")";
    }



}
