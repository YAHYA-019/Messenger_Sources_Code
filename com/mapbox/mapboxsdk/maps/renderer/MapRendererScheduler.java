package com.mapbox.mapboxsdk.maps.renderer;

/* loaded from: MapRendererScheduler.class */
public interface MapRendererScheduler {
    void queueEvent(Runnable runnable);

    void requestRender();
}
