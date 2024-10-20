package org.webrtc.legacy;

import X.4YV;
import X.AnonymousClass001;
import X.GOp;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.webrtc.legacy.ThreadUtils;
import org.webrtc.legacy.opengl.GlShader;
import org.webrtc.legacy.opengl.GlUtil;
import org.webrtc.legacy.opengl.RendererCommon;

/* loaded from: YuvConverter.class */
public class YuvConverter {
    public static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oesTex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(oesTex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(oesTex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(oesTex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(oesTex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    public static final String VERTEX_SHADER = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    public final int coeffsLoc;
    public int frameBufferHeight;
    public final int frameBufferId;
    public int frameBufferWidth;
    public final int frameTextureId;
    public boolean released;
    public final GlShader shader;
    public final int texMatrixLoc;
    public final ThreadUtils.ThreadChecker threadChecker;
    public final int xUnitLoc;
    public static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    public static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.released = false;
        threadChecker.checkIsOnValidThread();
        int generateTexture = GlUtil.generateTexture(3553);
        this.frameTextureId = generateTexture;
        this.frameBufferWidth = 0;
        this.frameBufferHeight = 0;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i = iArr[0];
        this.frameBufferId = i;
        GLES20.glBindFramebuffer(36160, i);
        GlUtil.checkNoGLES2Error("Generate framebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, generateTexture, 0);
        GlUtil.checkNoGLES2Error("Attach texture to framebuffer");
        GLES20.glBindFramebuffer(36160, 0);
        GlShader glShader = new GlShader(VERTEX_SHADER, FRAGMENT_SHADER);
        this.shader = glShader;
        glShader.useProgram();
        this.texMatrixLoc = glShader.getUniformLocation("texMatrix");
        this.xUnitLoc = glShader.getUniformLocation("xUnit");
        this.coeffsLoc = glShader.getUniformLocation("coeffs");
        GLES20.glUniform1i(glShader.getUniformLocation("oesTex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        glShader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        glShader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void convert(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, float[] fArr) {
        this.threadChecker.checkIsOnValidThread();
        if (this.released) {
            throw AnonymousClass001.A0N("YuvConverter.convert called on released object");
        }
        if (i3 % 8 != 0) {
            throw AnonymousClass001.A0L("Invalid stride, must be a multiple of 8");
        }
        if (i3 < i) {
            throw AnonymousClass001.A0L("Invalid stride, must >= width");
        }
        int i5 = (i + 3) / 4;
        int i6 = (i + 7) / 8;
        int i7 = (i2 + 1) / 2;
        int i8 = i2 + i7;
        if (byteBuffer.capacity() < i3 * i8) {
            throw AnonymousClass001.A0L("YuvConverter.convert called with too small buffer");
        }
        float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
        GLES20.glBindFramebuffer(36160, this.frameBufferId);
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        int i9 = i3 / 4;
        if (this.frameBufferWidth != i9 || this.frameBufferHeight != i8) {
            this.frameBufferWidth = i9;
            this.frameBufferHeight = i8;
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.frameTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, this.frameBufferWidth, this.frameBufferHeight, 0, 6408, 5121, null);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus != 36053) {
                throw 4YV.A0h("Framebuffer not complete, status: ", glCheckFramebufferStatus);
            }
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i4);
        GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
        GLES20.glViewport(0, 0, i5, i2);
        int i10 = this.xUnitLoc;
        float f = multiplyMatrices[0];
        float f2 = i;
        GLES20.glUniform2f(i10, f / f2, multiplyMatrices[1] / f2);
        GLES20.glUniform4f(this.coeffsLoc, 0.299f, 0.587f, 0.114f, 0.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(0, i2, i6, i7);
        GLES20.glUniform2f(this.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f2, (multiplyMatrices[1] * 2.0f) / f2);
        GLES20.glUniform4f(this.coeffsLoc, -0.169f, -0.331f, 0.499f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glViewport(i3 / 8, i2, i6, i7);
        GLES20.glUniform4f(this.coeffsLoc, 0.499f, -0.418f, -0.0813f, 0.5f);
        GLES20.glDrawArrays(5, 0, 4);
        GOp.A1T(byteBuffer, this.frameBufferWidth, this.frameBufferHeight);
        GlUtil.checkNoGLES2Error("YuvConverter.convert");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(36197, 0);
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.released = true;
        this.shader.release();
        GLES20.glDeleteTextures(1, new int[]{this.frameTextureId}, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferWidth = 0;
        this.frameBufferHeight = 0;
    }
}
