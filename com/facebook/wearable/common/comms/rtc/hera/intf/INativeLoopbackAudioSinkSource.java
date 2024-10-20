package com.facebook.wearable.common.comms.rtc.hera.intf;

/* loaded from: INativeLoopbackAudioSinkSource.class */
public interface INativeLoopbackAudioSinkSource extends IRawAudioSource, IRawAudioSink {
    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void release();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void start();

    @Override // com.facebook.wearable.common.comms.rtc.hera.intf.IRawAudioSource
    void stop();
}
