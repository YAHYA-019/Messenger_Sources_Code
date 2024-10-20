package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: NV12Buffer.class */
public class NV12Buffer implements VideoFrame.Buffer {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final ByteBuffer A04;
    public final RefCountDelegate A05 = new RefCountDelegate(null);

    public NV12Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A04 = byteBuffer;
    }

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer A00 = JavaI420Buffer.A00(i5, i6);
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.A04, this.A03, this.A00, this.A02, this.A01, A00.getDataY(), A00.getStrideY(), A00.getDataU(), A00.getStrideU(), A00.getDataV(), A00.getStrideV());
        return A00;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return 0;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.A00;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.A03;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.A05.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.A05.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i = this.A03;
        int i2 = this.A00;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }
}
