package org.webrtc;

import X.0Pz;
import X.AnonymousClass001;
import java.nio.ByteBuffer;
import org.webrtc.JniCommon;
import org.webrtc.VideoFrame;

/* loaded from: JavaI420Buffer.class */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ByteBuffer A05;
    public final ByteBuffer A06;
    public final ByteBuffer A07;
    public final RefCountDelegate A08;

    public JavaI420Buffer(Runnable runnable, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        this.A04 = i;
        this.A00 = i2;
        this.A07 = byteBuffer;
        this.A05 = byteBuffer2;
        this.A06 = byteBuffer3;
        this.A03 = i3;
        this.A01 = i4;
        this.A02 = i5;
        this.A08 = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer A00(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i4 * 2 * i3) + i5);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i5);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i5);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i7 + i6);
        return new JavaI420Buffer(new Runnable() { // from class: X.Iv4
            public static final String __redex_internal_original_name = "JavaI420Buffer$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        }, slice, slice2, nativeAllocateByteBuffer.slice(), i, i2, i, i4, i4);
    }

    public static JavaI420Buffer A01(Runnable runnable, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw AnonymousClass001.A0L("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw AnonymousClass001.A0L("Data buffers must be direct byte buffers.");
        }
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = byteBuffer2.slice();
        ByteBuffer slice3 = byteBuffer3.slice();
        int i6 = (i + 1) / 2;
        int i7 = (i2 + 1) / 2;
        A03(i, i2, slice, i3);
        A03(i6, i7, slice2, i4);
        A03(i6, i7, slice3, i5);
        return new JavaI420Buffer(runnable, slice, slice2, slice3, i, i2, i3, i4, i5);
    }

    public static JavaI420Buffer A02(final VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 != i5 || i4 != i6) {
            JavaI420Buffer A00 = A00(i5, i6);
            nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, A00.getDataY(), A00.getStrideY(), A00.getDataU(), A00.getStrideU(), A00.getDataV(), A00.getStrideV(), i5, i6);
            return A00;
        }
        ByteBuffer dataY = i420Buffer.getDataY();
        ByteBuffer dataU = i420Buffer.getDataU();
        ByteBuffer dataV = i420Buffer.getDataV();
        dataY.position(i + (i420Buffer.getStrideY() * i2));
        int i7 = i / 2;
        int i8 = i2 / 2;
        dataU.position((i420Buffer.getStrideU() * i8) + i7);
        dataV.position(i7 + (i8 * i420Buffer.getStrideV()));
        i420Buffer.retain();
        ByteBuffer slice = dataY.slice();
        int strideY = i420Buffer.getStrideY();
        ByteBuffer slice2 = dataU.slice();
        int strideU = i420Buffer.getStrideU();
        return A01(new Runnable() { // from class: X.Iv3
            public static final String __redex_internal_original_name = "JavaI420Buffer$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                VideoFrame.I420Buffer.this.release();
            }
        }, slice, slice2, dataV.slice(), i5, i6, strideY, strideU, i420Buffer.getStrideV());
    }

    public static void A03(int i, int i2, ByteBuffer byteBuffer, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() < i4) {
            throw AnonymousClass001.A0L(0Pz.A0C(i4, byteBuffer.capacity(), "Buffer must be at least ", " bytes, but was "));
        }
    }

    public static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return A02(this, i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer, org.webrtc.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return 1;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.A05.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.A06.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.A07.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.A00;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.A01;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.A02;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.A03;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.A04;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.A08.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.A08.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
