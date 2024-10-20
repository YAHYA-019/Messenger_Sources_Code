package com.facebook.ffmpeg;

import X.0FI;
import java.nio.ByteBuffer;

/* loaded from: FFMpegAVStream.class */
public class FFMpegAVStream {
    public long mNativeContext;

    public FFMpegAVStream(long j) {
        this.mNativeContext = j;
    }

    private native void nativeFinalize();

    private native void nativeSetOrientationHint(int i);

    private native void nativeWriteFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer);

    public void finalize() {
        int A03 = 0FI.A03(938803378);
        nativeFinalize();
        0FI.A09(770821678, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r302 == 270) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOrientationHint(int r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L20
            r0 = 90
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L20
            r0 = 180(0xb4, float:2.52E-43)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L20
            r0 = 270(0x10e, float:3.78E-43)
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L22
        L20:
            r0 = 1
            r303 = r0
        L22:
            r0 = r303
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0By.A02(r0)
            r0 = r301
            r1 = r302
            r0.nativeSetOrientationHint(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegAVStream.setOrientationHint(int):void");
    }

    public void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        nativeWriteFrame(fFMpegBufferInfo, byteBuffer);
    }
}
