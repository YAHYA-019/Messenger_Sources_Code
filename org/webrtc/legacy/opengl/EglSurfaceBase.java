package org.webrtc.legacy.opengl;

import X.AnonymousClass001;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import org.webrtc.Logging;

/* loaded from: EglSurfaceBase.class */
public class EglSurfaceBase {
    public static final String TAG = "EglSurfaceBase";
    public EGLSurface mEGLSurface = EGL14.EGL_NO_SURFACE;
    public EglCore mEglCore;

    public EglSurfaceBase(EglCore eglCore) {
        this.mEglCore = eglCore;
    }

    public void createWindowSurface(Object obj) {
        if (this.mEGLSurface != EGL14.EGL_NO_SURFACE) {
            throw AnonymousClass001.A0N("surface already created");
        }
        this.mEGLSurface = this.mEglCore.createWindowSurface(obj);
    }

    public int getHeight() {
        return this.mEglCore.querySurface(this.mEGLSurface, 12374);
    }

    public int getWidth() {
        return this.mEglCore.querySurface(this.mEGLSurface, 12375);
    }

    public void makeCurrent() {
        this.mEglCore.makeCurrent(this.mEGLSurface);
    }

    public void releaseEglSurface() {
        this.mEglCore.releaseSurface(this.mEGLSurface);
        this.mEGLSurface = EGL14.EGL_NO_SURFACE;
    }

    public boolean swapBuffers() {
        EglCore eglCore = this.mEglCore;
        boolean eglSwapBuffers = EGL14.eglSwapBuffers(eglCore.mEGLDisplay, this.mEGLSurface);
        if (!eglSwapBuffers) {
            Logging.d(TAG, "WARNING: swapBuffers() failed");
        }
        return eglSwapBuffers;
    }
}
