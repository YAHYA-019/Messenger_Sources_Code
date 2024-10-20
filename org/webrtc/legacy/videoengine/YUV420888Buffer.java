package org.webrtc.legacy.videoengine;

import java.nio.ByteBuffer;

/* loaded from: YUV420888Buffer.class */
public class YUV420888Buffer extends VideoFrameBuffer {
    public final int mCropHeight;
    public final int mCropWidth;
    public final int mDeviceRotationDegrees;
    public final boolean mShouldCrop;
    public final boolean mShouldMirror;
    public final ByteBuffer mUBuffer;
    public final int mUStride;
    public final int mUvPixelStride;
    public final ByteBuffer mVBuffer;
    public final int mVStride;
    public final ByteBuffer mYBuffer;
    public final int mYStride;

    public YUV420888Buffer(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, boolean z3) {
        super(i5, i6, z2);
        this.mYBuffer = byteBuffer;
        this.mUBuffer = byteBuffer2;
        this.mVBuffer = byteBuffer3;
        this.mYStride = i;
        this.mUStride = i2;
        this.mVStride = i3;
        this.mUvPixelStride = i4;
        this.mDeviceRotationDegrees = i9;
        this.mShouldMirror = z;
        this.mCropWidth = i7;
        this.mCropHeight = i8;
        this.mShouldCrop = z3;
    }

    @Override // org.webrtc.legacy.videoengine.VideoFrameBuffer
    public /* bridge */ /* synthetic */ Object getBuffer() {
        return null;
    }

    @Override // org.webrtc.legacy.videoengine.VideoFrameBuffer
    public ByteBuffer getBuffer() {
        return null;
    }

    public int getCropHeight() {
        return this.mCropHeight;
    }

    public int getCropWidth() {
        return this.mCropWidth;
    }

    public int getDeviceRotationDegrees() {
        return this.mDeviceRotationDegrees;
    }

    public boolean getShouldCrop() {
        return this.mShouldCrop;
    }

    public boolean getShouldMirror() {
        return this.mShouldMirror;
    }

    public ByteBuffer getUBuffer() {
        return this.mUBuffer;
    }

    public int getUStride() {
        return this.mUStride;
    }

    public int getUvPixelStride() {
        return this.mUvPixelStride;
    }

    public ByteBuffer getVBuffer() {
        return this.mVBuffer;
    }

    public int getVStride() {
        return this.mVStride;
    }

    public ByteBuffer getYBuffer() {
        return this.mYBuffer;
    }

    public int getYStride() {
        return this.mYStride;
    }
}
