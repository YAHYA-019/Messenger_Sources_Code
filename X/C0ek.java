package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: X.0ek, reason: invalid class name */
/* loaded from: 0ek.class */
public final class C0ek {
    public int A00;
    public FloatBuffer A01;
    public FloatBuffer A02;
    public ShortBuffer A03;
    public float[] A04;
    public float[] A05;
    public final float[] A07;
    public final float[] A09;
    public final float[] A0A;
    public final int[] A08 = new int[1];
    public short[] A06 = {0, 1, 2, 0, 2, 3};

    public C0ek(int i, int i2) {
        float[] fArr = new float[16];
        this.A09 = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        float[] fArr3 = new float[16];
        this.A07 = fArr3;
        float f = i2;
        float f2 = i;
        this.A05 = new float[]{0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, f2, f, 0.0f};
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.A02 = asFloatBuffer;
        asFloatBuffer.put(this.A05);
        this.A02.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(12);
        allocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
        this.A03 = asShortBuffer;
        asShortBuffer.put(this.A06);
        this.A03.position(0);
        this.A04 = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.A01 = asFloatBuffer2;
        asFloatBuffer2.put(this.A04);
        this.A01.position(0);
        int[] iArr = this.A08;
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int A00 = A00(35633, "uniform mat4 uMVPMatrix;attribute vec4 vPosition;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {  gl_Position = uMVPMatrix * vPosition;  v_texCoord = a_texCoord;}");
        int A002 = A00(35632, "precision mediump float;varying vec2 v_texCoord;uniform sampler2D s_texture;void main() {  gl_FragColor = texture2D( s_texture, v_texCoord );}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.A00 = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, A00);
        GLES20.glAttachShader(this.A00, A002);
        GLES20.glLinkProgram(this.A00);
        GLES20.glUseProgram(this.A00);
        GLES20.glViewport(0, 0, i, i2);
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(fArr2, 0.0f);
        Arrays.fill(fArr3, 0.0f);
        Matrix.orthoM(fArr, 0, 0.0f, f2, 0.0f, f, 0.0f, 50.0f);
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
    }

    public static final int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        String A0T = 0Pz.A0T("glCreateShader type=", i);
        11T.A0F(A0T, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            0fH.A14("GLProgramUtil", "%s: glError %d", AnonymousClass001.A1b(A0T, glGetError));
            throw AnonymousClass001.A0T(AnonymousClass001.A0e(": glError ", AnonymousClass001.A0n(A0T), glGetError));
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            0fH.A14("GLProgramUtil", "Could not compile shader %d:", AnonymousClass001.A1a(i));
            0fH.A14("GLProgramUtil", " %s", new Object[]{GLES20.glGetShaderInfoLog(glCreateShader)});
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        return glCreateShader;
    }
}
