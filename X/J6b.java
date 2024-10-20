package X;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.RefCountDelegate;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* loaded from: J6b.class */
public final class J6b implements VideoFrame.TextureBuffer {
    public final int A00;
    public final Matrix A01;
    public final Handler A02;
    public final VideoFrame.TextureBuffer.Type A03;
    public final Hhy A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final RefCountDelegate A09;
    public final JHS A0A;

    public J6b(Matrix matrix, Handler handler, JHS jhs, VideoFrame.TextureBuffer.Type type, Hhy hhy, int i, int i2, int i3, int i4, int i5) {
        this.A07 = i;
        this.A06 = i2;
        this.A08 = i3;
        this.A05 = i4;
        this.A03 = type;
        this.A00 = i5;
        this.A01 = matrix;
        this.A02 = handler;
        this.A04 = hhy;
        this.A09 = new RefCountDelegate(new IzL(jhs, this));
        this.A0A = jhs;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix A0F = GOn.A0F();
        int i7 = this.A05;
        int i8 = i7 - (i2 + i4);
        float f = this.A08;
        float f2 = i / f;
        float f3 = i8;
        float f4 = i7;
        A0F.preTranslate(f2, f3 / f4);
        A0F.preScale(i3 / f, i4 / f4);
        int A04 = GOn.A04(this.A07 * i3, f);
        int A042 = GOn.A04(this.A06 * i4, f4);
        Matrix matrix = new Matrix(this.A01);
        matrix.preConcat(A0F);
        retain();
        return new J6b(matrix, this.A02, new J6R(this), this.A03, this.A04, A04, A042, i5, i6, this.A00);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public /* synthetic */ int getBufferType() {
        return 0;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.A05;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.A00;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.A01;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.A03;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.A08;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.A09.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.A09.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.A02, (Callable) new J5U(this, 41));
    }
}
