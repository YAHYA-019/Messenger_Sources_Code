package com.mapbox.mapboxsdk.style.sources;

import java.util.HashMap;

/* loaded from: GeoJsonOptions.class */
public class GeoJsonOptions extends HashMap {
    public GeoJsonOptions withBuffer(int i) {
        put("buffer", Integer.valueOf(i));
        return this;
    }

    public GeoJsonOptions withCluster(boolean z) {
        put("cluster", Boolean.valueOf(z));
        return this;
    }

    public GeoJsonOptions withClusterMaxZoom(int i) {
        put("clusterMaxZoom", Integer.valueOf(i));
        return this;
    }

    public GeoJsonOptions withClusterRadius(int i) {
        put("clusterRadius", Integer.valueOf(i));
        return this;
    }

    public GeoJsonOptions withLineMetrics(boolean z) {
        put("lineMetrics", Boolean.valueOf(z));
        return this;
    }

    public GeoJsonOptions withMaxZoom(int i) {
        put("maxzoom", Integer.valueOf(i));
        return this;
    }

    public GeoJsonOptions withMinZoom(int i) {
        put("minzoom", Integer.valueOf(i));
        return this;
    }

    public GeoJsonOptions withTolerance(float f) {
        put("tolerance", Float.valueOf(f));
        return this;
    }
}
