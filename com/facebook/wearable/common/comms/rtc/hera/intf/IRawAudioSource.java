package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.JDb;

/* loaded from: IRawAudioSource.class */
public interface IRawAudioSource extends JDb {
    void release();

    void start();

    void stop();
}
