package juancolmenero.earthme;

public class Earthquake {

    /** Default  magnitude of earthquake */
    private double qDefaultMagnitude;

    /** Earthquake location */
    private String qDefaultLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** URL for earthquake **/
    private String qDefaultURL;

    public Earthquake(){

    }

    public Earthquake(double defaultMagnitude, String defaultLocation) {
        qDefaultMagnitude = defaultMagnitude;
        qDefaultLocation = defaultLocation;
    }

    public Earthquake(double defaultMagnitude, String defaultLocation, long timeInMilliseconds, String URL) {
        qDefaultMagnitude = defaultMagnitude;
        qDefaultLocation = defaultLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        qDefaultURL = URL;
    }

    public double getDefaultMagnitude() {
        return qDefaultMagnitude;
    }

    public String getDefaultLocation() {
        return qDefaultLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getDefaultURL(){
        return qDefaultURL;
    }




}
