package com.facebook.ffmpeg;

import android.media.MediaCodec;

/* loaded from: FFMpegBufferInfo.class */
public class FFMpegBufferInfo {
    public int flags;
    public boolean largePtsTimeFix = false;
    public int offset;
    public long presentationTimeUs;
    public int size;

    public void setFrom(MediaCodec.BufferInfo bufferInfo) {
        this.offset = bufferInfo.offset;
        this.size = bufferInfo.size;
        this.presentationTimeUs = bufferInfo.presentationTimeUs;
        this.flags = bufferInfo.flags;
        this.largePtsTimeFix = false;
    }
}
