package com.mapbox.mapboxsdk.location;

/* loaded from: LocationComponentNotInitializedException.class */
public final class LocationComponentNotInitializedException extends RuntimeException {
    public LocationComponentNotInitializedException() {
        super("The LocationComponent has to be activated with one of the LocationComponent#activateLocationComponent overloads before any other methods are invoked.");
    }
}
