package com.facebook.messaging.communitymessaging.plugins.memberactions.unmutememberfromgroupmenuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bn;
import X.1Br;
import X.1F9;
import X.1Iw;
import X.1Lm;
import X.2MQ;
import X.4YU;
import X.4YV;
import X.6EX;
import X.7zO;
import X.7zT;
import X.B0x;
import X.Bs5;
import X.C1rh;
import X.C1u3;
import X.CJH;
import X.DDq;
import X.DJY;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: UnmuteMemberFromGroupMenuItemImplementation.class */
public final class UnmuteMemberFromGroupMenuItemImplementation {
    public long A00;
    public long A01;
    public Long A02;
    public final Context A03;
    public final 06Z A04;
    public final Bs5 A05;
    public final DJY A06;
    public final MigColorScheme A07;
    public final User A08;
    public final 1Iw A09;

    public UnmuteMemberFromGroupMenuItemImplementation(Context context, 06Z r303, 1Iw r304, Bs5 bs5, DJY djy, MigColorScheme migColorScheme, User user) {
        7zT.A1W(context, r304, migColorScheme, user);
        1BL.A1G(djy, bs5);
        11T.A0F(r303, 7);
        this.A03 = context;
        this.A09 = r304;
        this.A07 = migColorScheme;
        this.A08 = user;
        this.A06 = djy;
        this.A05 = bs5;
        this.A04 = r303;
    }

    public final C1rh A00() {
        ThreadKey threadKey;
        Long A0l;
        Context context = this.A03;
        1Br A00 = 1Lm.A00(context, 4YV.A0F(context), 82391);
        1Bn.A0A(83102);
        Bs5 bs5 = this.A05;
        this.A00 = CJH.A00(bs5);
        long A01 = CJH.A01(bs5);
        this.A01 = A01;
        if (bs5.A01 == 1F9.A0B) {
            ThreadSummary threadSummary = bs5.A02;
            if (threadSummary == null || (threadKey = threadSummary.A0n) == null || (A0l = 4YU.A0l(threadKey)) == null) {
                throw 1BK.A0h();
            }
            this.A02 = A0l;
        }
        1Iw r0 = this.A09;
        Context context2 = r0.A0D;
        int i = 2131967671;
        if (6EX.A00.A04(A01)) {
            i = 2131967672;
        }
        C1rh A002 = B0x.A00(2MQ.A25, C1u3.A4L, r0, 7zO.A0U(new DDq(A00, this, 9)), this.A07, context2.getString(i));
        11T.A0A(A002);
        return A002;
    }
}
