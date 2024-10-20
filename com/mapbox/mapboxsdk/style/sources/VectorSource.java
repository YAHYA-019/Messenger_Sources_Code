package com.mapbox.mapboxsdk.style.sources;

import X.AnonymousClass001;
import X.JQz;
import android.net.Uri;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/* loaded from: VectorSource.class */
public class VectorSource extends Source {
    public VectorSource(long j) {
        super(j);
    }

    public VectorSource(String str, Uri uri) {
        this(str, uri.toString());
    }

    public VectorSource(String str, TileSet tileSet) {
        initialize(str, tileSet.toValueObject());
    }

    public VectorSource(String str, String str2) {
        initialize(str, str2);
    }

    public VectorSource(String str, URL url) {
        this(str, url.toExternalForm());
    }

    private native Feature[] querySourceFeatures(String[] strArr, Object[] objArr);

    public native void finalize();

    public String getUri() {
        JQz.A0z();
        return nativeGetUrl();
    }

    public String getUrl() {
        JQz.A0z();
        return nativeGetUrl();
    }

    public native void initialize(String str, Object obj);

    public native String nativeGetUrl();

    public List querySourceFeatures(String[] strArr, Expression expression) {
        JQz.A0z();
        Feature[] querySourceFeatures = querySourceFeatures(strArr, expression != null ? expression.toArray() : null);
        return querySourceFeatures != null ? Arrays.asList(querySourceFeatures) : AnonymousClass001.A0s();
    }
}
