package com.facebook.wearable.common.comms.hera.shared.p000native;

import X.11T;
import com.facebook.wearable.common.comms.rtc.hera.intf.IManagedByteBufferPool;

/* loaded from: PcmAudioBuffer.class */
public final class PcmAudioBuffer {
    public final IManagedByteBufferPool.IBuffer buffer;
    public final int numberOfChannels;
    public final int sampleRate;

    public PcmAudioBuffer(IManagedByteBufferPool.IBuffer iBuffer, int i, int i2) {
        11T.A0F(iBuffer, 1);
        this.buffer = iBuffer;
        this.sampleRate = i;
        this.numberOfChannels = i2;
    }

    public final IManagedByteBufferPool.IBuffer getBuffer() {
        return this.buffer;
    }

    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }
}
