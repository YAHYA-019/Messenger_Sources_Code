package com.facebook.messaging.communitymessaging.plugins.externalsharehscrollbuttons.sharetowhatsapp;

import X.11T;
import X.1Iw;
import X.2MQ;
import X.AR7;
import X.C02413v4;
import X.C1qo;
import X.C83g;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ShareToWhatsAppHscrollButtonImplementation.class */
public final class ShareToWhatsAppHscrollButtonImplementation {
    public final ThreadSummary A00;
    public final String A01;
    public final String A02;
    public final MigColorScheme A03;

    public ShareToWhatsAppHscrollButtonImplementation(ThreadSummary threadSummary, MigColorScheme migColorScheme, String str, String str2) {
        11T.A0F(migColorScheme, 1);
        this.A03 = migColorScheme;
        this.A00 = threadSummary;
        this.A01 = str;
        this.A02 = str2;
    }

    public final C02413v4 A00(1Iw r302) {
        C83g A00 = C02413v4.A00(r302);
        A00.A2Z(2MQ.A0F);
        A00.A2Y();
        A00.A2e(this.A03);
        C1qo c1qo = r302.A0E;
        String A0D = c1qo.A0D(2131965845);
        if (A0D == null) {
            A0D = "";
        }
        C83g.A07(A00, A0D);
        A00.A2f(c1qo.A0D(2131968143));
        C83g.A08(A00, new AR7(r302, this, 49));
        return A00.A2V();
    }
}
