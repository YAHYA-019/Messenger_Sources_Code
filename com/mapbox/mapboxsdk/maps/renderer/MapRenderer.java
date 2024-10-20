package com.mapbox.mapboxsdk.maps.renderer;

import X.7zO;
import android.content.Context;
import com.mapbox.mapboxsdk.LibraryLoader;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.storage.FileSource;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: MapRenderer.class */
public abstract class MapRenderer implements MapRendererScheduler {
    public static final String TAG = "Mbgl-MapRenderer";
    public MapboxMap.OnFpsChangedListener onFpsChangedListener;
    public long timeElapsed;
    public long nativePtr = 0;
    public double expectedRenderTime = 0.0d;

    static {
        LibraryLoader.load();
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, 7zO.A0I(context).density, FileSource.getInternalCachePath(context), str);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f, String str, String str2);

    private native void nativeOnSurfaceChanged(int i, int i2);

    private native void nativeOnSurfaceCreated();

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private void updateFps() {
        long nanoTime = System.nanoTime();
        this.onFpsChangedListener.onFpsChanged(1.0E9d / (nanoTime - this.timeElapsed));
        this.timeElapsed = nanoTime;
    }

    public native void finalize();

    public native void nativeReset();

    public abstract void onDestroy();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [long] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v28, types: [long] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.mapbox.mapboxsdk.maps.renderer.MapRenderer] */
    public void onDrawFrame(GL10 gl10) {
        ?? nanoTime = System.nanoTime();
        try {
            nanoTime = this;
            nanoTime.nativeRender();
        } catch (Error unused) {
            Logger.e(TAG, nanoTime.getMessage());
        }
        double nanoTime2 = System.nanoTime() - nanoTime;
        double d = this.expectedRenderTime;
        if (nanoTime2 < d) {
            ?? r0 = (long) ((d - nanoTime2) / 1000000.0d);
            try {
                r0 = r0;
                Thread.sleep(r0);
            } catch (InterruptedException unused2) {
                Logger.e(TAG, r0.getMessage());
            }
        }
        if (this.onFpsChangedListener != null) {
            updateFps();
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public abstract void onStart();

    public abstract void onStop();

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        gl10.glViewport(0, 0, i, i2);
        nativeOnSurfaceChanged(i, i2);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        nativeOnSurfaceCreated();
    }

    public void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent((Runnable) mapRendererRunnable);
    }

    public void setMaximumFps(int i) {
        if (i > 0) {
            this.expectedRenderTime = 1.0E9d / i;
        }
    }

    public void setOnFpsChangedListener(MapboxMap.OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
    }
}
