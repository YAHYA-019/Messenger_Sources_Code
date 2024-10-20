package com.google.android.exoplayer2.video;

import X.Q07;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: PlaceholderSurface.class */
public final class PlaceholderSurface extends Surface {
    public static int A03;
    public static boolean A04;
    public boolean A00;
    public final boolean A01;
    public final Q07 A02;

    public PlaceholderSurface(SurfaceTexture surfaceTexture, Q07 q07, boolean z) {
        super(surfaceTexture);
        this.A02 = q07;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.video.PlaceholderSurface A00(boolean r301) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.PlaceholderSurface.A00(boolean):com.google.android.exoplayer2.video.PlaceholderSurface");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r0.contains("EGL_KHR_surfaceless_context") == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A01() {
        /*
            java.lang.Class<com.google.android.exoplayer2.video.PlaceholderSurface> r0 = com.google.android.exoplayer2.video.PlaceholderSurface.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            boolean r0 = com.google.android.exoplayer2.video.PlaceholderSurface.A04     // Catch: java.lang.Throwable -> L77
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L69
            r0 = 0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r0)     // Catch: java.lang.Throwable -> L77
            r304 = r0
            r0 = 12373(0x3055, float:1.7338E-41)
            r305 = r0
            r0 = r304
            r1 = r305
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r1)     // Catch: java.lang.Throwable -> L77
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5d
            java.lang.String r0 = "EGL_EXT_protected_content"
            r304 = r0
            r0 = r306
            r1 = r304
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L77
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L5d
            r0 = 0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r0)     // Catch: java.lang.Throwable -> L77
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.String r0 = android.opengl.EGL14.eglQueryString(r0, r1)     // Catch: java.lang.Throwable -> L77
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L58
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            r304 = r0
            r0 = r306
            r1 = r304
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L77
            r307 = r0
            r0 = 1
            r302 = r0
            r0 = r307
            if (r0 != 0) goto L61
        L58:
            r0 = 2
            r302 = r0
            goto L61
        L5d:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L61:
            r0 = r302
            com.google.android.exoplayer2.video.PlaceholderSurface.A03 = r0     // Catch: java.lang.Throwable -> L77
            r0 = r303
            com.google.android.exoplayer2.video.PlaceholderSurface.A04 = r0     // Catch: java.lang.Throwable -> L77
        L69:
            int r0 = com.google.android.exoplayer2.video.PlaceholderSurface.A03     // Catch: java.lang.Throwable -> L77 java.lang.Throwable -> L77
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L73
            r0 = 0
            r303 = r0
        L73:
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            return r0
        L77:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.PlaceholderSurface.A01():boolean");
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        Q07 q07 = this.A02;
        synchronized (q07) {
            if (!this.A00) {
                q07.A00.getClass();
                q07.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}
