package org.pytorch.torchvision;

import X.C0gh;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: TensorImageUtils$NativePeer.class */
public class TensorImageUtils$NativePeer {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.0gc] */
    static {
        if (!C0gh.A01()) {
            C0gh.A00(new Object());
        }
        C0gh.A02("pytorch_vision_jni");
    }

    public static native void imageYUV420CenterCropToFloatBuffer(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float[] fArr, float[] fArr2, Buffer buffer, int i10, int i11);
}
