package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.legacy.EglBase;

/* renamed from: X.0r3, reason: invalid class name */
/* loaded from: 0r3.class */
public final class C0r3 {
    public EGLContext A00;
    public EGLDisplay A01;
    public Surface A03;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public EGLConfig[] A04 = new EGLConfig[1];

    public C0r3() {
        this.A01 = EGL14.EGL_NO_DISPLAY;
        this.A00 = EGL14.EGL_NO_CONTEXT;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A01 = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.A01 = null;
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};
        EGLDisplay eGLDisplay = this.A01;
        EGLConfig[] eGLConfigArr = this.A04;
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw AnonymousClass001.A0T("unable to find RGB888+recordable ES2 EGL config");
        }
        this.A00 = EGL14.eglCreateContext(this.A01, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        A00("eglCreateContext");
        if (this.A00 == null) {
            throw AnonymousClass001.A0T("null context");
        }
    }

    public static void A00(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw AnonymousClass001.A0T(0Pz.A0j(str, ": EGL error: 0x", Integer.toHexString(eglGetError)));
        }
    }
}
