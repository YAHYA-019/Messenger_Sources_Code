package X;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: N34.class */
public abstract class N34 {
    public static String A00(String str, String str2, int i) {
        return String.format(null, "%s: GL error 0x%04x %s occurred, see logcat output", str, Integer.valueOf(i), str2);
    }

    public static void A01(String str) {
        int i;
        boolean z = false;
        int i2 = 12288;
        while (true) {
            i = i2;
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i2 = eglGetError;
        }
        if (z) {
            switch (i) {
                case 12289:
                    throw new J7C(12289, A00(str, "EGL_NOT_INITIALIZED", i));
                case 12290:
                    throw new J7C(12290, A00(str, "EGL_BAD_ACCESS", i));
                case 12291:
                    throw new J7C(12291, A00(str, "EGL_BAD_ALLOC", i));
                case 12292:
                    throw new J7C(12292, A00(str, "EGL_BAD_ATTRIBUTE", i));
                case 12293:
                    throw new J7C(12293, A00(str, "EGL_BAD_CONFIG", i));
                case 12294:
                    throw new J7C(12294, A00(str, "EGL_BAD_CONTEXT", i));
                case 12295:
                    throw new J7C(12295, A00(str, "EGL_BAD_CURRENT_SURFACE", i));
                case 12296:
                    throw new J7C(12296, A00(str, "EGL_BAD_DISPLAY", i));
                case 12297:
                    throw new J7C(12297, A00(str, "EGL_BAD_MATCH", i));
                case 12298:
                    throw new J7C(12298, A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
                case 12299:
                    throw new J7C(12299, A00(str, "EGL_BAD_NATIVE_WINDOW", i));
                case 12300:
                    throw new J7C(12300, A00(str, "EGL_BAD_PARAMETER", i));
                case 12301:
                    throw new J7C(12301, A00(str, "EGL_BAD_SURFACE", i));
                case 12302:
                    throw new J7C(12302, A00(str, "EGL_CONTEXT_LOST", i));
                default:
                    throw new J7C(i, A00(str, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, i));
            }
        }
    }

    public static void A02(String str, Object... objArr) {
        int i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            i = i2;
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            z = true;
            i2 = glGetError;
        }
        if (z) {
            String format = String.format(str, objArr);
            switch (i) {
                case 1280:
                    throw new J7C(1280, A00(format, "GL_INVALID_ENUM", i));
                case 1281:
                    throw new J7C(1281, A00(format, "GL_INVALID_VALUE", i));
                case 1282:
                    throw new J7C(1282, A00(format, "GL_INVALID_OPERATION", i));
                case 1283:
                case 1284:
                default:
                    throw new J7C(i, A00(format, OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, i));
                case 1285:
                    throw new J7C(1285, A00(format, "GL_OUT_OF_MEMORY", i));
                case 1286:
                    throw new J7C(1286, A00(format, "GL_INVALID_FRAMEBUFFER_OPERATION", i));
            }
        }
    }
}
