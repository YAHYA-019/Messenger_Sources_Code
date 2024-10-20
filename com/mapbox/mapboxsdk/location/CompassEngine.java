package com.mapbox.mapboxsdk.location;

/* loaded from: CompassEngine.class */
public interface CompassEngine {
    void addCompassListener(CompassListener compassListener);

    int getLastAccuracySensorStatus();

    float getLastHeading();

    void removeCompassListener(CompassListener compassListener);
}
