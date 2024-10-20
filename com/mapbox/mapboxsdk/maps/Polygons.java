package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import java.util.List;

/* loaded from: Polygons.class */
public interface Polygons {
    Polygon addBy(PolygonOptions polygonOptions, MapboxMap mapboxMap);

    List addBy(List list, MapboxMap mapboxMap);

    List obtainAll();

    void update(Polygon polygon);
}
