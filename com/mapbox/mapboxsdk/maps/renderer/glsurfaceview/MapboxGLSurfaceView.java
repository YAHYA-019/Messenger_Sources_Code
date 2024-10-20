package com.mapbox.mapboxsdk.maps.renderer.glsurfaceview;

import X.0FI;
import X.AnonymousClass001;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* loaded from: MapboxGLSurfaceView.class */
public class MapboxGLSurfaceView extends GLSurfaceView {
    public OnGLSurfaceViewDetachedListener detachedListener;

    /* loaded from: MapboxGLSurfaceView$OnGLSurfaceViewDetachedListener.class */
    public interface OnGLSurfaceViewDetachedListener {
        void onGLSurfaceViewDetached();
    }

    public MapboxGLSurfaceView(Context context) {
        super(context);
    }

    public MapboxGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-674530457);
        OnGLSurfaceViewDetachedListener onGLSurfaceViewDetachedListener = this.detachedListener;
        if (onGLSurfaceViewDetachedListener != null) {
            onGLSurfaceViewDetachedListener.onGLSurfaceViewDetached();
        }
        super.onDetachedFromWindow();
        0FI.A0C(1251013335, A06);
    }

    public void setDetachedListener(OnGLSurfaceViewDetachedListener onGLSurfaceViewDetachedListener) {
        if (this.detachedListener != null) {
            throw AnonymousClass001.A0L("Detached from window listener has been already set.");
        }
        this.detachedListener = onGLSurfaceViewDetachedListener;
    }
}
