package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;

/* loaded from: Hs8.class */
public final class Hs8 {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;

    public Hs8() {
        this.A02 = EGL14.EGL_NO_DISPLAY;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        this.A00 = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A02 = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.A02 = null;
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        EGLContext eGLContext2 = this.A01;
        if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(this.A02, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                    int eglGetError = EGL14.eglGetError();
                    if (eglGetError != 12288) {
                        throw GOp.A17("eglCreateContext", ": EGL error: 0x", Integer.toHexString(eglGetError));
                    }
                    this.A00 = eGLConfig;
                    this.A01 = eGLContext2;
                }
            } else {
                android.util.Log.w("MsqrdEglCore", 0Pz.A0d("unable to find RGB8888 / ", " EGLConfig", 2));
            }
            throw AnonymousClass001.A0T("Unable to find a suitable EGLConfig");
        }
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr2, 0);
        android.util.Log.i("MsqrdEglCore", 0Pz.A0T("EGLContext created, client version ", iArr2[0]));
    }

    public void A00() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            GOo.A1A(eGLDisplay);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void finalize() {
        int A03 = 0FI.A03(255195248);
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                android.util.Log.w("MsqrdEglCore", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A00();
            }
            0FI.A09(-2142516294, A03);
        } catch (Throwable th) {
            0FI.A09(-1350532420, A03);
            throw th;
        }
    }
}
