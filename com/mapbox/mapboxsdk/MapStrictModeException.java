package com.mapbox.mapboxsdk;

/* loaded from: MapStrictModeException.class */
public class MapStrictModeException extends RuntimeException {
    public MapStrictModeException(String str) {
        super(String.format("Map detected an error that would fail silently otherwise: %s", str));
    }
}
