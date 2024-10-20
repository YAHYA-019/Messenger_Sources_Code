package org.webrtc.legacy.opengl;

import X.0Pz;
import X.AnonymousClass001;
import X.GOp;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.Logging;

/* loaded from: GlShader.class */
public class GlShader {
    public static final String TAG = "GlShader";
    public int program;

    public GlShader(String str, String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram == 0) {
            throw GOp.A16("glCreateProgram() failed. GLES20 error: ", GLES20.glGetError());
        }
        GLES20.glAttachShader(glCreateProgram, compileShader);
        GLES20.glAttachShader(this.program, compileShader2);
        GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Logging.e(TAG, 0Pz.A0W("Could not link program: ", GLES20.glGetProgramInfoLog(this.program)));
            throw AnonymousClass001.A0T(GLES20.glGetProgramInfoLog(this.program));
        }
        GLES20.glDeleteShader(compileShader);
        GLES20.glDeleteShader(compileShader2);
        GlUtil.checkNoGLES2Error("Creating GlShader");
    }

    public static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            throw GOp.A16("glCreateShader() failed. GLES20 error: ", GLES20.glGetError());
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            GlUtil.checkNoGLES2Error("compileShader");
            return glCreateShader;
        }
        Logging.e(TAG, 0Pz.A0E(i, "Could not compile shader ", ":", GLES20.glGetShaderInfoLog(glCreateShader)));
        throw AnonymousClass001.A0T(GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public int getAttribLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw AnonymousClass001.A0T("The program has been released");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        throw GOp.A17("Could not locate '", str, "' in program");
    }

    public int getUniformLocation(String str) {
        int i = this.program;
        if (i == -1) {
            throw AnonymousClass001.A0T("The program has been released");
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        throw GOp.A17("Could not locate uniform '", str, "' in program");
    }

    public void release() {
        Logging.d(TAG, "Deleting shader.");
        int i = this.program;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(String str, int i, FloatBuffer floatBuffer) {
        if (this.program == -1) {
            throw AnonymousClass001.A0T("The program has been released");
        }
        int attribLocation = getAttribLocation(str);
        GLES20.glEnableVertexAttribArray(attribLocation);
        GLES20.glVertexAttribPointer(attribLocation, i, 5126, false, 0, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("setVertexAttribArray");
    }

    public void useProgram() {
        int i = this.program;
        if (i == -1) {
            throw AnonymousClass001.A0T("The program has been released");
        }
        GLES20.glUseProgram(i);
        GlUtil.checkNoGLES2Error("glUseProgram");
    }
}
