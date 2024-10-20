package com.facebook.messaging.communitymessaging.plugins.externalsharehscrollbuttons.sharetotelegram;

import X.C3o5;
import X.EnumC3499Mfu;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ShareToTelegramHscrollButtonImplementation.class */
public final class ShareToTelegramHscrollButtonImplementation {
    public final EnumC3499Mfu A00;
    public final ThreadSummary A01;
    public final MigColorScheme A02;
    public final String A03;
    public final String A04;

    public ShareToTelegramHscrollButtonImplementation(EnumC3499Mfu enumC3499Mfu, ThreadSummary threadSummary, MigColorScheme migColorScheme, String str, String str2) {
        C3o5.A0k(migColorScheme, 1, enumC3499Mfu);
        this.A02 = migColorScheme;
        this.A01 = threadSummary;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = enumC3499Mfu;
    }
}
