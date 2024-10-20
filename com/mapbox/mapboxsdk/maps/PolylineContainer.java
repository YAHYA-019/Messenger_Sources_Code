package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.C00p;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: PolylineContainer.class */
public class PolylineContainer implements Polylines {
    public final C00p annotations;
    public final NativeMap nativeMap;

    public PolylineContainer(NativeMap nativeMap, C00p c00p) {
        this.nativeMap = nativeMap;
        this.annotations = c00p;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polylines
    public Polyline addBy(PolylineOptions polylineOptions, MapboxMap mapboxMap) {
        Polyline polyline = polylineOptions.getPolyline();
        if (!polyline.getPoints().isEmpty()) {
            NativeMap nativeMap = this.nativeMap;
            long addPolyline = nativeMap != null ? nativeMap.addPolyline(polyline) : 0L;
            polyline.setMapboxMap(mapboxMap);
            polyline.setId(addPolyline);
            this.annotations.A0C(addPolyline, polyline);
        }
        return polyline;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polylines
    public List addBy(List list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        if (this.nativeMap != null && size > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Polyline polyline = ((PolylineOptions) it.next()).getPolyline();
                if (!polyline.getPoints().isEmpty()) {
                    A0t.add(polyline);
                }
            }
            long[] addPolylines = this.nativeMap.addPolylines(A0t);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= addPolylines.length) {
                    break;
                }
                Polyline polyline2 = (Polyline) A0t.get(i2);
                polyline2.setMapboxMap(mapboxMap);
                polyline2.setId(addPolylines[i2]);
                this.annotations.A0C(addPolylines[i2], polyline2);
                i = i2 + 1;
            }
        }
        return A0t;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polylines
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
            if (A05 instanceof Polyline) {
                A0s.add(A05);
            }
            i = i2 + 1;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Polylines
    public void update(Polyline polyline) {
        this.nativeMap.updatePolyline(polyline);
        C00p c00p = this.annotations;
        c00p.A09(c00p.A01(polyline.getId()), polyline);
    }
}
