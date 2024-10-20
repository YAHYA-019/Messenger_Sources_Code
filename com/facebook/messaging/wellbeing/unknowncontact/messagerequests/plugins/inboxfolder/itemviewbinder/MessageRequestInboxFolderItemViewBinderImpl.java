package com.facebook.messaging.wellbeing.unknowncontact.messagerequests.plugins.inboxfolder.itemviewbinder;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1Lm;
import X.2YQ;
import X.49C;
import X.C04I;
import X.C49A;
import X.C4Nz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: MessageRequestInboxFolderItemViewBinderImpl.class */
public final class MessageRequestInboxFolderItemViewBinderImpl {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Iw A07;
    public final 2YQ A08;
    public final C49A A09;
    public final String A0A;
    public final 06Z A0B;
    public final CallerContext A0C;

    public MessageRequestInboxFolderItemViewBinderImpl(06Z r302, FbUserSession fbUserSession, CallerContext callerContext, 1Iw r305, 2YQ r306, String str) {
        11T.A0F(r305, 1);
        11T.A0F(r302, 2);
        11T.A0F(r306, 3);
        11T.A0F(callerContext, 4);
        11T.A0F(str, 5);
        11T.A0F(fbUserSession, 6);
        this.A07 = r305;
        this.A0B = r302;
        this.A08 = r306;
        this.A0C = callerContext;
        this.A00 = fbUserSession;
        this.A01 = 1Bu.A00(67053);
        this.A04 = 1Bu.A00(82479);
        this.A02 = 1Bu.A00(33266);
        Context context = r305.A0D;
        11T.A0A(context);
        this.A03 = 1Bu.A01(context, 83021);
        this.A05 = 1Bu.A00(83025);
        this.A06 = 1Lm.A01(fbUserSession, 66674);
        C49A A01 = ((C4Nz) this.A02.A00.get()).A01(context, r302, fbUserSession, callerContext, str);
        this.A09 = A01;
        String obj = C04I.A00().toString();
        11T.A0A(obj);
        this.A0A = obj;
        ((49C) this.A01.A00.get()).A00.A00(A01);
    }
}
