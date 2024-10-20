package com.mapbox.mapboxsdk.location;

import android.animation.TypeEvaluator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.MapboxAnimator;

/* loaded from: MapboxLatLngAnimator.class */
public class MapboxLatLngAnimator extends MapboxAnimator {
    public MapboxLatLngAnimator(LatLng latLng, LatLng latLng2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, int i) {
        super(latLng, latLng2, animationsValueChangeListener, i);
    }

    @Override // com.mapbox.mapboxsdk.location.MapboxAnimator
    public TypeEvaluator provideEvaluator() {
        return new LatLngEvaluator();
    }
}
