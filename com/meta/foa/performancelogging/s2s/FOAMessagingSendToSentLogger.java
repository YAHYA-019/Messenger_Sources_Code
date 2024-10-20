package com.meta.foa.performancelogging.s2s;

import X.7Jg;
import X.7T2;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

/* loaded from: FOAMessagingSendToSentLogger.class */
public interface FOAMessagingSendToSentLogger extends FOAMessagingPerformanceLogger {
    public static final 7T2 Companion = 7T2.A00;
    public static final 7Jg FOA_MARKER = new 7Jg(668676445, "MESSAGE_SEND_TO_SENT");

    void onEndFlowSucceed();

    void onEndFlowSucceed(String str);

    void onStartFlow();
}
