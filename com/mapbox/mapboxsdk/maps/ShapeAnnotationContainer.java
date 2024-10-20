package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.C00p;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: ShapeAnnotationContainer.class */
public class ShapeAnnotationContainer implements ShapeAnnotations {
    public final C00p annotations;
    public final NativeMap nativeMapView;

    public ShapeAnnotationContainer(NativeMap nativeMap, C00p c00p) {
        this.nativeMapView = nativeMap;
        this.annotations = c00p;
    }

    private List getAnnotationsFromIds(long[] jArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            Object A05 = this.annotations.A05(jArr[i2]);
            if (A05 != null) {
                A0s.add(A05);
            }
            i = i2 + 1;
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.ShapeAnnotations
    public List obtainAllIn(RectF rectF) {
        return getAnnotationsFromIds(this.nativeMapView.queryShapeAnnotations(this.nativeMapView.getDensityDependantRectangle(rectF)));
    }
}
