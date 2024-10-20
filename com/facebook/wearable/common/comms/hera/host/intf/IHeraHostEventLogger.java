package com.facebook.wearable.common.comms.hera.host.intf;

import java.nio.ByteBuffer;

/* loaded from: IHeraHostEventLogger.class */
public interface IHeraHostEventLogger {
    void handleLoggingEventMessage(int i, ByteBuffer byteBuffer, String str);

    void handleUserActionEventMessage(String str, String str2);

    void handleVideoActionEventMessage(String str, String str2);
}
