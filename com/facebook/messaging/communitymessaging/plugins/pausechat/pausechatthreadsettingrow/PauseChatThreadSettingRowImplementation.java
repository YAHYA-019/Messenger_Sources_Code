package com.facebook.messaging.communitymessaging.plugins.pausechat.pausechatthreadsettingrow;

import X.06Z;
import X.11T;
import X.1Br;
import X.7zT;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: PauseChatThreadSettingRowImplementation.class */
public final class PauseChatThreadSettingRowImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final MigColorScheme A05;

    public PauseChatThreadSettingRowImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme) {
        7zT.A1T(context, r303, fbUserSession);
        11T.A0F(migColorScheme, 5);
        this.A00 = context;
        this.A01 = r303;
        this.A04 = threadSummary;
        this.A02 = fbUserSession;
        this.A05 = migColorScheme;
        this.A03 = AbG.A0a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (r0.A1F() != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.Cug A00() {
        /*
            r301 = this;
            X.CQg r0 = X.CQg.A00()
            r302 = r0
            r0 = r301
            android.content.Context r0 = r0.A00
            r303 = r0
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A04
            r304 = r0
            r0 = r304
            boolean r0 = X.2oI.A03(r0)
            r305 = r0
            r0 = 2131962989(0x7f132c6d, float:1.9562719E38)
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L21
            r0 = 2131962971(0x7f132c5b, float:1.9562682E38)
            r306 = r0
        L21:
            r0 = r303
            r1 = r302
            r2 = r306
            X.CQg.A07(r0, r1, r2)
            X.BNV r0 = X.BNV.A0c
            r307 = r0
            r0 = r307
            r1 = r302
            X.CQg.A08(r0, r1)
            r0 = 2312842708(0x89db2dd4, double:1.1426961263E-314)
            r308 = r0
            r0 = r302
            r1 = r308
            r0.A00 = r1
            r0 = r304
            boolean r0 = X.2oI.A03(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L91
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
        L4f:
            r0 = r302
            r1 = r307
            r0.A0B = r1
            r0 = r301
            r1 = 83
            X.CZD r0 = X.CZD.A00(r0, r1)
            r307 = r0
            r0 = r302
            r1 = r307
            r0.A01 = r1
            X.2MQ r0 = X.2MQ.A0o
            r1 = r302
            r2 = 0
            X.CHv.A00(r0, r1, r2)
            X.1u3 r0 = X.C1u3.A1R
            r310 = r0
            X.CII r0 = new X.CII
            r304 = r0
            r0 = r304
            r1 = 0
            r2 = 0
            r3 = r310
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r302
            r1 = r304
            r0.A05 = r1
            X.Cug r0 = new X.Cug
            r307 = r0
            r0 = r307
            r1 = r302
            r0.<init>(r1)
            r0 = r307
            return r0
        L91:
            r0 = 1
            r311 = r0
            r0 = r304
            if (r0 == 0) goto Lb5
            r0 = r304
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb5
            r0 = r307
            boolean r0 = r0.A1F()
            r305 = r0
            r0 = 2131963003(0x7f132c7b, float:1.9562747E38)
            r306 = r0
            r0 = r305
            r1 = r311
            if (r0 == r1) goto Lb9
        Lb5:
            r0 = 2131962988(0x7f132c6c, float:1.9562717E38)
            r306 = r0
        Lb9:
            r0 = r303
            r1 = r306
            java.lang.String r0 = r0.getString(r1)
            r307 = r0
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.communitymessaging.plugins.pausechat.pausechatthreadsettingrow.PauseChatThreadSettingRowImplementation.A00():X.Cug");
    }
}
