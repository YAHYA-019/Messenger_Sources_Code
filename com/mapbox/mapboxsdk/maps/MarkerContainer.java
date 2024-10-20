package com.mapbox.mapboxsdk.maps;

import X.1BK;
import X.4YU;
import X.AnonymousClass001;
import X.C00p;
import android.graphics.RectF;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MarkerContainer.class */
public class MarkerContainer implements Markers {
    public final C00p annotations;
    public final IconManager iconManager;
    public final NativeMap nativeMapView;

    public MarkerContainer(NativeMap nativeMap, C00p c00p, IconManager iconManager) {
        this.nativeMapView = nativeMap;
        this.annotations = c00p;
        this.iconManager = iconManager;
    }

    private void ensureIconLoaded(Marker marker, MapboxMap mapboxMap) {
        this.iconManager.ensureIconLoaded(marker, mapboxMap);
    }

    private List obtainAnnotations() {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            int i2 = i;
            C00p c00p = this.annotations;
            if (i2 >= c00p.A00()) {
                return A0s;
            }
            A0s.add(c00p.A05(c00p.A02(i2)));
            i = i2 + 1;
        }
    }

    private Marker prepareMarker(BaseMarkerOptions baseMarkerOptions) {
        Marker marker = baseMarkerOptions.getMarker();
        marker.setTopOffsetPixels(this.iconManager.getTopOffsetPixelsForIcon(this.iconManager.loadIconForMarker(marker)));
        return marker;
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public Marker addBy(BaseMarkerOptions baseMarkerOptions, MapboxMap mapboxMap) {
        Marker prepareMarker = prepareMarker(baseMarkerOptions);
        NativeMap nativeMap = this.nativeMapView;
        long addMarker = nativeMap != null ? nativeMap.addMarker(prepareMarker) : 0L;
        prepareMarker.setMapboxMap(mapboxMap);
        prepareMarker.setId(addMarker);
        this.annotations.A0C(addMarker, prepareMarker);
        return prepareMarker;
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public List addBy(List list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        if (this.nativeMapView != null && size > 0) {
            int i = 0;
            do {
                A0t.add(prepareMarker((BaseMarkerOptions) list.get(i)));
                i++;
            } while (i < size);
            if (A0t.size() > 0) {
                long[] addMarkers = this.nativeMapView.addMarkers(A0t);
                for (int i2 = 0; i2 < addMarkers.length; i2++) {
                    Marker marker = (Marker) A0t.get(i2);
                    marker.setMapboxMap(mapboxMap);
                    marker.setId(addMarkers[i2]);
                    this.annotations.A0C(addMarkers[i2], marker);
                }
            }
        }
        return A0t;
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public List obtainAll() {
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            int i2 = i;
            C00p c00p = this.annotations;
            if (i2 >= c00p.A00()) {
                return A0s;
            }
            Object A05 = c00p.A05(c00p.A02(i2));
            if (A05 instanceof Marker) {
                A0s.add(A05);
            }
            i = i2 + 1;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public List obtainAllIn(RectF rectF) {
        long[] queryPointAnnotations = this.nativeMapView.queryPointAnnotations(this.nativeMapView.getDensityDependantRectangle(rectF));
        int length = queryPointAnnotations.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        for (long j : queryPointAnnotations) {
            4YU.A1W(A0t, j);
        }
        ArrayList A0t2 = AnonymousClass001.A0t(length);
        List obtainAnnotations = obtainAnnotations();
        int size = obtainAnnotations.size();
        for (int i = 0; i < size; i++) {
            Annotation annotation = (Annotation) obtainAnnotations.get(i);
            if ((annotation instanceof Marker) && A0t.contains(Long.valueOf(annotation.getId()))) {
                A0t2.add(annotation);
            }
        }
        return 1BK.A17(A0t2);
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public void reload() {
        this.iconManager.reloadIcons();
        int A00 = this.annotations.A00();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                return;
            }
            Annotation annotation = (Annotation) this.annotations.A05(i2);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                this.nativeMapView.removeAnnotation(annotation.getId());
                marker.setId(this.nativeMapView.addMarker(marker));
            }
            i = i2 + 1;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Markers
    public void update(Marker marker, MapboxMap mapboxMap) {
        ensureIconLoaded(marker, mapboxMap);
        this.nativeMapView.updateMarker(marker);
        C00p c00p = this.annotations;
        c00p.A09(c00p.A01(marker.getId()), marker);
    }
}
