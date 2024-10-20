package com.facebook.messaging.communitymessaging.plugins.externalsharehscrollbuttons.qrcode;

import X.06Z;
import X.11T;
import X.1Fw;
import X.1Iw;
import X.2MQ;
import X.AVI;
import X.C02413v4;
import X.C83g;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: QRCodeHscrollButtonImplementation.class */
public final class QRCodeHscrollButtonImplementation {
    public final 06Z A00;
    public final ThreadSummary A01;
    public final String A02;
    public final String A03;
    public final FbUserSession A04;
    public final MigColorScheme A05;

    public QRCodeHscrollButtonImplementation(06Z r302, FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme, String str, String str2) {
        11T.A0F(migColorScheme, 1);
        this.A05 = migColorScheme;
        this.A00 = r302;
        this.A02 = str;
        this.A01 = threadSummary;
        this.A03 = str2;
        this.A04 = fbUserSession;
    }

    public final C02413v4 A00(1Iw r302) {
        FbUserSession A01 = 1Fw.A01(r302.A0D);
        C83g A00 = C02413v4.A00(r302);
        A00.A2Z(2MQ.A2k);
        A00.A2Y();
        A00.A2e(this.A05);
        String A0D = r302.A0E.A0D(2131964025);
        if (A0D == null) {
            A0D = "";
        }
        C83g.A07(A00, A0D);
        C83g.A08(A00, new AVI(43, A01, r302, this));
        return A00.A2V();
    }
}
