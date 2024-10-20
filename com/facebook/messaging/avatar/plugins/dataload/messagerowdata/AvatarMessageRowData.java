package com.facebook.messaging.avatar.plugins.dataload.messagerowdata;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.60I;
import X.60W;
import X.61W;
import X.61X;
import X.C01g;
import X.C01i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;

/* loaded from: AvatarMessageRowData.class */
public final class AvatarMessageRowData {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Message A04;
    public final 60I A05;
    public final 60W A06;
    public final C01i A07;
    public final C01i A08;
    public final Context A09;

    public AvatarMessageRowData(Context context, FbUserSession fbUserSession, Message message, 60I r305, 60W r306) {
        11T.A0F(context, 1);
        11T.A0F(message, 2);
        11T.A0F(r305, 3);
        11T.A0F(r306, 4);
        11T.A0F(fbUserSession, 5);
        this.A09 = context;
        this.A04 = message;
        this.A05 = r305;
        this.A06 = r306;
        this.A00 = fbUserSession;
        this.A02 = 1Bu.A01(context, 68073);
        this.A01 = 1Lm.A00(context, fbUserSession, 66452);
        this.A03 = 1Lm.A00(context, fbUserSession, 100213);
        this.A08 = C01g.A01(61W.A00);
        this.A07 = C01g.A01(61X.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r0.A01 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(com.facebook.messaging.avatar.plugins.dataload.messagerowdata.AvatarMessageRowData r301) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.avatar.plugins.dataload.messagerowdata.AvatarMessageRowData.A00(com.facebook.messaging.avatar.plugins.dataload.messagerowdata.AvatarMessageRowData):boolean");
    }
}
