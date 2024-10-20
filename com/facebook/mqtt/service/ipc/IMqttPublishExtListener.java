package com.facebook.mqtt.service.ipc;

import android.os.IInterface;

/* loaded from: IMqttPublishExtListener.class */
public interface IMqttPublishExtListener extends IInterface {
    void onPublishAttempt(int i, int i2, int i3, int i4, int i5);

    void onPublishCompleted(int i, int i2, int i3, int i4, int i5, boolean z, int i6);
}
