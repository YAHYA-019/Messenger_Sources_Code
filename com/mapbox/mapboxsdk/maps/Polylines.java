package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import java.util.List;

/* loaded from: Polylines.class */
public interface Polylines {
    Polyline addBy(PolylineOptions polylineOptions, MapboxMap mapboxMap);

    List addBy(List list, MapboxMap mapboxMap);

    List obtainAll();

    void update(Polyline polyline);
}
