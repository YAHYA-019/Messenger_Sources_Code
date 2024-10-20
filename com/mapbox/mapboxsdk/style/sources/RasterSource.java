package com.mapbox.mapboxsdk.style.sources;

import X.JQz;
import java.net.URI;
import java.net.URL;

/* loaded from: RasterSource.class */
public class RasterSource extends Source {
    public static final int DEFAULT_TILE_SIZE = 512;

    public RasterSource(long j) {
        super(j);
    }

    public RasterSource(String str, TileSet tileSet) {
        initialize(str, tileSet.toValueObject(), 512);
    }

    public RasterSource(String str, TileSet tileSet, int i) {
        initialize(str, tileSet.toValueObject(), i);
    }

    public RasterSource(String str, String str2) {
        initialize(str, str2, 512);
    }

    public RasterSource(String str, String str2, int i) {
        initialize(str, str2, i);
    }

    public RasterSource(String str, URI uri) {
        this(str, uri.toString());
    }

    public RasterSource(String str, URL url) {
        this(str, url.toExternalForm());
    }

    public native void finalize();

    public String getUri() {
        JQz.A0z();
        return nativeGetUrl();
    }

    public String getUrl() {
        JQz.A0z();
        return nativeGetUrl();
    }

    public native void initialize(String str, Object obj, int i);

    public native String nativeGetUrl();
}
