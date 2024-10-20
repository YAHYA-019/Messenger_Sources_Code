package com.mapbox.mapboxsdk.location;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.MapboxAnimator;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* loaded from: MapboxAnimatorProvider.class */
public final class MapboxAnimatorProvider {
    public static MapboxAnimatorProvider INSTANCE;

    /* JADX WARN: Type inference failed for: r301v2, types: [java.lang.Object, com.mapbox.mapboxsdk.location.MapboxAnimatorProvider] */
    public static MapboxAnimatorProvider getInstance() {
        MapboxAnimatorProvider mapboxAnimatorProvider = INSTANCE;
        MapboxAnimatorProvider mapboxAnimatorProvider2 = mapboxAnimatorProvider;
        if (mapboxAnimatorProvider == null) {
            ?? obj = new Object();
            INSTANCE = obj;
            mapboxAnimatorProvider2 = obj;
        }
        return mapboxAnimatorProvider2;
    }

    public MapboxCameraAnimatorAdapter cameraAnimator(Float f, Float f2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, MapboxMap.CancelableCallback cancelableCallback) {
        return new MapboxCameraAnimatorAdapter(f, f2, animationsValueChangeListener, cancelableCallback);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.mapboxsdk.location.MapboxFloatAnimator, com.mapbox.mapboxsdk.location.MapboxAnimator] */
    public MapboxFloatAnimator floatAnimator(Float f, Float f2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, int i) {
        return new MapboxAnimator(f, f2, animationsValueChangeListener, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.mapboxsdk.location.MapboxAnimator, com.mapbox.mapboxsdk.location.MapboxLatLngAnimator] */
    public MapboxLatLngAnimator latLngAnimator(LatLng latLng, LatLng latLng2, MapboxAnimator.AnimationsValueChangeListener animationsValueChangeListener, int i) {
        return new MapboxAnimator(latLng, latLng2, animationsValueChangeListener, i);
    }
}
