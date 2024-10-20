package com.mapbox.mapboxsdk.style.sources;

import X.JQz;
import com.mapbox.mapboxsdk.LibraryLoader;

/* loaded from: Source.class */
public abstract class Source {
    public static final String TAG = "Mbgl-Source";
    public boolean detached;
    public long nativePtr;

    static {
        LibraryLoader.load();
    }

    public Source() {
        JQz.A0z();
    }

    public Source(long j) {
        JQz.A0z();
        this.nativePtr = j;
    }

    public void checkThread() {
        JQz.A0z();
    }

    public String getAttribution() {
        JQz.A0z();
        return nativeGetAttribution();
    }

    public String getId() {
        JQz.A0z();
        return nativeGetId();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public native String nativeGetAttribution();

    public native String nativeGetId();

    public void setDetached() {
        this.detached = true;
    }
}
