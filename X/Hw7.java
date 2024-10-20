package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import javax.microedition.khronos.egl.EGL10;
import org.webrtc.EglBase$Context;
import org.webrtc.Logging;

/* loaded from: Hw7.class */
public abstract /* synthetic */ class Hw7 {
    public static final Hw7 $redex_init_class = null;

    static {
        int[] iArr = JOR.A01;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.JOR, java.lang.Object, X.J6F] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.JOR, java.lang.Object, X.J6G] */
    public static JOR A00(EglBase$Context eglBase$Context, int[] iArr) {
        EGLContext eGLContext;
        if (eglBase$Context == null) {
            Logging.d("EglBase14Impl", 0Pz.A0f("SDK version: ", ". isEGL14Supported: ", J6G.A02, true));
        } else {
            if (!(eglBase$Context instanceof J6C)) {
                if (!(eglBase$Context instanceof J6B)) {
                    throw AnonymousClass001.A0L("Unrecognized Context");
                }
                J6B j6b = (J6B) eglBase$Context;
                javax.microedition.khronos.egl.EGLContext eGLContext2 = j6b == null ? null : j6b.A00;
                ?? obj = new Object();
                ((J6F) obj).A00 = EGL10.EGL_NO_SURFACE;
                ((J6F) obj).A01 = new J6E(eGLContext2, iArr);
                return obj;
            }
            J6C j6c = (J6C) eglBase$Context;
            if (j6c != null) {
                eGLContext = j6c.A00;
                ?? obj2 = new Object();
                obj2.A00 = EGL14.EGL_NO_SURFACE;
                obj2.A01 = new J6D(eGLContext, iArr);
                return obj2;
            }
        }
        eGLContext = null;
        ?? obj22 = new Object();
        obj22.A00 = EGL14.EGL_NO_SURFACE;
        obj22.A01 = new J6D(eGLContext, iArr);
        return obj22;
    }
}
