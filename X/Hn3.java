package X;

import android.opengl.GLES20;
import org.webrtc.Logging;
import org.webrtc.legacy.opengl.GlShader;

/* loaded from: Hn3.class */
public final class Hn3 {
    public int A00;

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw GOp.A16("glCreateShader() failed. GLES20 error: ", GLES20.glGetError());
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            HM3.A00("compileShader");
            return glCreateShader;
        }
        Logging.e(GlShader.TAG, 0Pz.A0v("Compile error ", GLES20.glGetShaderInfoLog(glCreateShader), " in shader:\n", str));
        throw AnonymousClass001.A0T(GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public int A01(String str) {
        int i = this.A00;
        if (i == -1) {
            throw AnonymousClass001.A0T("The program has been released");
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        throw GOp.A17("Could not locate uniform '", str, "' in program");
    }
}
