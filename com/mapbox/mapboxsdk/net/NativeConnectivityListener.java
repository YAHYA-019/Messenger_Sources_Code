package com.mapbox.mapboxsdk.net;

import com.mapbox.mapboxsdk.LibraryLoader;

/* loaded from: NativeConnectivityListener.class */
public class NativeConnectivityListener implements ConnectivityListener {
    public boolean invalidated;
    public long nativePtr;

    static {
        LibraryLoader.load();
    }

    public NativeConnectivityListener() {
        initialize();
    }

    public NativeConnectivityListener(long j) {
        this.nativePtr = j;
    }

    public native void finalize();

    public native void initialize();

    public native void nativeOnConnectivityStateChanged(boolean z);

    @Override // com.mapbox.mapboxsdk.net.ConnectivityListener
    public void onNetworkStateChanged(boolean z) {
        nativeOnConnectivityStateChanged(z);
    }
}
