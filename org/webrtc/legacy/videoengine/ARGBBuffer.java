package org.webrtc.legacy.videoengine;

import java.nio.ByteBuffer;

/* loaded from: ARGBBuffer.class */
public class ARGBBuffer extends VideoFrameBuffer {
    public final int cropHeight;
    public final int cropWidth;
    public ByteBuffer data;

    public ARGBBuffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z) {
        super(i, i2, z);
        this.data = byteBuffer;
        this.cropWidth = i3;
        this.cropHeight = i4;
    }

    public ARGBBuffer(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        this(byteBuffer, i, i2, i, i2, z);
    }

    @Override // org.webrtc.legacy.videoengine.VideoFrameBuffer
    public /* bridge */ /* synthetic */ Object getBuffer() {
        return this.data;
    }

    @Override // org.webrtc.legacy.videoengine.VideoFrameBuffer
    public ByteBuffer getBuffer() {
        return this.data;
    }

    public int getCropHeight() {
        return this.cropHeight;
    }

    public int getCropWidth() {
        return this.cropWidth;
    }
}
