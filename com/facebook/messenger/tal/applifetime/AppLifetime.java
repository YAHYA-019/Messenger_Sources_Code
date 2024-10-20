package com.facebook.messenger.tal.applifetime;

import X.1sV;
import X.C0il;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.System;

/* loaded from: AppLifetime.class */
public class AppLifetime {
    public static boolean isStarted;

    static {
        synchronized (1sV.class) {
            if (!1sV.A00) {
                C0il.A0B("messengerapplifetimejni");
                1sV.A00 = true;
            }
        }
    }

    public static native void appEndNative(System system);

    public static native void appStartNative(System system, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public static native void mailboxDeleteNative(System system);

    public static native void mailboxInitNative(System system, Mailbox mailbox);
}
