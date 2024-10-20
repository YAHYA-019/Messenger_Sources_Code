package com.mapbox.mapboxsdk.location;

import android.animation.TypeEvaluator;
import com.mapbox.mapboxsdk.geometry.LatLng;

/* loaded from: LatLngEvaluator.class */
public class LatLngEvaluator implements TypeEvaluator {
    public final LatLng latLng = new LatLng();

    @Override // android.animation.TypeEvaluator
    public LatLng evaluate(float f, LatLng latLng, LatLng latLng2) {
        LatLng latLng3 = this.latLng;
        double d = latLng.latitude;
        double d2 = latLng2.latitude - d;
        double d3 = f;
        latLng3.setLatitude(d + (d2 * d3));
        double d4 = latLng.longitude;
        latLng3.setLongitude(d4 + ((latLng2.longitude - d4) * d3));
        return latLng3;
    }
}
