package com.mapbox.mapboxsdk.style.sources;

import com.mapbox.geojson.FeatureCollection;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;

/* loaded from: GeometryTileProvider.class */
public interface GeometryTileProvider {
    FeatureCollection getFeaturesForBounds(LatLngBounds latLngBounds, int i);
}
