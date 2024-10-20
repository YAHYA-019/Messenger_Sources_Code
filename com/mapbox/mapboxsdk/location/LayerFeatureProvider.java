package com.mapbox.mapboxsdk.location;

import X.7zN;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Point;

/* loaded from: LayerFeatureProvider.class */
public class LayerFeatureProvider {
    public Feature generateLocationFeature(Feature feature, LocationComponentOptions locationComponentOptions) {
        if (feature == null) {
            feature = Feature.fromGeometry(Point.fromLngLat(0.0d, 0.0d));
            Float A0f = 7zN.A0f();
            feature.addNumberProperty(LocationComponentConstants.PROPERTY_GPS_BEARING, A0f);
            feature.addNumberProperty(LocationComponentConstants.PROPERTY_COMPASS_BEARING, A0f);
            feature.addBooleanProperty(LocationComponentConstants.PROPERTY_LOCATION_STALE, Boolean.valueOf(locationComponentOptions.enableStaleState));
        }
        return feature;
    }
}
