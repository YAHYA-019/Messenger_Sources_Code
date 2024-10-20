package org.webrtc;

import X.0Pz;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* loaded from: EncodedImage.class */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    public final RefCountDelegate refCountDelegate;
    public final int rotation;

    /* loaded from: EncodedImage$Builder.class */
    public class Builder {
        public ByteBuffer buffer;
        public long captureTimeNs;
        public int encodedHeight;
        public int encodedWidth;
        public FrameType frameType;
        public Integer qp;
        public Runnable releaseCallback;
        public int rotation;

        public Builder() {
        }

        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            this.releaseCallback = null;
            return this;
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }
    }

    /* loaded from: EncodedImage$FrameType.class */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        public final int nativeIndex;

        FrameType(int i) {
            this.nativeIndex = i;
        }

        public static FrameType fromNativeIndex(int i) {
            FrameType[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw 0Pz.A04("Unknown native frame type: ", i);
                }
                FrameType frameType = values[i3];
                if (frameType.getNative() == i) {
                    return frameType;
                }
                i2 = i3 + 1;
            }
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i, int i2, long j, FrameType frameType, int i3, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType;
        this.rotation = i3;
        this.completeFrame = true;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.webrtc.EncodedImage$Builder, java.lang.Object] */
    public static Builder builder() {
        return new Object();
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }
}
