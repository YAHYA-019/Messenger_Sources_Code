package org.webrtc.legacy;

import X.0FI;
import X.AnonymousClass001;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import org.webrtc.legacy.EglBase10;
import org.webrtc.legacy.EglBase14;

/* loaded from: EglBase.class */
public abstract class EglBase {
    public static final boolean EGL14_SUPPORTED = true;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final Object lock = AnonymousClass001.A0R();
    public static final int[] CONFIG_PLAIN = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] CONFIG_RGBA = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
    public static final int[] CONFIG_PIXEL_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, 1, 12344};
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 1, 12344};
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int[] CONFIG_RECORDABLE = {12324, 8, 12323, 8, 12322, 8, 12352, 4, EGL_RECORDABLE_ANDROID, 1, 12344};

    /* loaded from: EglBase$Context.class */
    public class Context {
    }

    public static EglBase create() {
        return create(null, CONFIG_PLAIN);
    }

    public static EglBase create(Context context) {
        return create(context, CONFIG_PLAIN);
    }

    public static EglBase create(Context context, int[] iArr) {
        return (EglBase14.isEGL14Supported() && (context == null || (context instanceof EglBase14.Context))) ? new EglBase14((EglBase14.Context) context, iArr) : new EglBase10((EglBase10.Context) context, iArr);
    }

    public abstract void createDummyPbufferSurface();

    public abstract void createPbufferSurface(int i, int i2);

    public abstract void createSurface(SurfaceTexture surfaceTexture);

    public abstract void createSurface(Surface surface);

    public abstract void detachCurrent();

    public void finalize() {
        int A03 = 0FI.A03(-897232439);
        release();
        0FI.A09(1086254037, A03);
    }

    public abstract Context getEglBaseContext();

    public abstract boolean hasSurface();

    public abstract void makeCurrent();

    public abstract void release();

    public abstract void releaseSurface();

    public abstract int surfaceHeight();

    public abstract int surfaceWidth();

    public abstract void swapBuffers();
}
