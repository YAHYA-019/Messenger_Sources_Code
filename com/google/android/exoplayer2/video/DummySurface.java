package com.google.android.exoplayer2.video;

import X.GOp;
import X.GTQ;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: DummySurface.class */
public final class DummySurface extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final GTQ A01;

    public DummySurface(SurfaceTexture surfaceTexture, GTQ gtq) {
        super(surfaceTexture);
        this.A01 = gtq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.video.DummySurface A00(boolean r301) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.A00(boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    public static boolean A01() {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A03) {
                int i = 0;
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                    i = GOp.A02(eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 0);
                }
                A02 = i;
                A03 = true;
            }
            if (A02 == 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        GTQ gtq = this.A01;
        synchronized (gtq) {
            if (!this.A00) {
                gtq.A00.getClass();
                gtq.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
