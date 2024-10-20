package com.mapbox.mapboxsdk.maps;

import android.graphics.RectF;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import java.util.List;

/* loaded from: Markers.class */
public interface Markers {
    Marker addBy(BaseMarkerOptions baseMarkerOptions, MapboxMap mapboxMap);

    List addBy(List list, MapboxMap mapboxMap);

    List obtainAll();

    List obtainAllIn(RectF rectF);

    void reload();

    void update(Marker marker, MapboxMap mapboxMap);
}
