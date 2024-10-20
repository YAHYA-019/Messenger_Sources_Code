package org.webrtc.legacy.opengl;

import X.0FI;
import X.AnonymousClass001;
import X.GOn;
import X.GOo;
import X.GOp;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.Logging;

/* loaded from: EglCore.class */
public final class EglCore {
    public static final String TAG = "EglCore";
    public EGLConfig mEGLConfig;
    public EGLContext mEGLContext;
    public EGLDisplay mEGLDisplay;

    public EglCore() {
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw AnonymousClass001.A0T("unable to get EGL14 display");
        }
        int[] A1b = GOn.A1b();
        if (!EGL14.eglInitialize(eglGetDisplay, A1b, 0, A1b, 1)) {
            this.mEGLDisplay = null;
            throw AnonymousClass001.A0T("unable to initialize EGL14");
        }
        EGLContext eGLContext = this.mEGLContext;
        if (eGLContext == EGL14.EGL_NO_CONTEXT) {
            EGLConfig config = getConfig();
            if (config == null) {
                throw AnonymousClass001.A0T("Unable to find a suitable EGLConfig");
            }
            eGLContext = EGL14.eglCreateContext(this.mEGLDisplay, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            checkEglError("eglCreateContext");
            this.mEGLConfig = config;
            this.mEGLContext = eGLContext;
        }
        EGL14.eglQueryContext(this.mEGLDisplay, eGLContext, 12440, new int[1], 0);
    }

    public static void checkEglError(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw GOp.A17(str, ": EGL error: 0x", Integer.toHexString(eglGetError));
        }
    }

    private EGLConfig getConfig() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public EGLSurface createWindowSurface(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            throw AnonymousClass001.A0T(AnonymousClass001.A0Z(obj, "invalid surface: ", AnonymousClass001.A0k()));
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, new int[]{12344}, 0);
        checkEglError("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw AnonymousClass001.A0T("surface was null");
    }

    public void finalize() {
        int A03 = 0FI.A03(-1085031790);
        try {
            if (this.mEGLDisplay != EGL14.EGL_NO_DISPLAY) {
                Logging.w(TAG, "WARNING: EglCore was not explicitly released -- state may be leaked");
                release();
            }
            0FI.A09(614061607, A03);
        } catch (Throwable th) {
            0FI.A09(868528032, A03);
            throw th;
        }
    }

    public void makeCurrent(EGLSurface eGLSurface) {
        if (this.mEGLDisplay == EGL14.EGL_NO_DISPLAY) {
            Logging.d(TAG, "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throw AnonymousClass001.A0T("eglMakeCurrent failed");
        }
        if (!EGL14.eglSwapInterval(this.mEGLDisplay, 0)) {
            throw AnonymousClass001.A0T("engSwapInterval failed");
        }
    }

    public void makeNothingCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw AnonymousClass001.A0T("eglMakeCurrent failed");
        }
    }

    public String queryString(int i) {
        return EGL14.eglQueryString(this.mEGLDisplay, i);
    }

    public int querySurface(EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.mEGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    public void release() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            GOo.A1A(eGLDisplay);
            EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    public void releaseSurface(EGLSurface eGLSurface) {
        EGL14.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public boolean swapBuffers(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.mEGLDisplay, eGLSurface);
    }
}
