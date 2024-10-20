package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.msysbanneractionhandler;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.2Zo;
import X.2Zy;
import X.2aI;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MessageRequestMsysBannerHandler.class */
public final class MessageRequestMsysBannerHandler {
    public ThreadSummary A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final 2aI A04;
    public final Context A05;
    public final String A06;

    public MessageRequestMsysBannerHandler(Context context, ThreadKey threadKey) {
        1BL.A1F(context, threadKey);
        this.A05 = context;
        this.A03 = threadKey;
        this.A02 = 1Bu.A01(context, 82763);
        this.A01 = 1Bu.A00(83025);
        this.A04 = 2Zy.A02(2Zo.A00());
        this.A06 = 7zR.A0s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r305 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.msysbanneractionhandler.MessageRequestMsysBannerHandler r301) {
        /*
            r0 = r301
            X.1Br r0 = r0.A01
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.Ac8 r0 = (X.C1266Ac8) r0
            r302 = r0
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A03
            r303 = r0
            r0 = r301
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L24
            r0 = r304
            X.1F9 r0 = r0.A0g
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L29
        L24:
            X.1F9 r0 = X.1F9.A0N
            r305 = r0
        L29:
            r0 = r301
            java.lang.String r0 = r0.A06
            r304 = r0
            r0 = r302
            r1 = r305
            r2 = r303
            r3 = r304
            r0.A02(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.msysbanneractionhandler.MessageRequestMsysBannerHandler.A00(com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.threadview.msysbanneractionhandler.MessageRequestMsysBannerHandler):void");
    }
}
