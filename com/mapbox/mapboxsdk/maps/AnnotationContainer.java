package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import X.C00p;
import com.mapbox.mapboxsdk.annotations.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: AnnotationContainer.class */
public class AnnotationContainer implements Annotations {
    public final C00p annotations;
    public final NativeMap nativeMap;

    public AnnotationContainer(NativeMap nativeMap, C00p c00p) {
        this.nativeMap = nativeMap;
        this.annotations = c00p;
    }

    private void removeNativeAnnotations(long[] jArr) {
        NativeMap nativeMap = this.nativeMap;
        if (nativeMap != null) {
            nativeMap.removeAnnotations(jArr);
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public List obtainAll() {
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

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public Annotation obtainBy(long j) {
        return (Annotation) this.annotations.A05(j);
    }

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public void removeAll() {
        int A00 = this.annotations.A00();
        long[] jArr = new long[A00];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A00) {
                removeNativeAnnotations(jArr);
                this.annotations.A07();
                return;
            } else {
                jArr[i2] = this.annotations.A02(i2);
                i = i2 + 1;
            }
        }
    }

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public void removeBy(long j) {
        NativeMap nativeMap = this.nativeMap;
        if (nativeMap != null) {
            nativeMap.removeAnnotation(j);
        }
        this.annotations.A0A(j);
    }

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public void removeBy(Annotation annotation) {
        removeBy(annotation.getId());
    }

    @Override // com.mapbox.mapboxsdk.maps.Annotations
    public void removeBy(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            jArr[i2] = ((Annotation) list.get(i2)).getId();
            i = i2 + 1;
        }
        removeNativeAnnotations(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            this.annotations.A0A(jArr[i3]);
        }
    }
}
