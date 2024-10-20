package org.pytorch.executorch;

import X.0S2;
import X.1BL;
import X.AnonymousClass001;
import X.MAv;
import X.MAw;
import X.MAx;
import X.MAy;
import X.MAz;
import X.MB0;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: Tensor.class */
public abstract class Tensor {
    public HybridData mHybridData;
    public final long[] shape;

    public Tensor(long[] jArr) {
        Object[] objArr = new Object[0];
        if (!AnonymousClass001.A1T(jArr)) {
            throw AnonymousClass001.A0L(String.format(Locale.US, "Shape must be not null", objArr));
        }
        int i = 0;
        while (true) {
            int i2 = i;
            int length = jArr.length;
            if (i2 >= length) {
                this.shape = Arrays.copyOf(jArr, length);
                return;
            }
            Object[] objArr2 = new Object[0];
            if (!1BL.A1S((jArr[i2] > 0L ? 1 : (jArr[i2] == 0L ? 0 : -1)))) {
                throw AnonymousClass001.A0L(String.format(Locale.US, "Shape elements must be non negative", objArr2));
            }
            i = i2 + 1;
        }
    }

    public static Tensor nativeNewTensor(ByteBuffer byteBuffer, long[] jArr, int i, HybridData hybridData) {
        Tensor mAz;
        if (6 == i) {
            mAz = new MAv(byteBuffer.asFloatBuffer(), jArr);
        } else if (3 == i) {
            mAz = new MAx(byteBuffer.asIntBuffer(), jArr);
        } else if (4 == i) {
            mAz = new MAy(byteBuffer.asLongBuffer(), jArr);
        } else if (7 == i) {
            mAz = new MAw(byteBuffer.asDoubleBuffer(), jArr);
        } else if (0 == i) {
            mAz = new MB0(byteBuffer, jArr);
        } else {
            if (1 != i) {
                throw AnonymousClass001.A0L("Unknown Tensor dtype");
            }
            mAz = new MAz(byteBuffer, jArr);
        }
        mAz.mHybridData = hybridData;
        return mAz;
    }

    public int dtypeJniCode() {
        switch ((this instanceof MB0 ? 0S2.A00 : this instanceof MAz ? 0S2.A01 : this instanceof MAy ? 0S2.A0Y : this instanceof MAx ? 0S2.A0N : this instanceof MAw ? 0S2.A15 : 0S2.A0u).intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 22;
            default:
                return 0;
        }
    }

    public abstract Buffer getRawDataBuffer();
}
