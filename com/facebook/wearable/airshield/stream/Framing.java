package com.facebook.wearable.airshield.stream;

import X.11T;
import X.C0il;
import X.DKB;
import X.JQy;
import X.QqD;
import X.R3q;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: Framing.class */
public final class Framing {
    public static final R3q Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.R3q, java.lang.Object] */
    static {
        C0il.A0B("airshield_light_mbed_jni");
    }

    public Framing(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }

    public /* synthetic */ Framing(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    private final native int cipherPayloadSizeNative(ByteBuffer byteBuffer, int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native int lastErrorNative();

    /* JADX INFO: Access modifiers changed from: private */
    public final native int outerFrameSizeNative(int i);

    private final native int packNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private final native int unpackNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public final QqD pack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        QqD qqD;
        11T.A0H(byteBuffer, byteBuffer2);
        int outerFrameSizeNative = outerFrameSizeNative(byteBuffer.remaining());
        if (byteBuffer2.remaining() < outerFrameSizeNative) {
            qqD = QqD.A02;
        } else {
            int packNative = packNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
            if (packNative != -1) {
                JQy.A1V(byteBuffer, packNative);
                JQy.A1V(byteBuffer2, outerFrameSizeNative);
                return QqD.A07;
            }
            int lastErrorNative = lastErrorNative();
            QqD[] values = QqD.values();
            int length = values.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    throw new NoSuchElementException(DKB.A00(6));
                }
                qqD = values[i2];
                if (qqD.rawValue == lastErrorNative) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return qqD;
    }

    public final QqD unpack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        QqD qqD;
        11T.A0H(byteBuffer, byteBuffer2);
        if (byteBuffer2.remaining() < cipherPayloadSizeNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            qqD = QqD.A02;
        } else {
            int unpackNative = unpackNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
            if (unpackNative != -1) {
                byteBuffer.position(byteBuffer.position() + outerFrameSizeNative(unpackNative));
                JQy.A1V(byteBuffer2, unpackNative);
                return QqD.A07;
            }
            int lastErrorNative = lastErrorNative();
            QqD[] values = QqD.values();
            int length = values.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    throw new NoSuchElementException(DKB.A00(6));
                }
                qqD = values[i2];
                if (qqD.rawValue == lastErrorNative) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return qqD;
    }
}
