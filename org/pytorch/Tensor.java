package org.pytorch;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.KMA;
import X.KNe;
import X.MAu;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: Tensor.class */
public abstract class Tensor {
    public HybridData mHybridData;
    public final KNe memoryFormat;
    public final long[] shape;

    public Tensor(long[] jArr, KNe kNe) {
        checkShape(jArr);
        this.shape = Arrays.copyOf(jArr, jArr.length);
        this.memoryFormat = kNe;
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw AnonymousClass001.A0L(String.format(Locale.US, str, objArr));
        }
    }

    public static void checkShape(long[] jArr) {
        checkArgument(AnonymousClass001.A1T(jArr), "Shape must be not null", new Object[0]);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jArr.length) {
                return;
            }
            checkArgument(1BL.A1S((jArr[i2] > 0L ? 1 : (jArr[i2] == 0L ? 0 : -1))), "Shape elements must be non negative", new Object[0]);
            i = i2 + 1;
        }
    }

    public static void checkShapeAndDataCapacityConsistency(int i, long[] jArr) {
        checkShape(jArr);
        int length = jArr.length;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                long j = i2;
                checkArgument(AnonymousClass001.A1O((j > i ? 1 : (j == i ? 0 : -1))), "Inconsistent data capacity:%d and shape number elements:%d shape:%s", Integer.valueOf(i), Long.valueOf(j), Arrays.toString(jArr));
                return;
            } else {
                i2 = (int) (i2 * jArr[i4]);
                i3 = i4 + 1;
            }
        }
    }

    public static Tensor fromBlob(FloatBuffer floatBuffer, long[] jArr, KNe kNe) {
        boolean z = true;
        checkArgument(AnonymousClass001.A1T(floatBuffer), "Data buffer must be not null", new Object[0]);
        checkArgument(AnonymousClass001.A1T(jArr), "Shape must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(floatBuffer.capacity(), jArr);
        checkArgument(floatBuffer.isDirect(), "Data buffer must be direct (java.nio.ByteBuffer#allocateDirect)", new Object[0]);
        if (floatBuffer.order() != ByteOrder.nativeOrder()) {
            z = false;
        }
        checkArgument(z, "Data buffer must have native byte order (java.nio.ByteOrder#nativeOrder)", new Object[0]);
        return new MAu(floatBuffer, kNe, jArr);
    }

    public static Tensor fromBlob(float[] fArr, long[] jArr) {
        KNe kNe = KNe.CONTIGUOUS;
        boolean z = true;
        if (jArr == null) {
            z = false;
        }
        checkArgument(z, "Shape must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(fArr.length, jArr);
        checkShape(jArr);
        int length = jArr.length;
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                asFloatBuffer.put(fArr);
                return new MAu(asFloatBuffer, kNe, jArr);
            }
            i = (int) (i * jArr[i3]);
            i2 = i3 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r307.jniCode == r304) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.pytorch.Tensor nativeNewTensor(java.nio.ByteBuffer r301, long[] r302, int r303, int r304, com.facebook.jni.HybridData r305) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pytorch.Tensor.nativeNewTensor(java.nio.ByteBuffer, long[], int, int, com.facebook.jni.HybridData):org.pytorch.Tensor");
    }

    public abstract KMA dtype();

    public int dtypeJniCode() {
        return dtype().jniCode;
    }

    public float[] getDataAsFloatArray() {
        throw 0Pz.A07("Tensor of type ", AnonymousClass001.A0X(this), " cannot return data as float array.");
    }

    public abstract Buffer getRawDataBuffer();

    public int memoryFormatJniCode() {
        return this.memoryFormat.jniCode;
    }
}
