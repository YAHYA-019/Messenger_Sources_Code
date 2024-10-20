package com.facebook.messaging.translation.piiredaction;

import X.9DX;
import X.C0il;

/* loaded from: PiiRedaction.class */
public final class PiiRedaction {
    public static final 9DX Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9DX] */
    static {
        C0il.A0B("piiredaction");
    }

    public static final native String getRedactedMessage(String str, String str2);

    public static final native String getTranslatedMessageWithRedactedContent(String str, String str2);
}
