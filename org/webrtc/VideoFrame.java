package org.webrtc;

import X.AnonymousClass001;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: VideoFrame.class */
public class VideoFrame implements RefCounted {
    public final Buffer buffer;
    public final int rotation;
    public final long timestampNs;

    /* loaded from: VideoFrame$Buffer.class */
    public interface Buffer extends RefCounted {

        /* renamed from: org.webrtc.VideoFrame$Buffer$-CC, reason: invalid class name */
        /* loaded from: VideoFrame$Buffer$-CC.class */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(Buffer buffer) {
                return 0;
            }
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        I420Buffer toI420();
    }

    /* loaded from: VideoFrame$I420Buffer.class */
    public interface I420Buffer extends Buffer {

        /* renamed from: org.webrtc.VideoFrame$I420Buffer$-CC, reason: invalid class name */
        /* loaded from: VideoFrame$I420Buffer$-CC.class */
        public abstract /* synthetic */ class CC {
            public static int $default$getBufferType(I420Buffer i420Buffer) {
                return 1;
            }
        }

        @Override // org.webrtc.VideoFrame.Buffer
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* loaded from: VideoFrame$TextureBuffer.class */
    public interface TextureBuffer extends Buffer {

        /* loaded from: VideoFrame$TextureBuffer$Type.class */
        public enum Type {
            OES(36197),
            RGB(3553);

            public final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw AnonymousClass001.A0L("buffer not allowed to be null");
        }
        if (i % 90 != 0) {
            throw AnonymousClass001.A0L("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getHeight() : buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        return i == 0 ? buffer.getWidth() : buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
