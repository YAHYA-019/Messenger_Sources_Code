package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;

/* loaded from: I9C.class */
public final class I9C {
    public final /* synthetic */ HsY A00;

    public I9C(HsY hsY) {
        this.A00 = hsY;
    }

    public static int A00(I9C i9c, String str) {
        HsY hsY = i9c.A00;
        java.util.Map map = hsY.A04;
        if (map.containsKey(str)) {
            return AnonymousClass001.A03(map.get(str));
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(hsY.A00, str);
        if (glGetUniformLocation == -1) {
            throw AnonymousClass001.A0N(String.format(null, "Uniform location not found: %s", str));
        }
        1BK.A1P(str, map, glGetUniformLocation);
        return glGetUniformLocation;
    }

    public static void A01(I9C i9c, I5I i5i) {
        i9c.A05("uSurfaceTransformMatrix", i5i.A04);
        i9c.A05("uVideoTransformMatrix", i5i.A05);
        i9c.A05("uSceneTransformMatrix", i5i.A03);
    }

    public void A02(HhA hhA) {
        int glGetAttribLocation;
        HsY hsY = this.A00;
        java.util.Map map = hhA.A04;
        List list = hhA.A03;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                HyW hyW = hhA.A02;
                if (hyW == null) {
                    GLES20.glDrawArrays(hhA.A01, 0, hhA.A00);
                    return;
                }
                int i3 = hyW.A00;
                if (hyW instanceof C2552Gh0) {
                    i3 = ((C2552Gh0) hyW).A00;
                }
                GLES20.glDrawElements(hhA.A01, i3, hyW.A01, hyW.A02);
                return;
            }
            String A14 = 1BK.A14(list, i2);
            java.util.Map map2 = hsY.A05;
            if (map2.containsKey(A14)) {
                glGetAttribLocation = AnonymousClass001.A03(map2.get(A14));
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(hsY.A00, A14);
                if (glGetAttribLocation == -1) {
                    throw AnonymousClass001.A0N(String.format(null, "Vertex attribute location not found: %s", A14));
                }
                1BK.A1P(A14, map2, glGetAttribLocation);
            }
            if (glGetAttribLocation != -1) {
                I7A i7a = (I7A) map.get(A14);
                FloatBuffer floatBuffer = i7a.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, i7a.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
            i = i2 + 1;
        }
    }

    public void A03(String str, float f) {
        GLES20.glUniform1f(A00(this, str), f);
    }

    public void A04(String str, HsT hsT) {
        int size;
        java.util.Map map = this.A00.A03;
        if (map.containsKey(str)) {
            size = AnonymousClass001.A03(map.get(str));
        } else {
            size = map.size();
            1BK.A1P(str, map, size);
        }
        int i = hsT.A01;
        int i2 = hsT.A00;
        N34.A02(0Pz.A0q("gl.Program::setTexture::before: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
        int A00 = A00(this, str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A00, size);
        N34.A02(0Pz.A0q("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", " textureHandle: ", size, i, i2), new Object[0]);
    }

    public void A05(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(this, str), 1, false, fArr, 0);
    }
}
