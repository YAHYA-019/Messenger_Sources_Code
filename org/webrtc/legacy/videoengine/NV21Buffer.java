package org.webrtc.legacy.videoengine;

/* loaded from: NV21Buffer.class */
public class NV21Buffer extends VideoFrameBuffer {
    public final int mCropHeight;
    public final int mCropWidth;
    public final byte[] mData;
    public final int mRotation;
    public final boolean mShouldCrop;
    public final boolean mShouldMirror;

    public NV21Buffer(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        super(i, i2, z2);
        this.mData = bArr;
        this.mCropWidth = i3;
        this.mCropHeight = i4;
        this.mRotation = i5;
        this.mShouldMirror = z;
        this.mShouldCrop = z3;
    }

    public NV21Buffer(byte[] bArr, int i, int i2, int i3, boolean z, boolean z2) {
        this(bArr, i, i2, i, i2, i3, z, z2, false);
    }

    @Override // org.webrtc.legacy.videoengine.VideoFrameBuffer
    public Object getBuffer() {
        return null;
    }

    public int getCropHeight() {
        return this.mCropHeight;
    }

    public int getCropWidth() {
        return this.mCropWidth;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getLength() {
        return this.mData.length;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public boolean getShouldCrop() {
        return this.mShouldCrop;
    }

    public boolean getShouldMirror() {
        return this.mShouldMirror;
    }
}
