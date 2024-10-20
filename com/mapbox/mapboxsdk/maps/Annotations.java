package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.annotations.Annotation;
import java.util.List;

/* loaded from: Annotations.class */
public interface Annotations {
    List obtainAll();

    Annotation obtainBy(long j);

    void removeAll();

    void removeBy(long j);

    void removeBy(Annotation annotation);

    void removeBy(List list);
}
