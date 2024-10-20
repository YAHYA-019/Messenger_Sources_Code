package com.mapbox.mapboxsdk.maps.renderer;

/* loaded from: MapRendererRunnable.class */
public class MapRendererRunnable implements Runnable {
    public final long nativePtr;

    public MapRendererRunnable(long j) {
        this.nativePtr = j;
    }

    private native void nativeInitialize();

    public native void finalize();

    @Override // java.lang.Runnable
    public native void run();
}
