package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.os.HandlerThread;

/* renamed from: X.0eo, reason: invalid class name */
/* loaded from: 0eo.class */
public final class C0eo {
    public int A02;
    public MediaCodec.BufferInfo A04;
    public MediaCodec A05;
    public MediaMuxer A06;
    public C0r3 A07;
    public C0ek A08;
    public boolean A09;
    public final HandlerThread A0A;
    public int A03 = 720;
    public int A01 = 1280;
    public int A00 = -1;

    public C0eo() {
        HandlerThread handlerThread = new HandlerThread("photo_video_transcode");
        C0T8.A00(handlerThread);
        this.A0A = handlerThread;
    }

    public static final void A00(C0eo c0eo) {
        0fH.A0A(C0eo.class, "releasing encoder objects");
        MediaCodec mediaCodec = c0eo.A05;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                MediaCodec mediaCodec2 = c0eo.A05;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
            } catch (IllegalStateException e) {
                0fH.A0H(C0eo.class, "encoder was not in the correct state", e);
            }
            c0eo.A05 = null;
        }
        C0ek c0ek = c0eo.A08;
        if (c0ek != null) {
            GLES20.glDeleteTextures(1, c0ek.A08, 0);
            int i = c0ek.A00;
            if (i != 0) {
                GLES20.glDeleteShader(i);
                c0ek.A00 = 0;
            }
            c0eo.A08 = null;
        }
        C0r3 c0r3 = c0eo.A07;
        if (c0r3 != null) {
            EGLDisplay eGLDisplay = c0r3.A01;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                EGL14.eglDestroySurface(eGLDisplay, c0r3.A02);
                EGL14.eglDestroyContext(c0r3.A01, c0r3.A00);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(c0r3.A01);
            }
            c0r3.A03.release();
            c0r3.A01 = EGL14.EGL_NO_DISPLAY;
            c0r3.A00 = EGL14.EGL_NO_CONTEXT;
            c0r3.A02 = EGL14.EGL_NO_SURFACE;
            c0r3.A03 = null;
            c0eo.A07 = null;
        }
        MediaMuxer mediaMuxer = c0eo.A06;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            MediaMuxer mediaMuxer2 = c0eo.A06;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
            c0eo.A06 = null;
        }
    }
}
