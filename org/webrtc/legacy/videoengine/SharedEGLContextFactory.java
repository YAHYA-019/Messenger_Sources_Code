package org.webrtc.legacy.videoengine;

import X.0Pz;
import X.AnonymousClass001;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase;
import org.webrtc.legacy.EglBase10;

/* loaded from: SharedEGLContextFactory.class */
public class SharedEGLContextFactory {
    public static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    public static final String TAG = "SharedEGLContextFactory";
    public EglBase.Context mSharedContext;
    public final Object mSharedContextLock = AnonymousClass001.A0R();

    public SharedEGLContextFactory(EglBase.Context context) {
        this.mSharedContext = context;
    }

    public static int checkEglError(String str, EGL10 egl10) {
        int i = 12288;
        while (true) {
            int i2 = i;
            int eglGetError = egl10.eglGetError();
            if (eglGetError == 12288) {
                return i2;
            }
            Logging.e(TAG, 0Pz.A0j(str, ": EGL error: 0x", Integer.toHexString(eglGetError)));
            i = eglGetError;
        }
    }

    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        Logging.w(TAG, "creating OpenGL ES 2.0 context");
        checkEglError("Before eglCreateContext", egl10);
        int[] iArr = {12440, 2, 12344};
        synchronized (this.mSharedContextLock) {
            EglBase.Context context = this.mSharedContext;
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, context == null ? EGL10.EGL_NO_CONTEXT : ((EglBase10.Context) context).eglContext, iArr);
            int checkEglError = checkEglError("After eglCreateContext", egl10);
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if ((eglCreateContext == eGLContext || eglCreateContext == null) && checkEglError == 12294 && this.mSharedContext != null) {
                Logging.w(TAG, "Failed creating context. Resetting shared context.");
                this.mSharedContext = null;
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
                checkEglError("After eglCreateContext fallback", egl10);
            }
        }
        return eglCreateContext;
    }

    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }

    public boolean setSharedContext(EglBase.Context context) {
        boolean z;
        Logging.d(TAG, AnonymousClass001.A0Z(context, "Setting shared context to ", AnonymousClass001.A0k()));
        synchronized (this.mSharedContextLock) {
            if (this.mSharedContext == context) {
                z = false;
            } else {
                this.mSharedContext = context;
                z = true;
            }
        }
        return z;
    }
}
