package com.mapbox.mapboxsdk.exceptions;

/* loaded from: TooManyIconsException.class */
public class TooManyIconsException extends RuntimeException {
    public TooManyIconsException() {
        super("Cannot create an Icon because there are already too many. Try reusing Icon objects whenever possible.");
    }
}
