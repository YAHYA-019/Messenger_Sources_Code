package com.facebook.rtc.chatd.utils;

import X.C3Pa;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.wamsys.wcp.MultiwayNotificationResult;
import java.util.Map;

/* loaded from: OneTraceLogging.class */
public class OneTraceLogging {
    static {
        C3Pa.A00();
    }

    public native void logOnRSChatDHandlerCallback(String str, AccountSession accountSession, MsysError msysError, Map map);

    public native void logOnRSChatDHandlerNotification(AccountSession accountSession, MultiwayNotificationResult multiwayNotificationResult, Map map);

    public native void spotLogSend(String str, String str2, String str3);
}
