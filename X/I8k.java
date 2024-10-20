package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import com.facebook.wearable.common.comms.rtc.hera.video.core.JavaI420Buffer;
import com.facebook.wearable.common.comms.rtc.hera.video.core.YuvHelper;
import java.nio.ByteBuffer;

/* loaded from: I8k.class */
public final class I8k {
    public static final float[] A07 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    public int A00;
    public int A01;
    public RSd A02;
    public final float[] A03 = new float[6];
    public final Point A05 = new Point();
    public final RKI A06 = new Object();
    public final Matrix A04 = GOn.A0F();

    public static void A00(Matrix matrix, I8Q i8q, S3f s3f, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        Matrix matrix2 = new Matrix(s3f.A03);
        matrix2.preConcat(matrix);
        float[] A01 = RVr.A01(matrix2);
        int intValue = s3f.A08.intValue();
        int i8 = s3f.A01;
        if (intValue != 0) {
            I8Q.A00(i8q, 0S2.A01, A01, i, i2, i5, i6);
            GLES20.glActiveTexture(33984);
            i7 = 3553;
        } else {
            I8Q.A00(i8q, 0S2.A00, A01, i, i2, i5, i6);
            GLES20.glActiveTexture(33984);
            i7 = 36197;
        }
        GLES20.glBindTexture(i7, i8);
        GLES20.glViewport(i3, i4, i5, i6);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(i7, 0);
    }

    public void A01() {
        RKI rki = this.A06;
        rki.A00 = null;
        int[] iArr = rki.A01;
        if (iArr != null) {
            GLES20.glDeleteTextures(3, iArr, 0);
            rki.A01 = null;
        }
        this.A02 = null;
    }

    public void A02(Matrix matrix, I8Q i8q, RSd rSd, int i, int i2, int i3, int i4) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int A01 = rSd.A01();
        int A00 = rSd.A00();
        float[] fArr = this.A03;
        matrix.mapPoints(fArr, A07);
        int i5 = 0;
        do {
            int i6 = i5 * 2;
            fArr[i6] = fArr[i6] * A01;
            int i7 = i6 + 1;
            fArr[i7] = fArr[i7] * A00;
            i5++;
        } while (i5 < 3);
        float f = fArr[0];
        float f2 = fArr[1];
        int A0A = AbstractC2326GOr.A0A(fArr, fArr[2], f, f2, 3);
        this.A01 = A0A;
        int A0A2 = AbstractC2326GOr.A0A(fArr, fArr[4], f, f2, 5);
        this.A00 = A0A2;
        if (A0A <= 0 || A0A2 <= 0) {
            return;
        }
        S3f s3f = rSd.A01;
        boolean z = s3f instanceof S3f;
        Matrix matrix2 = this.A04;
        matrix2.reset();
        matrix2.preTranslate(0.5f, 0.5f);
        if (!z) {
            matrix2.preScale(1.0f, -1.0f);
        }
        matrix2.preRotate(rSd.A00);
        matrix2.preTranslate(-0.5f, -0.5f);
        matrix2.preConcat(matrix);
        if (z) {
            this.A02 = null;
            A00(matrix2, i8q, s3f, this.A01, this.A00, i, i2, i3, i4);
            return;
        }
        if (rSd != this.A02) {
            this.A02 = rSd;
            JavaI420Buffer D4N = s3f.D4N();
            RKI rki = this.A06;
            int[] iArr = {D4N.A03, D4N.A01, D4N.A02};
            ByteBuffer[] byteBufferArr = {D4N.A07.slice(), D4N.A05.slice(), D4N.A06.slice()};
            int i8 = D4N.A04;
            int i9 = D4N.A00;
            int i10 = 0;
            int i11 = i8 / 2;
            int[] iArr2 = {i8, i11, i11};
            int i12 = i9 / 2;
            int[] iArr3 = {i9, i12, i12};
            int i13 = 0;
            int i14 = 0;
            do {
                int i15 = iArr[i13];
                int i16 = iArr2[i13];
                if (i15 > i16) {
                    i14 = Math.max(i14, i16 * iArr3[i13]);
                }
                i13++;
            } while (i13 < 3);
            if (i14 > 0 && ((byteBuffer2 = rki.A00) == null || byteBuffer2.capacity() < i14)) {
                rki.A00 = ByteBuffer.allocateDirect(i14);
            }
            if (rki.A01 == null) {
                rki.A01 = new int[3];
                int i17 = 0;
                do {
                    rki.A01[i17] = Hw5.A00(3553);
                    i17++;
                } while (i17 < 3);
            }
            do {
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, rki.A01[i10]);
                int i18 = iArr[i10];
                int i19 = iArr2[i10];
                if (i18 == i19) {
                    byteBuffer = byteBufferArr[i10];
                } else {
                    ByteBuffer byteBuffer3 = byteBufferArr[i10];
                    ByteBuffer byteBuffer4 = rki.A00;
                    int i20 = iArr3[i10];
                    if (byteBuffer3 == null) {
                        throw AnonymousClass001.A0Q(0Pz.A0W("src", " should not be null"));
                    }
                    if (byteBuffer4 == null) {
                        throw AnonymousClass001.A0Q(0Pz.A0W("dst", " should not be null"));
                    }
                    YuvHelper.nativeCopyPlane(byteBuffer3, i18, byteBuffer4, i19, i19, i20);
                    byteBuffer = rki.A00;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i10], iArr3[i10], 0, 6409, 5121, byteBuffer);
                i10++;
            } while (i10 < 3);
            D4N.release();
        }
        int[] iArr4 = this.A06.A01;
        I8Q.A00(i8q, 0S2.A0C, RVr.A01(matrix2), this.A01, this.A00, i3, i4);
        for (int i21 = 0; i21 < 3; i21++) {
            GLES20.glActiveTexture(33984 + i21);
            GLES20.glBindTexture(3553, iArr4[i21]);
        }
        GLES20.glViewport(i, i2, i3, i4);
        GLES20.glDrawArrays(5, 0, 4);
        int i22 = 0;
        do {
            GLES20.glActiveTexture(i22 + 33984);
            GLES20.glBindTexture(3553, 0);
            i22++;
        } while (i22 < 3);
    }
}
