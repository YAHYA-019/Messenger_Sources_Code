package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.opengl.EglCore;

/* loaded from: I5G.class */
public final class I5G {
    public static final Object A05 = AnonymousClass001.A0R();
    public static final int[] A06 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Object A04;

    public I5G(Object obj) {
        RuntimeException A0T;
        this.A04 = obj;
        synchronized (obj) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    if (EGL14.eglChooseConfig(this.A02, A06, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        if (eGLConfig != null) {
                            this.A00 = eGLConfig;
                            this.A01 = EGL14.eglCreateContext(this.A02, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            int eglGetError = EGL14.eglGetError();
                            if (eglGetError != 12288 || this.A01 == null) {
                                A0T = 0Pz.A08("eglCreateContext: EGL error: 0x", Integer.toHexString(eglGetError));
                            } else {
                                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A02, this.A00, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                this.A03 = eglCreatePbufferSurface;
                                if (eglCreatePbufferSurface == null || EGL14.eglGetError() != 12288) {
                                    this.A03 = EGL14.EGL_NO_SURFACE;
                                }
                            }
                        }
                    }
                    A0T = AnonymousClass001.A0T("Unable to find a suitable EGLConfig");
                } else {
                    this.A02 = EGL14.EGL_NO_DISPLAY;
                    A0T = AnonymousClass001.A0T("unable to initialize EGL14");
                }
            } else {
                A0T = AnonymousClass001.A0T("unable to get EGL14 display");
            }
            throw A0T;
        }
    }

    public Hua A00(I5d i5d) {
        try {
            if (i5d.A00() == null || AnonymousClass001.A1W(this.A02, EGL14.EGL_NO_DISPLAY)) {
                return null;
            }
            return new Hua(this, i5d, this.A04);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public void A01() {
        synchronized (this.A04) {
            EGLDisplay eGLDisplay = this.A02;
            EGLSurface eGLSurface = this.A03;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A01)) {
                throw AnonymousClass001.A0T("eglMakeCurrent failed");
            }
        }
    }

    public void A02() {
        if (this.A02 != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A04) {
                EGLSurface eGLSurface = this.A03;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(this.A02, eGLSurface);
                }
                GOo.A1A(this.A02);
                EGL14.eglDestroyContext(this.A02, this.A01);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(this.A02);
            }
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
        this.A03 = EGL14.EGL_NO_SURFACE;
    }

    public void finalize() {
        int A03 = 0FI.A03(756216457);
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                android.util.Log.w(EglCore.TAG, "WARNING: EglCore14 was not explicitly released -- state may be leaked");
                A02();
            }
            0FI.A09(1004452702, A03);
        } catch (Throwable th) {
            0FI.A09(1278263605, A03);
            throw th;
        }
    }
}
