package X;

import android.opengl.GLES20;
import android.opengl.GLException;

/* loaded from: Hw5.class */
public abstract class Hw5 {
    public static int A00(int i) {
        int A04 = AbstractC2326GOr.A04(i);
        A01("generateTexture");
        return A04;
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError != 1285) {
                throw new GLException(glGetError, AnonymousClass001.A0e(": GLES20 error: ", AnonymousClass001.A0n(str), glGetError));
            }
            throw new GLException(1285, str);
        }
    }
}
