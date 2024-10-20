package com.facebook.messaging.montage.composer;

import X.HT3;
import X.Rj4;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* loaded from: ColorAdjustmentGLSurfaceView.class */
public class ColorAdjustmentGLSurfaceView extends GLSurfaceView {
    public Rj4 A00;
    public HT3 A01;

    public ColorAdjustmentGLSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(2);
        Rj4 rj4 = new Rj4(getContext());
        this.A00 = rj4;
        setRenderer(rj4);
        setRenderMode(0);
    }

    public ColorAdjustmentGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
        Rj4 rj4 = new Rj4(getContext());
        this.A00 = rj4;
        setRenderer(rj4);
        setRenderMode(0);
    }
}
