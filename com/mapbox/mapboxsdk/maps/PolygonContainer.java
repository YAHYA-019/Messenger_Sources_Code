package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.C00p;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: PolygonContainer.class */
public class PolygonContainer implements Polygons {
    public final C00p annotations;
    public final NativeMap nativeMap;

    public PolygonContainer(NativeMap nativeMap, C00p c00p) {
        this.nativeMap = nativeMap;
        this.annotations = c00p;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polygons
    public Polygon addBy(PolygonOptions polygonOptions, MapboxMap mapboxMap) {
        Polygon polygon = polygonOptions.getPolygon();
        if (!polygon.getPoints().isEmpty()) {
            NativeMap nativeMap = this.nativeMap;
            long addPolygon = nativeMap != null ? nativeMap.addPolygon(polygon) : 0L;
            polygon.setId(addPolygon);
            polygon.setMapboxMap(mapboxMap);
            this.annotations.A0C(addPolygon, polygon);
        }
        return polygon;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polygons
    public List addBy(List list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList A0t = AnonymousClass001.A0t(size);
        if (this.nativeMap != null && size > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Polygon polygon = ((PolygonOptions) it.next()).getPolygon();
                if (!polygon.getPoints().isEmpty()) {
                    A0t.add(polygon);
                }
            }
            long[] addPolygons = this.nativeMap.addPolygons(A0t);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= addPolygons.length) {
                    break;
                }
                Polygon polygon2 = (Polygon) A0t.get(i2);
                polygon2.setMapboxMap(mapboxMap);
                polygon2.setId(addPolygons[i2]);
                this.annotations.A0C(addPolygons[i2], polygon2);
                i = i2 + 1;
            }
        }
        return A0t;
    }

    @Override // com.mapbox.mapboxsdk.maps.Polygons
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
            if (A05 instanceof Polygon) {
                A0s.add(A05);
            }
            i = i2 + 1;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Polygons
    public void update(Polygon polygon) {
        this.nativeMap.updatePolygon(polygon);
        C00p c00p = this.annotations;
        c00p.A09(c00p.A01(polygon.getId()), polygon);
    }
}
