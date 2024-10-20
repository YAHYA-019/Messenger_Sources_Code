package org.webrtc.legacy.opengl;

import X.0Pz;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.webrtc.Logging;

/* loaded from: Texture2dProgram.class */
public class Texture2dProgram {
    public static final String FRAGMENT_SHADER_EXT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float scale;\nvoid main() {\n    vec2 vTextRelToCenter;\n    vec2 vTextRelToOffCenter;\n    vTextRelToCenter[0] = scale*(vTextureCoord[0] - 0.5);\n    vTextRelToCenter[1] = (vTextureCoord[1] - 0.5);\n    vTextRelToOffCenter[0] = vTextRelToCenter[0] + 0.02;\n    vTextRelToOffCenter[1] = vTextRelToCenter[1];\n    float radius = length(vTextRelToCenter);\n    float shadowRadius = length(vTextRelToOffCenter);\n    if (radius > 0.45 && shadowRadius < 0.48) {\n       float alpha = ((0.48 - shadowRadius)/ 0.2) * 1.0;\n      gl_FragColor = vec4(0.0,0.0,0.0,alpha);\n    } else if (radius > 0.45) {\n      gl_FragColor = vec4(0.0,0.0,0.0,0.0);\n    } else {\n      gl_FragColor = texture2D(sTexture, vTextureCoord);\n    }}\n";
    public static final String TAG = "Texture2dProgram";
    public static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
    public int mProgramHandle;
    public int mScaleLoc;
    public int mTextureTarget = 36197;
    public int maPositionLoc;
    public int maTextureCoordLoc;
    public int muMVPMatrixLoc;
    public int muTexMatrixLoc;

    public Texture2dProgram() {
        int createProgram = GlUtil.createProgram(VERTEX_SHADER, FRAGMENT_SHADER_EXT);
        this.mProgramHandle = createProgram;
        if (createProgram == 0) {
            throw AnonymousClass001.A0T("Unable to create program");
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(createProgram, "aPosition");
        this.maPositionLoc = glGetAttribLocation;
        GlUtil.checkLocation(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
        this.maTextureCoordLoc = glGetAttribLocation2;
        GlUtil.checkLocation(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        this.muMVPMatrixLoc = glGetUniformLocation;
        GlUtil.checkLocation(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
        this.muTexMatrixLoc = glGetUniformLocation2;
        GlUtil.checkLocation(glGetUniformLocation2, "uTexMatrix");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "scale");
        this.mScaleLoc = glGetUniformLocation3;
        GlUtil.checkLocation(glGetUniformLocation3, "scale");
    }

    public int createTextureObject() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.checkNoGLES2Error("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(this.mTextureTarget, i);
        GlUtil.checkNoGLES2Error(0Pz.A0T("glBindTexture ", i));
        AbstractC2327GOs.A0a();
        GlUtil.checkNoGLES2Error("glTexParameter");
        return i;
    }

    public void draw(float[] fArr, FloatBuffer floatBuffer, int i, int i2, int i3, int i4, float[] fArr2, FloatBuffer floatBuffer2, int i5, int i6, float f) {
        GlUtil.checkNoGLES2Error("draw start");
        GLES20.glUseProgram(this.mProgramHandle);
        GlUtil.checkNoGLES2Error("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.mTextureTarget, i5);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, fArr, 0);
        GlUtil.checkNoGLES2Error("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, fArr2, 0);
        GlUtil.checkNoGLES2Error("glUniformMatrix4fv");
        GLES20.glUniform1f(this.mScaleLoc, f);
        GlUtil.checkNoGLES2Error("glUniform1f");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        GlUtil.checkNoGLES2Error("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, i3, 5126, false, i4, (Buffer) floatBuffer);
        GlUtil.checkNoGLES2Error("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        GlUtil.checkNoGLES2Error("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, i6, (Buffer) floatBuffer2);
        GlUtil.checkNoGLES2Error("glVertexAttribPointer");
        GLES20.glDrawArrays(5, i, i2);
        GlUtil.checkNoGLES2Error("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(this.mTextureTarget, 0);
        GLES20.glUseProgram(0);
    }

    public void release() {
        Logging.d(TAG, 0Pz.A0T("deleting program ", this.mProgramHandle));
        GLES20.glDeleteProgram(this.mProgramHandle);
        this.mProgramHandle = -1;
    }
}
