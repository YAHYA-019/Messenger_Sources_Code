package org.webrtc.legacy.videoengine;

/* loaded from: VideoFrameBuffer.class */
public abstract class VideoFrameBuffer {
    public int height;
    public final boolean preserveAspectRatio;
    public int width;

    public VideoFrameBuffer(int i, int i2, boolean z) {
        this.width = i;
        this.height = i2;
        this.preserveAspectRatio = z;
    }

    public abstract Object getBuffer();

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean preserveAspectRatio() {
        return this.preserveAspectRatio;
    }
}
