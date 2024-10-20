package com.facebook.papaya.client.platform;

import X.AnonymousClass001;
import X.C0il;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: PlatformLog.class */
public final class PlatformLog {
    public static PlatformLogHandlerImpl A00;

    static {
        C0il.A0B("papaya");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.facebook.papaya.client.platform.PlatformLogHandlerImpl] */
    public static void A00() {
        synchronized (PlatformLog.class) {
            if (A00 == null) {
                A00 = new Object();
            }
        }
    }

    public static void A01(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(3, cls.getSimpleName(), AnonymousClass001.A0n(StringFormatUtil.formatStrLocaleSafe(str, objArr)).toString());
    }

    public static void A02(Class cls, String str, Object... objArr) {
        A00();
        PlatformLogHandlerImpl.nativeLog(1, cls.getSimpleName(), AnonymousClass001.A0n(StringFormatUtil.formatStrLocaleSafe(str, objArr)).toString());
    }
}
