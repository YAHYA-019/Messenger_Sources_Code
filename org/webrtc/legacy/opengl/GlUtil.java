package org.webrtc.legacy.opengl;

import X.0Pz;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOn;
import X.GOp;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;
import org.webrtc.Logging;

/* loaded from: GlUtil.class */
public class GlUtil {
    public static final float[] IDENTITY_MATRIX;
    public static final int SIZEOF_FLOAT = 4;
    public static final String TAG = "GlUtil";

    static {
        float[] A1a = GOn.A1a();
        IDENTITY_MATRIX = A1a;
        Matrix.setIdentityM(A1a, 0);
    }

    public static void checkLocation(int i, String str) {
        if (i < 0) {
            throw GOp.A17("Unable to locate '", str, "' in program");
        }
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String A0j = 0Pz.A0j(str, ": glError 0x", Integer.toHexString(glGetError));
        Logging.e(TAG, A0j);
        throw AnonymousClass001.A0T(A0j);
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        FloatBuffer A0k = AbstractC2326GOr.A0k(fArr, fArr.length * 4);
        A0k.position(0);
        return A0k;
    }

    public static int createProgram(String str, String str2) {
        int loadShader;
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 == 0 || (loadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        checkNoGLES2Error("glCreateProgram");
        if (glCreateProgram == 0) {
            Logging.e(TAG, "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkNoGLES2Error("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkNoGLES2Error("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Logging.e(TAG, "Could not link program: ");
        Logging.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int generateTexture(int i) {
        int A04 = AbstractC2326GOr.A04(i);
        checkNoGLES2Error("generateTexture");
        return A04;
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        checkNoGLES2Error(0Pz.A0T("glCreateShader type=", i));
        if (AbstractC2327GOs.A06(glCreateShader, str) == 0) {
            Logging.e(TAG, 0Pz.A0E(i, "Could not compile shader ", ": ", GLES20.glGetShaderInfoLog(glCreateShader)));
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        return glCreateShader;
    }
}
