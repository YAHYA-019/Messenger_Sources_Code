package org.webrtc.legacy.opengl;

/* loaded from: RendererCommon$GlDrawer.class */
public interface RendererCommon$GlDrawer {
    void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5);

    void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5);

    void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4);

    void release();
}
