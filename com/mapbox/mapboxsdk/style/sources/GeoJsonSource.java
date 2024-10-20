package com.mapbox.mapboxsdk.style.sources;

import X.1BK;
import X.AnonymousClass001;
import X.JQz;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.style.expressions.Expression;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/* loaded from: GeoJsonSource.class */
public class GeoJsonSource extends Source {
    public GeoJsonSource(long j) {
        super(j);
    }

    public GeoJsonSource(String str) {
        initialize(str, null);
        setGeoJson(FeatureCollection.fromFeatures(AnonymousClass001.A0s()));
    }

    public GeoJsonSource(String str, Feature feature) {
        initialize(str, null);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, Feature feature, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(feature);
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection) {
        initialize(str, null);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(featureCollection);
    }

    public GeoJsonSource(String str, Geometry geometry) {
        initialize(str, null);
        setGeoJson(geometry);
    }

    public GeoJsonSource(String str, Geometry geometry, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(geometry);
    }

    public GeoJsonSource(String str, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        setGeoJson(FeatureCollection.fromFeatures(AnonymousClass001.A0s()));
    }

    public GeoJsonSource(String str, String str2) {
        if (str2 == null || str2.startsWith("http")) {
            throw AnonymousClass001.A0L("Expected a raw json body");
        }
        initialize(str, null);
        setGeoJson(str2);
    }

    public GeoJsonSource(String str, String str2, GeoJsonOptions geoJsonOptions) {
        if (str2 == null || str2.startsWith("http") || str2.startsWith("asset") || str2.startsWith("file")) {
            throw AnonymousClass001.A0L("Expected a raw json body");
        }
        initialize(str, geoJsonOptions);
        setGeoJson(str2);
    }

    public GeoJsonSource(String str, URI uri) {
        initialize(str, null);
        nativeSetUrl(uri.toString());
    }

    public GeoJsonSource(String str, URI uri, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        nativeSetUrl(uri.toString());
    }

    public GeoJsonSource(String str, URL url) {
        initialize(str, null);
        nativeSetUrl(url.toExternalForm());
    }

    public GeoJsonSource(String str, URL url, GeoJsonOptions geoJsonOptions) {
        initialize(str, geoJsonOptions);
        nativeSetUrl(url.toExternalForm());
    }

    private native Feature[] nativeGetClusterChildren(Feature feature);

    private native int nativeGetClusterExpansionZoom(Feature feature);

    private native Feature[] nativeGetClusterLeaves(Feature feature, long j, long j2);

    private native void nativeSetFeature(Feature feature);

    private native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    private native void nativeSetGeoJsonString(String str);

    private native void nativeSetGeometry(Geometry geometry);

    private native Feature[] querySourceFeatures(Object[] objArr);

    public native void finalize();

    public FeatureCollection getClusterChildren(Feature feature) {
        JQz.A0z();
        return FeatureCollection.fromFeatures(nativeGetClusterChildren(feature));
    }

    public int getClusterExpansionZoom(Feature feature) {
        JQz.A0z();
        return nativeGetClusterExpansionZoom(feature);
    }

    public FeatureCollection getClusterLeaves(Feature feature, long j, long j2) {
        JQz.A0z();
        return FeatureCollection.fromFeatures(nativeGetClusterLeaves(feature, j, j2));
    }

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

    public native void nativeSetUrl(String str);

    public List querySourceFeatures(Expression expression) {
        JQz.A0z();
        Feature[] querySourceFeatures = querySourceFeatures(expression != null ? expression.toArray() : null);
        return querySourceFeatures != null ? Arrays.asList(querySourceFeatures) : AnonymousClass001.A0s();
    }

    public void setGeoJson(Feature feature) {
        if (this.detached) {
            return;
        }
        JQz.A0z();
        nativeSetFeature(feature);
    }

    public void setGeoJson(FeatureCollection featureCollection) {
        List features;
        if (this.detached) {
            return;
        }
        JQz.A0z();
        if (featureCollection != null && (features = featureCollection.features()) != null) {
            featureCollection = FeatureCollection.fromFeatures(1BK.A17(features));
        }
        nativeSetFeatureCollection(featureCollection);
    }

    public void setGeoJson(Geometry geometry) {
        if (this.detached) {
            return;
        }
        JQz.A0z();
        nativeSetGeometry(geometry);
    }

    public void setGeoJson(String str) {
        if (this.detached) {
            return;
        }
        JQz.A0z();
        nativeSetGeoJsonString(str);
    }

    public void setUri(String str) {
        JQz.A0z();
        nativeSetUrl(str);
    }

    public void setUri(URI uri) {
        setUri(uri.toString());
    }

    public void setUrl(String str) {
        JQz.A0z();
        nativeSetUrl(str);
    }

    public void setUrl(URL url) {
        JQz.A0z();
        setUrl(url.toExternalForm());
    }
}
